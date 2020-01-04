package cn.erp.controller;

import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.erp.dto.ExcelGoodsByTimeAndGys;
import cn.erp.dto.ExcelOrderNumById;
import cn.erp.pojo.TblSupplier;
import cn.erp.service.GoodsService;
import cn.erp.service.SupplierService;

/**
 * 报表中心
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value="/excel")
public class ExcelController {

	
	@Autowired
	private SupplierService supplierService;
	@Autowired
	private GoodsService goodsService;
	
	
	/**
	 * 进货报表列表页面
	 * @param model
	 * @param starttimes
	 * @param endtimes
	 * @param gysuuid
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/index.do")
	public String excelIndex(ModelMap model,String starttimes,String endtimes,Long gysuuid) throws Exception{
		//所有供应商
		List<TblSupplier> suppliers = supplierService.selAllSupplier();
		model.addAttribute("suppliers", suppliers);
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		Long starttime=null;
		Long endtime=null;
		if(StringUtils.isNotBlank(starttimes)){
			starttime = dateFormat.parse(starttimes).getTime();
		}
		if(StringUtils.isNotBlank(endtimes)){
			endtime = dateFormat.parse(endtimes).getTime();
		}
		//TblSupplier supplier = null;  1422782442006
		//if(StringUtils.isNotBlank(gysname)){  1422782485205
		//	 supplier = supplierService.getGysByName(gysname);
		//}
		//Long gysuuid =null;
		//if(supplier != null){
		//	 gysuuid = supplier.getUuid();
		//}
		
		if(gysuuid != null){
			//报表，根据订单时间，供应商uuid查询 商品
			List<ExcelGoodsByTimeAndGys> excelGoods=goodsService.selExcelGoodsByTimeAndGys(gysuuid,starttime,endtime);
			model.addAttribute("excelGoods", excelGoods);
		}
		model.addAttribute("starttimes", starttimes);
		model.addAttribute("endtimes", endtimes);
		model.addAttribute("gysuuid", gysuuid);
		return "bill/in/inGoods"; 
	}
	
	//详情查询，报表，根据商品id查询订单num，订单时间//暂时不用!
	@RequestMapping(value = "/excelDetails.do")
	public Object excelDetails(Long goodsuuid,HttpServletRequest request,HttpServletResponse response) throws Exception{
		response.setContentType("text/html;charset=UTF-8");
		List<ExcelOrderNumById> orderNums=goodsService.excelDetails(goodsuuid);
		PrintWriter writer = response.getWriter();
		writer.print(orderNums);
		writer.flush();
		writer.close();
		return null;
	}
	
	//excel导出
	@RequestMapping(value = "/exportExcel.do")
	public void exportExcel(String starttimes,String endtimes,Long gysuuid,HttpServletResponse response) throws Exception{
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		Long starttime=null;
		Long endtime=null;
		if(StringUtils.isNotBlank(starttimes)){
			starttime = dateFormat.parse(starttimes).getTime();
		}
		if(StringUtils.isNotBlank(endtimes)){
			endtime = dateFormat.parse(endtimes).getTime();
		}
		List<ExcelGoodsByTimeAndGys> excelGoods=null;
		if(gysuuid != null){
			//报表，根据订单时间，供应商uuid查询 商品
			excelGoods=goodsService.selExcelGoodsByTimeAndGys(gysuuid,starttime,endtime);
		}
		//导出
		try {
			//HttpServletResponse response = ServletActionContext.getResponse();
			response.setContentType("application/x-execl");
			response.setHeader("Content-Disposition", "attachment;filename=" + new String("商品列表.xls".getBytes(), "ISO-8859-1"));
			ServletOutputStream outputStream = response.getOutputStream();
			goodsService.exportExcel(excelGoods, outputStream);
			if(outputStream != null){
				outputStream.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
}

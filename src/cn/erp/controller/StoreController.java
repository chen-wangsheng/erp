package cn.erp.controller;
/**
 * 仓库
 */
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.erp.dto.OperDetailsDto;
import cn.erp.dto.OrdernumAndGdr;
import cn.erp.dto.StoreByGlynameGoodsname;
import cn.erp.dto.StoreDto;
import cn.erp.pojo.TblEmp;
import cn.erp.pojo.TblOrder;
import cn.erp.service.EmpService;
import cn.erp.service.TblStoreService;

@Controller
@RequestMapping(value = "/store")
public class StoreController {

	@Autowired
	private TblStoreService storeService;
	@Autowired
	private EmpService empService;
	
	
	
	//仓库列表//待修改
	@RequestMapping(value = "/storeList.do")
	public Object getTblStore(ModelMap model,String glyname,String name){
		Long empuuid =null;
		if(StringUtils.isNotBlank(glyname)){
			 empuuid = empService.selempByName(glyname);
		}
		
		
		List<StoreDto> StoreDtos = storeService.selAllStore(empuuid,name);
		
		model.addAttribute("StoreDtos", StoreDtos);
		return "store/list";
	}
	
	
	//到新建仓库页面
	@RequestMapping(value="/addStore.do")
	public String addStore(ModelMap model){
		List<TblEmp> emps = empService.getAllEmp();
		model.addAttribute("emps", emps);
		return "store/input";
	}
	
	//添加仓库
	@RequestMapping(value="/save.do")
	public String save(Long empUuid,String name, String address){
		storeService.save(empUuid,name,address);
		return "redirect:/store/storeList.do";
	}
	//到修改页面//待完善前台el
	@RequestMapping(value="/toEdit.do")
	public String toEdit(Long uuid,ModelMap model){
		StoreDto storeDto = storeService.selStoreById(uuid);
		//查询出所有雇员
		List<TblEmp> emps = empService.getAllEmp();
		model.addAttribute("emps", emps);
		model.addAttribute("storeDto", storeDto);
		return "store/edit";
	}
	
	//修改
	@RequestMapping(value="/edit.do")
	public String edit(Long empUuid,Long uuid,String name, String address,ModelMap model){
		
		storeService.edit(empUuid,uuid,name,address);
		
		return "redirect:/store/storeList.do";
	}
	//删除
	@RequestMapping(value="/delete.do")
	public void delete(Long uuid,HttpServletRequest request,HttpServletResponse response) throws IOException{
		String flag="ok";
		response.setContentType("text/html;charset=UTF-8");
		storeService.delete(uuid);
		response.getWriter().print(flag);
		response.getWriter().flush();
		response.getWriter().close();
		
	}

			//库存查询
			@RequestMapping(value="/storeQuery.do")
			public String index(String storeName,String glyName,String goodsName,ModelMap model){
				boolean flag=false;
				/*if(StringUtils.isNotBlank(storeName)){
					flag=true;
				}
				if(StringUtils.isNotBlank(goodsName)){
					flag=true;
				}
				if(StringUtils.isNotBlank(glyName)){
					flag=true;
				}*/
				//if(flag){
					List<StoreByGlynameGoodsname>infos=storeService.selStoreByGlynameGoodsname(storeName,glyName,goodsName);
					model.addAttribute("infos", infos);
				//}
					model.addAttribute("storeName", storeName);
					model.addAttribute("glyName", glyName);
					model.addAttribute("goodsName", goodsName);
					return "store/detail/list";
				}
			
			//入库
			@RequestMapping(value="/storeIn.do")
			public String in(String gdrName,String orderNum,ModelMap model){
				Long empUuid =null;
				if(StringUtils.isNotBlank(gdrName)){
					 empUuid = empService.selOrderByGdrname(gdrName);
				}
				List<OrdernumAndGdr> orders = storeService.selOrdernumAndGdr(empUuid,orderNum);
				model.addAttribute("orders", orders);
				model.addAttribute("gdrName", gdrName);
				model.addAttribute("orderNum", orderNum);
					return "store/in/list";
				}

			//入库详情
			@RequestMapping(value="/inDetails.do")
			public String inDetails(Long uuid){
				
				return "store/in/inDetail";
			}
			
			
			//仓库操作详情
			@RequestMapping(value="/storeOper.do")
			public String oper(ModelMap model,Integer cztype,String ckname,String czrname,String goodsname,String starttimes,String endtimes) throws Exception{
				SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
				Long starttime=null;
				if(StringUtils.isNotBlank(starttimes)){
					starttime= dateFormat.parse(starttimes).getTime();
				}
				
				Long endtime=null;
				if(StringUtils.isNotBlank(endtimes)){
					endtime=dateFormat.parse(endtimes).getTime();
				}
				
				Long empuuid =null;//操作人
				if(StringUtils.isNotBlank(czrname)){
					 empuuid = empService.selempByName(czrname);
				}
				
				List<OperDetailsDto> oper=storeService.selOperDetails(ckname,cztype,starttime,endtime,empuuid,goodsname);
				model.addAttribute("oper", oper);
					return "store/oper/list";
				}
	
	
	
	
	
}

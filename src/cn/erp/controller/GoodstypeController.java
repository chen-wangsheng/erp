package cn.erp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.erp.dto.GoodstypeDto;
import cn.erp.pojo.TblGoodstype;
import cn.erp.pojo.TblSupplier;
import cn.erp.service.GoodstypeService;
import cn.erp.service.SupplierService;

/**
 * 商品类别
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value="/goodstype")
public class GoodstypeController {

	
	@Autowired
	private GoodstypeService goodstypeService;
	@Autowired
	private SupplierService supplierService;
	
		//商品类别列表页面
		@RequestMapping(value="goodstypeList.do")
		public String goodstypeList(String name,Long gysname,ModelMap model){
			 List<GoodstypeDto> goodstypes = goodstypeService.selGoodstype(name, gysname);
			 //获得所有供应商
			 List<TblSupplier> suppliers = supplierService.selAllSupplier();
			 model.addAttribute("suppliers", suppliers);
			model.addAttribute("goodstypes", goodstypes);
			model.addAttribute("gysname", gysname);
			model.addAttribute("name", name);
			return "goodstype/list";
		}
	
		//到添加页面
		@RequestMapping(value="toGoodstypeAdd.do")
		public String toGoodstypeAdd(ModelMap model){
			 List<TblSupplier> suppliers = supplierService.selAllSupplier();
			 model.addAttribute("suppliers", suppliers);
			return "goodstype/input";
		}
		//添加供应商类别
		@RequestMapping(value="addGoodstype.do")
		public String addGoodstype(ModelMap model,String name, Long supplieruuid){
			goodstypeService.addGoodstype(name,supplieruuid);
			return "redirect:/goodstype/goodstypeList.do";
		}
		//到修改页面供应商类别
		@RequestMapping(value="toGoodstypeEdit.do")		
		public String toGoodstypeEdit(ModelMap model,Long uuid){
			TblGoodstype goodstypes = goodstypeService.selById(uuid);
			model.addAttribute("goodstypes", goodstypes);
			 //获得所有供应商
			 List<TblSupplier> suppliers = supplierService.selAllSupplier();
			 model.addAttribute("suppliers", suppliers);
			return "goodstype/edit";
		}		
		//修改
		@RequestMapping(value="editGoodstype.do")		
		public String editGoodstype(ModelMap model,Long uuid,String name,Long supplieruuid){
			 goodstypeService.editGoodstype(uuid,name,supplieruuid);
			return "redirect:/goodstype/goodstypeList.do";
		}	
		//删除
		@RequestMapping(value="delete.do")	
		public void delete(ModelMap model,Long uuid,HttpServletRequest request, HttpServletResponse response) throws Exception{
			String flag="ok";
			response.setContentType("text/html;charset=UTF-8");
			 goodstypeService.delete(uuid);
			 response.getWriter().print(flag);
				response.getWriter().flush();
				response.getWriter().close();
		}
		
		
}

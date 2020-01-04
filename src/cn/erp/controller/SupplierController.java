package cn.erp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.erp.pojo.TblSupplier;
import cn.erp.service.SupplierService;

/**
 * 供应商
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value="/supplier")
public class SupplierController {

	@Autowired
	private SupplierService supplierService;
	
	
	
	//到供应商页面,String name,String contact,String tele,Integer needs
	@RequestMapping(value = "/supplierList.do")
	public String supplierList(ModelMap model,String name,String contact,String tele,Integer needs){
		List<TblSupplier> suppliers =null;
		
			 // supplierService.selAllSupplier();
		suppliers =supplierService.selSupplier(name, contact, tele, needs);
			model.addAttribute("suppliers", suppliers);
			model.addAttribute("name", name);
			model.addAttribute("contact", contact);
			model.addAttribute("tele", tele);
			model.addAttribute("needs", needs);
		return "supplier/list";
	}
	//到供应商添加页面
	@RequestMapping(value="toSupplierAdd.do")
	public String toSupplierAdd(){
		
		return "supplier/input";
	}
	//添加供应商
	@RequestMapping(value="addSupplier.do")
	public String addSupplier(String name,String address,String contact,String tele,Integer needs){
		supplierService.addSupplier(name, address, contact, tele, needs);
		return "redirect:/supplier/supplierList.do";
	}
	//去修改页面
	@RequestMapping(value="toUpdateSupplier.do")
	public String toUpdateSupplier(Long uuid,ModelMap model){
		TblSupplier tblSupplier = supplierService.toUpdateSupplier(uuid);
		model.addAttribute("tblSupplier", tblSupplier);
		return "supplier/edit";
	}
	//更新
	@RequestMapping(value="updateSupplier.do")
	public String updateSupplier(String name,String address,String contact,String tele,Integer needs,Long uuid){
		supplierService.updateSupplier(name,address,contact,tele,needs,uuid);
		return "redirect:/supplier/supplierList.do";
	}
	//删除
	@RequestMapping(value="delSupplier.do")
	public void delSupplier(HttpServletRequest request, HttpServletResponse response,Long uuid) throws Exception{
		response.setContentType("text/html;charset=UTF-8");
		String flag="ok";
		boolean b = supplierService.delSupplier(uuid);
		System.err.println(b);
			response.getWriter().print(flag);
			response.getWriter().flush();
			response.getWriter().close();
		
	}
	//查询
	/*@RequestMapping(value="selSupplier.do")
	public void selSupplier(HttpServletRequest request, HttpServletResponse response,String name,String contact,String tele,Integer needs) throws Exception{
		response.setContentType("text/html;charset=UTF-8");
		//String flag="ok";
		List<TblSupplier> suppliers = supplierService.selSupplier(name,contact,tele,needs);
		//fromObject
		JSONArray jsonArray = JSONArray.fromObject(suppliers);
		System.err.println(jsonArray.toString());
		
		response.getWriter().print(jsonArray.toString());
		response.getWriter().flush();
		response.getWriter().close();
	}*/
	
	
	
}

package cn.erp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.erp.dto.DepListDto;
import cn.erp.pojo.TblDep;
import cn.erp.service.DepService;
import cn.erp.util.PageResult;

/**
 * 部门
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value="/dep")
public class DepController {

	@Autowired
	private DepService depService;
	//@Autowired
	//private PageResult pageResult;
	
	//部门列表//int page第几页,int rows 每页显示多少条记录//带改装分页
	//@RequestParam(required = false, defaultValue = "1") int page,@RequestParam(required = false, defaultValue = "5") int rows,
	/*@RequestMapping(value = "/deplist.do")
	public String deplist(ModelMap model,String name,String tele,
			@RequestParam(required = false, defaultValue = "1") int pageNO,@RequestParam(required = false, defaultValue = "5") int pageSize) throws Exception{
		DepListDto depDto = depService.getDeps(page,rows);
		List<TblDep> deps = depService.getAllDep();
		model.addAttribute("deps", deps);
		model.addAttribute("depDto", depDto);
		model.addAttribute("page", page);
		model.addAttribute("rows", rows);
		
		//pageResult=depService.getPageResult(pageNO,pageSize);
		
		List<TblDep> deps = depService.selDep(name,tele);
		model.addAttribute("deps", deps);
		model.addAttribute("name", name);
		model.addAttribute("tele", tele);
		return "department/list";
	}*/
	
	@RequestMapping(value = "/deplist.do")
	public String deplist(ModelMap model,String name,String tele) throws Exception{
		
		List<TblDep> deps = depService.selDep(name,tele);
		model.addAttribute("deps", deps);
		model.addAttribute("name", name);
		model.addAttribute("tele", tele);
		return "department/list";
	}
	
	
	
	
	
	
	
	
	//到新增部门
	@RequestMapping(value = "/toadddep.do")
	public String toadddep(){
		return "department/input";
	}
	//增加部门
	@RequestMapping(value = "/adddep.do")
	public String addDep(String name,String tele) throws Exception{
		depService.addDep(name, tele);
		return "redirect:/dep/deplist.do";
	}
	@RequestMapping(value = "/quit.do")
	public String quit(String name,String tele) throws Exception{
		return "redirect:/dep/deplist.do";
	}
	//删除
	@RequestMapping(value = "/delete.do")
	public void delDep(HttpServletRequest request, HttpServletResponse response,Long uuid) throws Exception{
		String flag="ok";
		response.setContentType("text/html;charset=UTF-8");
		depService.delDep(uuid);
		response.getWriter().print(flag);
		response.getWriter().flush();
		response.getWriter().close();
	}
	//去修改
	@RequestMapping(value = "/update.do")
	public String toupdateDep(Long uuid,ModelMap model) throws Exception{
		TblDep dep = depService.updateDepById(uuid);
		model.addAttribute("dep", dep);
		return "department/edit";
	}
	//修改//待改装前台页面
	@RequestMapping(value = "/updatedep.do")
	public String updateDep(String name,String tele,Long uuid){
		depService.updateDep(name,tele, uuid);
		return "redirect:/dep/deplist.do";
	}
	
	
	
}

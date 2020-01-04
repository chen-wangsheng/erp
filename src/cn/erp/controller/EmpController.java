package cn.erp.controller;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.erp.dto.EmpDep;
import cn.erp.pojo.TblDep;
import cn.erp.pojo.TblEmp;
import cn.erp.pojo.TblRole;
import cn.erp.service.DepService;
import cn.erp.service.EmpService;
import cn.erp.service.RoleService;
import cn.erp.util.session.Constants;
import cn.erp.util.session.SessionProvider;

/**
 * 雇员
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value="/login")
public class EmpController {

	@Autowired
	private EmpService empService;
	@Autowired
	private SessionProvider sessionProvider;
	@Autowired
	private DepService depService;
	@Autowired
	private RoleService roleService;
	
	
	@RequestMapping(value = "/login.do")
	public String login(){
		return "login";
	}
	
	@RequestMapping(value = "/gologin.do")
	public String goLogin(String username,String pwd,ModelMap model,HttpServletRequest request,HttpServletResponse response)throws Exception{
		if(StringUtils.isNotBlank(username) && StringUtils.isNotBlank(pwd)){
			TblEmp tblEmp = empService.goLogin(username, pwd);
			if(tblEmp != null){
				//把用户对象放在Session
				sessionProvider.setAttribute(request, response, Constants.tblEmp_SESSION, tblEmp);
				return "main";
			}
		}else{
			model.addAttribute("error", "用户名或密码错误");
		}
		return "login";
	}
	
	@RequestMapping(value = "/page.do")
	public String page(){
		return "context";
	}
	//到雇员列表
	@RequestMapping(value = "/emp.do")
	public String empList(ModelMap model,String username,String name,String tele,Integer gender,Long depUuid) throws Exception{
		List<TblDep> deps = depService.getAllDep();
		model.addAttribute("deps", deps);
		//List<TblEmp> emps = empService.selEmp(username,name,tele,gender,depUuid);
		List<EmpDep> emps = empService.getEmps();//待修改动态sql
		model.addAttribute("emps", emps);
		
		return "employee/list";
	}
	
	//到新增员工页面
	@RequestMapping(value ="/toadd.do")
	public String toAdd(ModelMap model) throws Exception{
		///查询出所有部门
		List<TblDep> deps = depService.getAllDep();
		List<TblRole> roles=roleService.getRoles();
		model.addAttribute("roles", roles);
		model.addAttribute("deps", deps);
		return "employee/input";
	}
	
	//保存员工
	@RequestMapping(value ="/save.do")//,Long birthday
	public String save(String username,String pwd,String name,String email,String tele,Integer gender, String address,Long depId,String birthday,Long[] roleId) throws Exception{
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		long time = dateFormat.parse(birthday).getTime();
		empService.save(username, pwd, name, email, tele, gender, address, depId, time,roleId);
		return "redirect:/login/emp.do";
	}
	
	//区修改员工//待修改,role
	@RequestMapping(value="/toupdate.do")
	public String toupdate(ModelMap model,Long uuid){
		///查询出所有部门
		List<TblDep> deps = depService.getAllDep();
		EmpDep info = empService.selectEmpAndDepByEmpId(uuid);
		//所有角色
		List<TblRole> roles=roleService.getRoles();
		//员工id的到对应角色
		List<EmpDep> rolist = empService.selEmpAndRoleById(uuid);
		model.addAttribute("rolist", rolist);
		model.addAttribute("roles", roles);
		model.addAttribute("info", info);
		model.addAttribute("deps", deps);
		return "employee/edit";
	}
	//修改员工信息
	@RequestMapping(value="/update.do")
	public Object update(ModelMap model,Long uuid,String username,String name,String email,String tele,Integer gender, 
			HttpServletRequest request,HttpServletResponse response,String address,Long depId,String birthday,Long[] roleId) throws Exception{
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		long time = dateFormat.parse(birthday).getTime();
		boolean b = empService.updateEmp(uuid,username,name,email,tele,gender,address,depId,time,roleId);
		if(b){
			return "redirect:/login/emp.do";
		}else{
			String flag="fk";
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().print(flag);
			response.getWriter().flush();
			response.getWriter().close();
			return "redirect:/login/emp.do";
		}
		
	}
	
	
	//取消到list页面
	@RequestMapping(value ="/quit.do",method=RequestMethod.GET)
	public String quit(ModelMap model){
		List<EmpDep> emps = empService.getEmps();
		model.addAttribute("emps", emps);
		return "employee/list";
	}
	
	//查询
	/*@RequestMapping(value="/select.do")
	public String selEmp(ModelMap model,String username,String name,String tele,Integer gender,Long depUuid) throws Exception{
		List<TblEmp> emps = empService.selEmp(username,name,tele,gender,depUuid);
		model.addAttribute("emps", emps);
		return "employee/list";
	}*/
	
	//删除
	@RequestMapping(value="/del.do")
	public String  delEmp(Long uuid){
		empService.delEmp(uuid);
		return "redirect:/login/emp.do";
	}

	//到修改密码页面
	@RequestMapping(value="/editPasswordUi.do")
	public String  editPassword(){
		return "employee:/changePwd";
	}
	//修改密码
	@RequestMapping(value="/editPwd.do")
	public void  editPwd(HttpServletRequest request,HttpServletResponse response,String pwd,String newpwd){
		Serializable attribute = sessionProvider.getAttribute(request, response, pwd);
		//empService.editPwd(pwd,newpwd);
		
	}
	
	//注销
	@RequestMapping(value="/quit.do")
	public void  quit(HttpServletRequest request,HttpServletResponse response){
		sessionProvider.logout(request, response);
	}
	
	
}

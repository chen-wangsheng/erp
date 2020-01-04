package cn.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.erp.pojo.TblRole;
import cn.erp.service.RoleService;

/**
 * 角色
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value="/role")
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	
	
		//角色列表
		@RequestMapping(value = "/rolelist.do")
		public String roleList(ModelMap model,String name,String code) throws Exception{
			//查询出所有角色
			List<TblRole> roles = roleService.selRole(name,code);
			model.addAttribute("roles", roles);
			model.addAttribute("name", name);
			model.addAttribute("code", code);
			return "role/list";
		}
	
		//到角色增加页面
		@RequestMapping(value = "/toAddRole.do")
		public String toAddRole(){
			return "role/input";
		}
		
		//添加角色//带改装
		@RequestMapping(value = "/addRole.do")
		public String addRole(){
			
			return "redirect:role/rolelist.do";
		}
		//去修改角色//带改装
		@RequestMapping(value = "/toEditRole.do")
		public String toEditRole(){
			
			return "role/input";
		}
		
		
}

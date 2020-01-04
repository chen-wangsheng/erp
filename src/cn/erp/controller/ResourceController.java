package cn.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.erp.pojo.TblRes;
import cn.erp.pojo.TblSupplier;
import cn.erp.service.ResourceService;

/**
 * 资源
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value="/resource")
public class ResourceController {

	
	@Autowired
	private ResourceService resourceService;
	
	//资源列表页面
	@RequestMapping(value = "/resourceList.do")
	public String resourceList(ModelMap model){
		
			List<TblRes> resList = resourceService.selAllResource();
			model.addAttribute("resList", resList);
	
		return "resource/list";
	}
	
	
	
	
	
	
	
	
	
	
	
}

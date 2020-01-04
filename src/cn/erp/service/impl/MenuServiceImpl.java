package cn.erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.erp.mappers.TblMenuMapper;
import cn.erp.pojo.TblMenu;
import cn.erp.pojo.TblMenuExample;
import cn.erp.pojo.TblMenuExample.Criteria;
import cn.erp.service.MenuService;
@Service
public class MenuServiceImpl implements MenuService{

	
	@Autowired
	private TblMenuMapper menuMapper;
	
	public List<TblMenu> selAllmenu() {
		TblMenuExample example=new TblMenuExample();
		List<TblMenu> menuList = menuMapper.selectByExample(example);
		if(menuList != null && menuList.size()>0){
			return menuList;
		}
		return null;
	}

	public List<TblMenu> getAllOneLevel(Long uuid) {
		//Long id=(long) 1;
		TblMenuExample example=new TblMenuExample();
		//Criteria criteria = example.createCriteria();
		//criteria.andPuuidEqualTo(id);
		List<TblMenu> list = menuMapper.selectByExample(example);
		if(list != null){
			return list;
		}
		return null;
	}

}

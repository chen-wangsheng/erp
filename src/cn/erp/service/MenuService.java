package cn.erp.service;

import java.util.List;

import cn.erp.pojo.TblMenu;

public interface MenuService {

	/**
	 * 获取所有菜单
	 */
	List<TblMenu> selAllmenu();

	/**
	 * 获取所有一级菜单
	 */
	List<TblMenu> getAllOneLevel(Long uuid);
}

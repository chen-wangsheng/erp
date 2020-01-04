package cn.erp.service;

import java.util.List;

import cn.erp.pojo.TblRole;

public interface RoleService {

	/**
	 * 获取所有角色
	 */
	List<TblRole> getRoles();
	/**
	 * 条件查询
	 */
	List<TblRole> selRole(String name,String code);
	
}

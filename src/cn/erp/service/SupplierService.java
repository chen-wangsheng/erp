package cn.erp.service;

import java.util.List;

import cn.erp.pojo.TblSupplier;

public interface SupplierService {

	/**
	 * 添加供应商
	 */
	void addSupplier(String name,String address,String contact,String tele,int needs);

	/**
	 * 查询出所有供应商
	 */
	List<TblSupplier> selAllSupplier();
	/**
	 * 根据主键查找供应商
	 * @param uuid
	 */
	TblSupplier toUpdateSupplier(Long uuid);
	/**
	 * 根据主键删除供应商
	 * @param uuid
	 */
	boolean delSupplier(Long uuid);
	/**
	 * 供应商查找
	 * @param name
	 * @param contact
	 * @param tele
	 * @param needs
	 */
	List<TblSupplier> selSupplier(String name, String contact, String tele, Integer needs);
	/**
	 * 根据主键更新
	 */
	void updateSupplier(String name,String address,String contact,String tele,int needs,Long uuid);

	/**
	 * 根据供应商name查询
	 * @param gysname
	 */
	TblSupplier getGysByName(String gysname);
}

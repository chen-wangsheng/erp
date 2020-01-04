package cn.erp.service;

import java.util.List;

import cn.erp.dto.EmpDep;
import cn.erp.pojo.TblEmp;

public interface EmpService {
	/**
	 * 登录
	 * @param username
	 * @param pwd
	 * @return
	 * @throws Exception
	 */
	TblEmp goLogin(String username,String pwd)throws Exception;
	/**
	 * 保存员工
	 */
	public void save(String username,String pwd,String name,String email,String tele,Integer gender, String address,Long depId,long time,Long[] roleId )throws Exception;
	/**
	 * 获得所有员工所在的部门
	 */
	List<EmpDep> getEmps();
	/**
	 * 根据主键查找雇员对应部门
	 */
	EmpDep selectEmpAndDepByEmpId(Long uuid);
	/**
	 * 根据条件查询条件查询
	 */
	List<TblEmp> selEmp(String username,String name,String tele,Integer gender,Long depUuid)throws Exception;
	/**
	 * 删除员工
	 * @param uuid
	 */
	void delEmp(Long uuid);
	/**
	 * 员工id的到对应角色 
	 * @param uuid
	 * @return
	 */
	List<EmpDep> selEmpAndRoleById(Long uuid);
	/**
	 * 修改员工信息
	 * @param uuid
	 * @param username
	 * @param name
	 * @param email
	 * @param tele
	 * @param gender
	 * @param address
	 * @param depId
	 * @param time
	 * @param roleId
	 */
	boolean updateEmp(Long uuid, String username, String name, String email, String tele, Integer gender, String address,
			Long depId, long time, Long[] roleId);
	/**
	 * 获得所有员工
	 * @return
	 */
	List<TblEmp> getAllEmp();
	/**
	 * 根据name获得员工
	 * @param glyname
	 */
	Long selempByName(String glyname);
	/**
	 * 根据跟单人查询出该订单
	 * @param gdrName
	 */
	Long selOrderByGdrname(String gdrName);
	
	
	
	
}

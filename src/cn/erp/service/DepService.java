package cn.erp.service;

import java.util.List;

import cn.erp.dto.DepListDto;
import cn.erp.pojo.TblDep;
import cn.erp.util.PageResult;

public interface DepService {

	/**
	 * 获取所有部门
	 */
	public DepListDto getDeps(int page,int rows)throws Exception;
	/**
	 * 增加部门
	 */
	void addDep (String name,String tele)throws Exception;
	/**
	 * 删除部门
	 * @param uuid
	 * @throws Exception
	 */
	public void delDep(Long uuid) throws Exception;
	/**
	 * 去修改部门
	 * @param uuid
	 */
	public TblDep updateDepById(Long uuid) throws Exception;
	/**
	 * 部门修改
	 * @param name
	 * @param tele
	 */
	public void updateDep(String name, String tele,Long uuid);
	
	/**
	 * 查询出所有部门
	 * @return
	 */
	public List<TblDep> getAllDep();
	/**
	 * 根据查询条件获得部门
	 * @param name
	 * @param tele
	 */
	public List<TblDep> selDep(String name, String tele);
	/**
	 * 分页查询
	 * @param pageNO
	 * @param pageSize
	 * @return
	 */
	public PageResult getPageResult(int pageNO, int pageSize);
	
}

package cn.erp.service;

import java.util.List;

import cn.erp.dto.GoodsTransportDto;
import cn.erp.dto.GoodstypeDto;
import cn.erp.pojo.TblGoodstype;

public interface GoodstypeService {

	/**
	 * 根据条件查询
	 */
	List<GoodstypeDto>selGoodstype(String name, Long gysname);

	/**
	 * 添加供应商类别
	 * @param name
	 * @param gysname
	 */
	void addGoodstype(String name, Long supplieruuid);

	/**
	 * 根据主键查找
	 * @param uuid
	 */
	TblGoodstype selById(Long uuid);

	/**
	 * 修改
	 * @param uuid
	 */
	void editGoodstype(Long uuid,String name,Long supplieruuid);

	/**
	 * 根据主键删除
	 * @param uuid
	 */
	void delete(Long uuid);
	/**
	 * 获得所有商品类别
	 */
	
	List<TblGoodstype> selAll();

	
}

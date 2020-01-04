package cn.erp.service;

import java.util.List;

import cn.erp.dto.OperDetailsDto;
import cn.erp.dto.OrdernumAndGdr;
import cn.erp.dto.StoreByGlynameGoodsname;
import cn.erp.dto.StoreDto;
import cn.erp.pojo.TblStore;

public interface TblStoreService {
	/**
	 * 根据主键获得仓库
	 * @param id
	 * @return
	 */
	TblStore getTblStore(Long id);

	/**
	 * 获得所有仓库
	 * @return
	 */
	List<StoreDto> selAllStore(Long empuuid,String name);
	/**
	 * 添加仓库
	 * @param empUuid
	 * @param name
	 * @param address
	 */
	void save(Long empUuid, String name, String address);

	/**
	 * 根据主键查询仓库信息
	 * @param uuid
	 * @return
	 */
	StoreDto selStoreById(Long uuid);
	/**
	 * 根据主键查询
	 * @param uuid
	 */
	TblStore selByStoreById(Long uuid);
	/**
	 * 修改仓库
	 * @param empUuid
	 * @param uuid
	 * @param name
	 * @param address
	 */
	void edit(Long empUuid, Long uuid, String name, String address);

	/**
	 * 删除
	 * @param uuid
	 */
	void delete(Long uuid);

	/**
	 * 根据仓库名管理员name货物name查询
	 * @param storeName
	 * @param glyName
	 * @param goodsName
	 * @return
	 */
	List<StoreByGlynameGoodsname> selStoreByGlynameGoodsname(String storeName,
			String glyName, String goodsName);

	/**
	 * 根据订单号和跟单人查询
	 * @param empUuid
	 * @param orderNum
	 * @return
	 */
	List<OrdernumAndGdr> selOrdernumAndGdr(Long empUuid, String orderNum);

	/**
	 * 操作详情
	 * @param ckname
	 * @param cztype
	 * @param starttime
	 * @param endtime
	 * @param empuuid
	 * @param goodsname
	 */
	List<OperDetailsDto> selOperDetails(String ckname, Integer cztype, Long starttime, Long endtime, Long empuuid, String goodsname);


}

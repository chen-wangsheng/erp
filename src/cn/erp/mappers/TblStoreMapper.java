package cn.erp.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.erp.dto.OrdernumAndGdr;
import cn.erp.dto.StoreByGlynameGoodsname;
import cn.erp.dto.StoreDto;
import cn.erp.pojo.TblStore;
import cn.erp.pojo.TblStoreExample;

public interface TblStoreMapper {
    int countByExample(TblStoreExample example);

    int deleteByExample(TblStoreExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(TblStore record);

    int insertSelective(TblStore record);

    List<TblStore> selectByExample(TblStoreExample example);

    TblStore selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") TblStore record, @Param("example") TblStoreExample example);

    int updateByExample(@Param("record") TblStore record, @Param("example") TblStoreExample example);

    int updateByPrimaryKeySelective(TblStore record);

    int updateByPrimaryKey(TblStore record);
    /**
     * 查询所有仓库信息
     */
    List<StoreDto> selAllStore(@Param("empuuid")Long empuuid,@Param("name")String name);

    /**
     * 根据主键查询仓库信息
     * @param uuid
     * @return
     */
	StoreDto selStoreById(@Param("uuid")Long uuid);
    
	/**
	 * 根据仓库名管理员name货物name查询 
	 * @param storeName@Param("storeName")
	 * @param glyName @Param("glyName")
	 * @param goodsName@Param("goodsName")
	 * @return
	 */
	List<StoreByGlynameGoodsname> selStoreByGlynameGoodsname(@Param("storeName")String storeName,@Param("glyName")String glyName, @Param("goodsName")String goodsName);

	/**
	 * 根据订单号和跟单人查询
	 * @param empUuid
	 * @param orderNum
	 */
	List<OrdernumAndGdr> selOrdernumAndGdr(@Param("empUuid")Long empUuid, @Param("orderNum")String orderNum);
}
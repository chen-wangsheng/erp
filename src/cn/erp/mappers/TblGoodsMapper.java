package cn.erp.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.erp.dto.ExcelGoodsByTimeAndGys;
import cn.erp.dto.ExcelOrderNumById;
import cn.erp.dto.GoodsDto;
import cn.erp.dto.GoodsTransportDto;
import cn.erp.dto.GoodsTymeNameAndGoodsName;
import cn.erp.dto.InfoByOrderuuid;
import cn.erp.dto.SupplierByNeedsDto;
import cn.erp.pojo.TblGoods;
import cn.erp.pojo.TblGoodsExample;

public interface TblGoodsMapper {
    int countByExample(TblGoodsExample example);

    int deleteByExample(TblGoodsExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(TblGoods record);

    int insertSelective(TblGoods record);

    List<TblGoods> selectByExample(TblGoodsExample example);

    TblGoods selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") TblGoods record, @Param("example") TblGoodsExample example);

    int updateByExample(@Param("record") TblGoods record, @Param("example") TblGoodsExample example);

    int updateByPrimaryKeySelective(TblGoods record);

    int updateByPrimaryKey(TblGoods record);
    /**
     * 动态查询展示商品
     * @return
     */
    List<GoodsDto> selGoods(@Param("gysId") Long gysId,@Param("name") String name,@Param("producer") String producer,@Param("unit") String unit);

    /**
     * 根据商品id查找对应商品
     */
    GoodsDto selGooodsById(Long uuid);

    /**
     * 商品运输运输任务指派列表
     * @return
     */
	List<GoodsTransportDto> selRenwuZhipaiLiebiao();
	/**
	 * 报表，根据订单时间，供应商uuid查询 
	 * @param gysuuid
	 * @param starttime
	 * @param endtime
	 * @return
	 */
	List<ExcelGoodsByTimeAndGys> selExcelGoodsByTimeAndGys(@Param("gysuuid") Long gysuuid,@Param("starttime") Long starttime,@Param("endtime") Long endtime);

	/**
	 * 报表，根据商品id查询订单num，订单时间
	 * @param goodsuuid
	 * @return
	 */
	List<ExcelOrderNumById> excelDetails(@Param("goodsuuid")Long goodsuuid);
	
	/**
	 * 任务指派,根据订单id查询商品类别,商品名称
	 * @param orderuuid
	 * @return
	 */
	List<GoodsTymeNameAndGoodsName> selGoodsTymeNameAndGoodsName(@Param("orderuuid")Long orderuuid);

	/**
	 * 根据供应商和发货方式，查询出供应商 等信息。
	 * @param uuid
	 * @param needs
	 * @return
	 */
	List<SupplierByNeedsDto> selSupplierByNeeds(@Param("uuid")Long uuid, @Param("needs")Integer needs);

	/**
	 * 
	 * @param orderuuid
	 * @return
	 */
	List<InfoByOrderuuid> selInfoByOrderuuid(Long orderuuid);
}
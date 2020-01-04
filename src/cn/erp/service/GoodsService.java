package cn.erp.service;

import java.util.List;

import javax.servlet.ServletOutputStream;

import cn.erp.dto.ExcelGoodsByTimeAndGys;
import cn.erp.dto.ExcelOrderNumById;
import cn.erp.dto.GoodsDto;
import cn.erp.dto.GoodsTransportDto;
import cn.erp.dto.GoodsTymeNameAndGoodsName;
import cn.erp.dto.InfoByOrderuuid;
import cn.erp.dto.SupplierByNeedsDto;

public interface GoodsService {

	/**
	 * 动态查询商品
	 * @return
	 */
	List<GoodsDto> selGoods(Long gysId,String name,String producer,String unit);
	/**
	 * 添加商品
	 * @param supplier
	 * @param goodstype
	 * @param name
	 * @param origin
	 * @param producer
	 * @param unit
	 * @param inPrice
	 * @param outPrice
	 * @param useNum
	 */
	void addGoods(Long supplier, Long goodstype, String name, String origin,
			String producer, String unit, Double inPrice, Double outPrice,
			Integer useNum);
	/**
	 * 根据商品id查找对应商品
	 */
	GoodsDto selGoodsById(Long uuid);
	/**
	 * 根据主键更新
	 * @param supplier
	 * @param goodstype
	 * @param name
	 * @param origin
	 * @param producer
	 * @param unit
	 * @param inPrice
	 * @param outPrice
	 * @param useNum
	 */
	void updateGoods(Long supplier, Long goodstype, String name, String origin, String producer, String unit,
			Double inPrice, Double outPrice, Integer useNum,Long uuid);
	/**
	 * 商品运输运输任务指派列表
	 * @return
	 */
	List<GoodsTransportDto> selRenwuZhipaiLiebiao();
	/**
	 * 报表，根据订单时间，供应商uuid查询 商品
	 * @return
	 */
	List<ExcelGoodsByTimeAndGys> selExcelGoodsByTimeAndGys(Long gysuuid,Long starttime,Long endtime);
	/**
	 * 详情查询，报表，根据商品id查询订单num，订单时间
	 * @param goodsuuid
	 * @return
	 */
	List<ExcelOrderNumById> excelDetails(Long goodsuuid);
	/**
	 * 商品报表导出
	 * @param excelGoods
	 * @param outputStream
	 */
	void exportExcel(List<ExcelGoodsByTimeAndGys> excelGoods,
			ServletOutputStream outputStream);
	/**
	 * 任务指派,根据订单id查询商品类别,商品名称
	 * @param orderuuid
	 * @return
	 */
	List<GoodsTymeNameAndGoodsName> selGoodsTymeNameAndGoodsName(Long orderuuid);
	/**
	 * 运输任务查询,uuid供应商uuid
	 * @param uuid
	 * @param needs
	 */
	List<SupplierByNeedsDto> selSupplierByNeeds(Long uuid, Integer needs);
	/**
	 * 任务详情,根据订单uuid，查询出企业名称等。
	 */
	List<InfoByOrderuuid> selInfoByOrderuuid(Long orderuuid);
	
	
	
}

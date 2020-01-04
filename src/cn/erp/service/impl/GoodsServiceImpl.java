package cn.erp.service.impl;

import java.util.List;

import javax.servlet.ServletOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.erp.dto.ExcelGoodsByTimeAndGys;
import cn.erp.dto.ExcelOrderNumById;
import cn.erp.dto.GoodsDto;
import cn.erp.dto.GoodsTransportDto;
import cn.erp.dto.GoodsTymeNameAndGoodsName;
import cn.erp.dto.InfoByOrderuuid;
import cn.erp.dto.SupplierByNeedsDto;
import cn.erp.mappers.TblGoodsMapper;
import cn.erp.mappers.TblGoodstypeMapper;
import cn.erp.pojo.TblGoods;
import cn.erp.pojo.TblGoodsExample;
import cn.erp.pojo.TblGoodsExample.Criteria;
import cn.erp.pojo.TblGoodstype;
import cn.erp.service.GoodsService;
import cn.erp.util.ExcelUtil;

@Service
public class GoodsServiceImpl implements GoodsService{

	
	@Autowired
	private TblGoodsMapper goodsMapper;
	@Autowired TblGoodstypeMapper goodstypeMapper;
	
	public List<GoodsDto> selGoods(Long gysId,String name,String producer,String unit) {
		List<GoodsDto> list = goodsMapper.selGoods(gysId,name,producer,unit);
		if(list != null && list.size()>0){
			return list;
		}
		return null;
	}

	public void addGoods(Long supplier, Long goodstype, String name,
			String origin, String producer, String unit, Double inPrice,
			Double outPrice, Integer useNum) {
		TblGoodstype gt = goodstypeMapper.selectByPrimaryKey(goodstype);
		
			TblGoodstype r=new TblGoodstype();
			r.setName(gt.getName());
			r.setSupplieruuid(supplier);
			//需要返回供应商类别主键
			int j = goodstypeMapper.insert(r);
			Long goodsTypeUuid = r.getUuid();
			if(j>0){
				//商品添加
				TblGoods record=new TblGoods();
				record.setGoodstypeuuid(goodsTypeUuid);
				record.setName(name);
				record.setOrigin(origin);
				record.setProducer(producer);
				record.setUnit(unit);
				record.setInprice(inPrice);
				record.setOutprice(outPrice);
				record.setUsenum(useNum);
				int i = goodsMapper.insert(record);
				}
		
	}

	public GoodsDto selGoodsById(Long uuid) {
		GoodsDto list = goodsMapper.selGooodsById(uuid);
		return list;
		
	}

	public void updateGoods(Long supplier, Long goodstype, String name, String origin, String producer, String unit,
			Double inPrice, Double outPrice, Integer useNum,Long uuid) {
		//TblGoodstype g = goodstypeMapper.selectByPrimaryKey(goodstype);
		//拿到name
		//String n = g.getName();
		TblGoodstype records=new TblGoodstype();
		records.setUuid(goodstype);
		records.setSupplieruuid(supplier);
		goodstypeMapper.updateByPrimaryKeySelective(records);
		
		TblGoods record=new TblGoods();
		record.setUuid(uuid);
		record.setGoodstypeuuid(goodstype);
		record.setName(name);
		record.setOrigin(origin);
		record.setProducer(producer);
		record.setUnit(unit);
		record.setInprice(inPrice);
		record.setOutprice(outPrice);
		record.setUsenum(useNum);
		goodsMapper.updateByPrimaryKeySelective(record);
	}

	public List<GoodsTransportDto> selRenwuZhipaiLiebiao() {
		List<GoodsTransportDto> list = goodsMapper.selRenwuZhipaiLiebiao();
		if(list.size()>0 && list != null){
			return list;
		}
		return null;
	}

	public List<ExcelGoodsByTimeAndGys> selExcelGoodsByTimeAndGys(Long gysuuid,Long starttime,Long endtime) {
		List<ExcelGoodsByTimeAndGys> list = goodsMapper.selExcelGoodsByTimeAndGys(gysuuid, starttime, endtime);
		if(list.size()>0&&list != null){
			return list;
		}
		return null;
	}

	public List<ExcelOrderNumById> excelDetails(Long goodsuuid) {
		List<ExcelOrderNumById> list=goodsMapper.excelDetails(goodsuuid);
		if(list.size()>0 && list != null){
			return list;
		}
		return null;
	}

	public void exportExcel(List<ExcelGoodsByTimeAndGys> excelGoods,
			ServletOutputStream outputStream) {
		ExcelUtil.exportUserExcel(excelGoods, outputStream);
		
	}

	public List<GoodsTymeNameAndGoodsName> selGoodsTymeNameAndGoodsName(
			Long orderuuid) {
		List<GoodsTymeNameAndGoodsName> list = goodsMapper.selGoodsTymeNameAndGoodsName(orderuuid);
		if(list.size()>0 && list != null){
			return list;
		}
		return null;
	}

	public List<SupplierByNeedsDto> selSupplierByNeeds(Long uuid, Integer needs) {
		List<SupplierByNeedsDto> list=goodsMapper.selSupplierByNeeds(uuid,needs);
		System.err.println(list);
		if(list.size()>0&&list != null){
			return list;
		}
		return null;
	}

	public List<InfoByOrderuuid> selInfoByOrderuuid(Long orderuuid) {
		List<InfoByOrderuuid> list = goodsMapper.selInfoByOrderuuid(orderuuid);
		if(list.size()>0&&list != null){
			return list;
		}
		return null;
	}

}

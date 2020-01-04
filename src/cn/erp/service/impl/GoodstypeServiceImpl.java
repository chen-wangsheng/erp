package cn.erp.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.erp.dto.GoodstypeDto;
import cn.erp.mappers.TblGoodstypeMapper;
import cn.erp.mappers.TblSupplierMapper;
import cn.erp.pojo.TblGoodstype;
import cn.erp.pojo.TblGoodstypeExample;
import cn.erp.pojo.TblGoodstypeExample.Criteria;
import cn.erp.service.GoodstypeService;

@Service
public class GoodstypeServiceImpl implements GoodstypeService{

	@Autowired
	private TblGoodstypeMapper goodstypeMapper;
	@Autowired
	private TblSupplierMapper supplierMapper;
	
	public List<GoodstypeDto> selGoodstype(String name, Long gysname) {
		 List<GoodstypeDto> list = goodstypeMapper.selGoodstype(name, gysname);
		 if(list.size()>0 && list != null){
			 return list;
		 }
		return null;
		  
	}

	public void addGoodstype(String name, Long supplieruuid) {
		TblGoodstype record=new TblGoodstype();
		record.setName(name);
		record.setSupplieruuid(supplieruuid);
		goodstypeMapper.insert(record);
	}

	public TblGoodstype selById(Long uuid) {
		return goodstypeMapper.selectByPrimaryKey(uuid);
	}

	public void editGoodstype(Long uuid,String name,Long supplieruuid) {
		TblGoodstype record=new TblGoodstype();
		record.setName(name);
		record.setSupplieruuid(supplieruuid);
		record.setUuid(uuid);
		goodstypeMapper.updateByPrimaryKey(record);
		
	}

	public void delete(Long uuid) {
		// TODO Auto-generated method stub
		goodstypeMapper.deleteByPrimaryKey(uuid);
	}

	public List<TblGoodstype> selAll() {
		TblGoodstypeExample example=new TblGoodstypeExample();
		List<TblGoodstype> list = goodstypeMapper.selectByExample(example);
		if(list != null){
			return list;
		}
		return null;
	}

}

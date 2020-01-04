package cn.erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.erp.dto.OperDetailsDto;
import cn.erp.dto.OrdernumAndGdr;
import cn.erp.dto.StoreByGlynameGoodsname;
import cn.erp.dto.StoreDto;
import cn.erp.mappers.TblEmpMapper;
import cn.erp.mappers.TblOrderMapper;
import cn.erp.mappers.TblStoreMapper;
import cn.erp.mappers.TblStoredetailMapper;
import cn.erp.pojo.TblStore;
import cn.erp.service.TblStoreService;
@Service
public class TblStoreImpl implements TblStoreService{

	@Autowired 
	TblStoreMapper tblStoreMapper;
	@Autowired
	TblEmpMapper empMapper;
	@Autowired
	TblStoredetailMapper storedetailMapper;
	
	public TblStore getTblStore(Long id) {
		return tblStoreMapper.selectByPrimaryKey(id);
	}

	//
	public List<StoreDto> selAllStore(Long empuuid,String name) {
		
		List<StoreDto> list = tblStoreMapper.selAllStore(empuuid,name);
		if(list != null && list.size()>0){
			return list;
		}
		return null;
	}

	public void save(Long empUuid, String name, String address) {
		TblStore record=new TblStore();
		record.setAddress(address);
		record.setName(name);
		record.setEmpuuid(empUuid);
		tblStoreMapper.insertSelective(record);
	}

	public StoreDto selStoreById(Long uuid) {
		StoreDto list = tblStoreMapper.selStoreById(uuid);
		if(list != null){
			return list;
		}
		return null;
	}

	public TblStore selByStoreById(Long uuid) {
		TblStore store = tblStoreMapper.selectByPrimaryKey(uuid);
		return store;
	}

	public void edit(Long empUuid, Long uuid, String name, String address) {
		TblStore record=new TblStore();
		record.setAddress(address);
		record.setName(name);
		record.setUuid(uuid);
		record.setEmpuuid(empUuid);
		int i = tblStoreMapper.updateByPrimaryKeySelective(record);
		System.out.println(i);
		
	}

	public void delete(Long uuid) {
		int i = tblStoreMapper.deleteByPrimaryKey(uuid);
		System.out.println(i);
	}

	public List<StoreByGlynameGoodsname> selStoreByGlynameGoodsname(
			String storeName, String glyName, String goodsName) {
		List<StoreByGlynameGoodsname> list = tblStoreMapper.selStoreByGlynameGoodsname(storeName, glyName, goodsName);
		if(list.size()>0 && list != null){
			return list;
		}
		return null;
	}

	public List<OrdernumAndGdr> selOrdernumAndGdr(Long empUuid, String orderNum) {
		List<OrdernumAndGdr> list=tblStoreMapper.selOrdernumAndGdr(empUuid,orderNum);
		if(list.size()>0 &&list != null){
			return list;
		}
		return null;
	}

	public List<OperDetailsDto> selOperDetails(String ckname, Integer cztype, Long starttime, Long endtime, Long empuuid,
			String goodsname) {
		List<OperDetailsDto> list = storedetailMapper.selOperDetails(ckname, cztype, starttime, endtime, empuuid, goodsname);
		if(list.size()>0 && list != null){
			return list;
		}
		return null;
	}

}

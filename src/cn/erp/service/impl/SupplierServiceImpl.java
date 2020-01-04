package cn.erp.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.erp.mappers.TblSupplierMapper;
import cn.erp.pojo.TblSupplier;
import cn.erp.pojo.TblSupplierExample;
import cn.erp.pojo.TblSupplierExample.Criteria;
import cn.erp.service.SupplierService;

@Service
public class SupplierServiceImpl implements SupplierService{

	
	@Autowired
	private TblSupplierMapper supplierMapper;
	
	
	
	public void addSupplier(String name, String address, String contact,
			String tele, int needs) {
		TblSupplier record=new TblSupplier();
		record.setName(name);
		record.setAddress(address);
		record.setContact(contact);
		record.setTele(tele);
		record.setNeeds(needs);
		supplierMapper.insertSelective(record);
	}



	public List<TblSupplier> selAllSupplier() {
		TblSupplierExample example=new TblSupplierExample();
		List<TblSupplier> list = supplierMapper.selectByExample(example);
		if(list.size()>0 && list != null){
			return list;
		}
		return null;
	}

	public TblSupplier toUpdateSupplier(Long uuid) {
		return	supplierMapper.selectByPrimaryKey(uuid);
		
	}

	public boolean delSupplier(Long uuid) {
		int flag = supplierMapper.deleteByPrimaryKey(uuid);
		return flag == 0?false:true;
	}

	public List<TblSupplier> selSupplier(String name, String contact, String tele,
			Integer needs) {
		TblSupplierExample example=new TblSupplierExample();
		Criteria criteria = example.createCriteria();
		if(StringUtils.isNotBlank(name)){
			criteria.andNameEqualTo(name);
		}
		if(StringUtils.isNotBlank(contact)){
			criteria.andContactEqualTo(contact);
		}
		if(StringUtils.isNotBlank(tele)){
			criteria.andTeleEqualTo(tele);
		}
		if(needs != null){
			criteria.andNeedsEqualTo(needs);
		}
		
		List<TblSupplier> TblSuppliers = supplierMapper.selectByExample(example);
		if(TblSuppliers.size()>0 && TblSuppliers != null){
			return TblSuppliers;
		}
		return null;
	}



	public void updateSupplier(String name,String address,String contact,String tele,int needs,Long uuid) {
		TblSupplier record=new TblSupplier();
		record.setUuid(uuid);
		record.setAddress(address);
		record.setContact(contact);
		record.setName(name);
		record.setAddress(tele);
		record.setNeeds(needs);
		  supplierMapper.updateByPrimaryKeySelective(record);
		// System.err.println(i);
	}



	public TblSupplier getGysByName(String gysname) {
		TblSupplierExample example=new TblSupplierExample();
		Criteria criteria = example.createCriteria();
		if(StringUtils.isNotBlank(gysname)){
			criteria.andNameEqualTo(gysname);
		}
		List<TblSupplier> list = supplierMapper.selectByExample(example);
		if(list.size()>0&&list != null){
			return list.get(0);
		}
		return null;
	}

	
}

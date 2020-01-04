package cn.erp.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.erp.dto.EmpDep;
import cn.erp.mappers.TblEmpMapper;
import cn.erp.mappers.TblEmpRoleMapper;
import cn.erp.pojo.TblEmp;
import cn.erp.pojo.TblEmpExample;
import cn.erp.pojo.TblEmpExample.Criteria;
import cn.erp.pojo.TblEmpRole;
import cn.erp.pojo.TblEmpRoleExample;
import cn.erp.service.EmpService;
@Service
@Transactional
public class EmpServiceImpl implements EmpService{

	@Autowired
	private TblEmpMapper empMapper;
	@Autowired
	private TblEmpRoleMapper empRoleMapper;
	
	public TblEmp goLogin(String username, String pwd) {
		TblEmpExample example=new TblEmpExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUsernameEqualTo(username);
		List<TblEmp> list = empMapper.selectByExample(example);
		if(list.size() >0 && list != null){
			return list.get(0);
		}
		return null;
	}
	//待修改需要返回员工id
	public void save(String username, String pwd, String name, String email,
			String tele, Integer gender, String address, Long depId,
			long time,Long[] roleId) {
		TblEmp record=new TblEmp();
		record.setUsername(username);
		record.setAddress(address);
		record.setPwd(pwd);
		record.setName(name);
		record.setEmail(email);
		record.setTele(tele);
		record.setGender(gender);
		record.setDepuuid(depId);
		record.setBirthday(time);
		empMapper.insert(record);
		Long uuid = record.getUuid();
		TblEmpRole ex=new TblEmpRole();
		for (Long id : roleId) {
			ex.setRoleuuid(id);
			ex.setEmpuuid(uuid);
			int i = empRoleMapper.insert(ex);
			
		}
	}

	public List<EmpDep> getEmps() {
	return empMapper.selectEmpAndDep();
	}

	public EmpDep selectEmpAndDepByEmpId(Long uuid) {
		EmpDep empDepInfo=empMapper.selectEmpAndDepByEmpId(uuid);
		 return empDepInfo;
	}
	
	public void updateEmpById(){
		TblEmp record=new TblEmp();
		TblEmpExample example=new TblEmpExample();
		
		empMapper.updateByExample(record, example);
	}

	public List<TblEmp> selEmp(String username,String name,String tele,Integer gender,Long depUuid) throws Exception {
		TblEmpExample example=new TblEmpExample();
		Criteria criteria = example.createCriteria();
		if(StringUtils.isNotBlank(username)){
			criteria.andUsernameEqualTo(username);
		}
		if(StringUtils.isNotBlank(name)){
			criteria.andUsernameEqualTo(name);
		}
		if(StringUtils.isNotBlank(tele)){
			criteria.andUsernameEqualTo(tele);
		}
		if(gender != null){
			criteria.andGenderEqualTo(gender);
		}
		if(depUuid != null){
			criteria.andDepuuidEqualTo(depUuid);
		}
		
		List<TblEmp> emps = empMapper.selectByExample(example);
		if(emps.size()>0 && emps != null ){
			return emps;
		}
		return null;
	}

	public void delEmp(Long uuid) {
		empMapper.deleteByPrimaryKey(uuid);
	}

	public List<EmpDep> selEmpAndRoleById(Long uuid) {
		List<EmpDep> list = empMapper.selEmpAndRoleById(uuid);
		return list;
	}

	public boolean updateEmp(Long uuid, String username, String name, String email, String tele, Integer gender,
			String address, Long depId, long time, Long[] roleId) {
		TblEmp record=new TblEmp();
		record.setUuid(uuid);
		record.setUsername(username);
		record.setName(name);
		record.setEmail(email);
		record.setTele(tele);
		record.setGender(gender);
		record.setAddress(address);
		record.setDepuuid(depId);
		record.setBirthday(time);
		int j=0;
		 int i = empMapper.updateByPrimaryKey(record);
		 System.err.println(i);
		 List<EmpDep> edList = empMapper.selEmpAndRoleById(uuid);
		 for (EmpDep empDep : edList) {
			Long jueseid = empDep.getJueseid();
			TblEmpRoleExample example=new TblEmpRoleExample();
			cn.erp.pojo.TblEmpRoleExample.Criteria criteria = example.createCriteria();
			criteria.andEmpuuidEqualTo(uuid);
			criteria.andRoleuuidEqualTo(jueseid);
			List<TblEmpRole> list = empRoleMapper.selectByExample(example);
			for (TblEmpRole tblEmpRole : list) {
				Long erUuid = tblEmpRole.getUuid();
				for (Long rId : roleId) {
					TblEmpRole EmpRole=new TblEmpRole();
					EmpRole.setUuid(erUuid);
					EmpRole.setEmpuuid(uuid);
					EmpRole.setRoleuuid(rId);
					   j = empRoleMapper.updateByPrimaryKey(EmpRole);
				}
				
			}
			
		}
		 
		return j==0?false:true;
		
	}
	public List<TblEmp> getAllEmp() {
		TblEmpExample example=new TblEmpExample();
		List<TblEmp> list = empMapper.selectByExample(example);
		if(list.size()>0 && list != null){
			return list;
		}
		return null;
	}
	public Long selempByName(String glyname) {
		TblEmpExample example=new TblEmpExample();
		Criteria criteria = example.createCriteria();
		if(StringUtils.isNotBlank(glyname)){
			criteria.andNameEqualTo(glyname);
		}
		
		List<TblEmp> emp = empMapper.selectByExample(example);
		TblEmp tblEmp = emp.get(0);
		//管理员uuid
		Long empuuid = tblEmp.getUuid();
		return empuuid;
	}
	public Long selOrderByGdrname(String gdrName) {
		TblEmpExample example=new TblEmpExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameEqualTo(gdrName);
		List<TblEmp> list = empMapper.selectByExample(example);
		if(list.size()>0 && list != null){
			list.get(0).getUuid();
		}
		return null;
	}

}

package cn.erp.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.erp.mappers.TblRoleMapper;
import cn.erp.pojo.TblRole;
import cn.erp.pojo.TblRoleExample;
import cn.erp.pojo.TblRoleExample.Criteria;
import cn.erp.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService{

	
	
	@Autowired
	private TblRoleMapper roleMapper;
	
	public List<TblRole> getRoles() {
		TblRoleExample example=new TblRoleExample();
		List<TblRole> list = roleMapper.selectByExample(example);
		return list;
	}

	public List<TblRole> selRole(String name, String code) {
		TblRoleExample example=new TblRoleExample();
		Criteria criteria = example.createCriteria();
		if(StringUtils.isNotBlank(name)){
			criteria.andNameEqualTo(name);
		}
		if(StringUtils.isNotBlank(code)){
			criteria.andCodeEqualTo(code);
		}
		List<TblRole> list = roleMapper.selectByExample(example);
		if(list != null && list.size()>0){
			return list;
		}
		return null;
	}

}

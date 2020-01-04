package cn.erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.erp.mappers.TblResMapper;
import cn.erp.pojo.TblRes;
import cn.erp.pojo.TblResExample;
import cn.erp.service.ResourceService;
@Service
public class ResourceServiceImpl implements ResourceService{

	
	@Autowired
	private TblResMapper resMapper;
	public List<TblRes> selAllResource() {
		TblResExample example=new TblResExample();
		List<TblRes> list = resMapper.selectByExample(example);
		if(list.size()>0 && list != null){
			return list;
		}
		return null;
	}

}

package cn.erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.erp.dto.OrderDetailDto;
import cn.erp.dto.OrderDto;
import cn.erp.dto.OrderNumPriceDto;
import cn.erp.dto.SelOrderByTimeAndCreaterDto;
import cn.erp.mappers.TblOrderMapper;
import cn.erp.pojo.TblOrder;
import cn.erp.pojo.TblOrderExample;
import cn.erp.service.OrderService;


@Service
public class OrderServiceImpl implements OrderService{

	
	@Autowired
	private TblOrderMapper orderMapper;

	public List<TblOrder> getAllOrder() {
		TblOrderExample example=new TblOrderExample();
		List<TblOrder> list = orderMapper.selectByExample(example);
		if(list.size()>0 && list != null){
			return list;
		}
		return null;
	}

	public List<OrderDto> selOrderByOrderNum(Long uuid) {
		List<OrderDto> list = orderMapper.selOrderByOrderNum(uuid);
		if(list != null && list.size()>0){
			return list;
		}
		return null;
	}

	public List<OrderDetailDto> selOrderDetailById(Long uuid) {
		List<OrderDetailDto> list = orderMapper.selOrderDetailById(uuid);
		if(list.size()>0 && list != null ){
			return list;
		}
		return null;
	}

	public List<OrderNumPriceDto> selNumAndPriceById(Long uuid) {
		List<OrderNumPriceDto> list = orderMapper.selNumAndPriceById(uuid);
		if(list.size()>0 && list != null){
			return list;
		}
		return null;
	}

	public List<SelOrderByTimeAndCreaterDto> selOrderByTimeAndCreater(Long createtime,Long createtimeend,Long zdrname) {
		List<SelOrderByTimeAndCreaterDto> list = orderMapper.selOrderByTimeAndCreater(zdrname, createtime, createtimeend);
		if(list.size()>0 && list != null){
			return list;
		}
		return null;
	}
	
	
	
	
}

package cn.erp.service;

import java.util.List;

import cn.erp.dto.OrderDetailDto;
import cn.erp.dto.OrderDto;
import cn.erp.dto.OrderNumPriceDto;
import cn.erp.dto.SelOrderByTimeAndCreaterDto;
import cn.erp.pojo.TblOrder;

public interface OrderService {

	List<TblOrder> getAllOrder();

	/**
	 * 根据订单编号返回订单数据动态sql
	 * @param orderNum
	 * @return
	 */
	List<OrderDto> selOrderByOrderNum(Long uuid);
	/**
	 * 查询出订单详情
	 */
	List<OrderDetailDto> selOrderDetailById(Long uuid);

	/**
	 * 查询出单价和总数
	 * @param uuid
	 * @return
	 */
	List<OrderNumPriceDto> selNumAndPriceById(Long uuid);
	/**
	 * 订单审核 列表根据下单时间 和下单人查询
	 * @return
	 */
	List<SelOrderByTimeAndCreaterDto> selOrderByTimeAndCreater(Long createtime,Long createtimeend,Long zdrname);
	
	
}

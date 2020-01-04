package cn.erp.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.erp.dto.OrderDetailDto;
import cn.erp.dto.OrderDto;
import cn.erp.dto.OrderNumPriceDto;
import cn.erp.dto.SelOrderByTimeAndCreaterDto;
import cn.erp.pojo.TblOrder;
import cn.erp.pojo.TblSupplier;
import cn.erp.service.EmpService;
import cn.erp.service.OrderService;
import cn.erp.service.SupplierService;

/**
 * 订单
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value="/order")
public class OrderController {

	@Autowired
	private SupplierService supplierService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private EmpService empService;
	
	
		//到采购订单列表
		@RequestMapping(value="/orderList.do")
		public String orderList(ModelMap model){
			
			return "order/in/inList";
		}
		//到新建订单，订单管理//待完善
		@RequestMapping(value="/orderAdd.do")
		public String orderAdd(ModelMap model){
			List<TblSupplier> supplierAll = supplierService.selAllSupplier();
			model.addAttribute("supplierAll", supplierAll);
			//根据供应商查询出商品类别信息和商品信息
			
			
			
			
			return "order/in/input";
		}
		
		//到订单审核列表
		@RequestMapping(value="/orderCheck.do")
		public String orderCheck(ModelMap model,String glyname,String createtimes,String createtimeends) throws Exception{
			//List<TblOrder> orders = orderService.getAllOrder();
			//model.addAttribute("orders", orders);
			//根据下单时间和下单人查询
			SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
			Long createtime=null;
			Long createtimeend=null;
			Long zdrname=null;//制单人id
			if(StringUtils.isNotBlank(createtimes)){
				createtime = dateFormat.parse(createtimes).getTime();
				
			}
			if(StringUtils.isNotBlank(createtimeends)){
				createtimeend = dateFormat.parse(createtimeends).getTime();
			}
			if(StringUtils.isNotBlank(glyname)){
				zdrname=empService.selempByName(glyname);
			}
			
			List<SelOrderByTimeAndCreaterDto> orderDtos= orderService.selOrderByTimeAndCreater(createtime,createtimeend,zdrname);
			model.addAttribute("orderDtos", orderDtos);
			
			
			//List<OrderDto> orderDtos = orderService.selOrderByOrderNum(uuid);
			//model.addAttribute("orderDtos", orderDtos);
			return "order/in/inApproveList";
		}
		
		//到订单审核//待修改
		@RequestMapping(value="/inApprove.do")
		public String inApprove(ModelMap model,Long uuid){
			//1一个订单有多个订单项,
			//2查询出订单 ，在查询出订单详情
			//查询出订单
			List<OrderDto> orderDtos = orderService.selOrderByOrderNum(uuid);
			OrderDto orderDto = new OrderDto();
			if(orderDtos != null){
				 orderDto = orderDtos.get(0);
			}
			model.addAttribute("orderDto", orderDto);
			//查询出订单详情订单明细//待修改sql
			List<OrderDetailDto> orderDetailDtos = orderService.selOrderDetailById(uuid);
			model.addAttribute("orderDetailDtos", orderDetailDtos);
			
			//查询出单价和总数
			//List<OrderNumPriceDto> OrderNumPriceDto = orderService.selNumAndPriceById(uuid);
			return "order/in/inApprove";
		}
		
		
		//@RequestMapping(value="/selOrder.do")
		//public 
		
		
}

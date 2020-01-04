package cn.erp.dto;
/**
 * 报表，根据商品id查询订单num，订单时间
 * @author Administrator
 *
 */
public class ExcelOrderNumById {

	private String orderNum;
	private Long createTime;
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public Long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	
	
	
	
}

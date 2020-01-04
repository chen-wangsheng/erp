package cn.erp.dto;
/**
 * 根据订单号和跟单人查询
 * @author Administrator
 *
 */
public class OrdernumAndGdr {

	private String ordernum;
	private String gdrname;
	private Long uuid;//订单uuid
	
	public Long getUuid() {
		return uuid;
	}
	public void setUuid(Long uuid) {
		this.uuid = uuid;
	}
	public String getOrdernum() {
		return ordernum;
	}
	public void setOrdernum(String ordernum) {
		this.ordernum = ordernum;
	}
	public String getGdrname() {
		return gdrname;
	}
	public void setGdrname(String gdrname) {
		this.gdrname = gdrname;
	}
	@Override
	public String toString() {
		return "OrdernumAndGdr [ordernum=" + ordernum + ", gdrname=" + gdrname + ", uuid=" + uuid + "]";
	}

	
}

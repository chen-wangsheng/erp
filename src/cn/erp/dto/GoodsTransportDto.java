package cn.erp.dto;
/**
 * 商品运输任务指派列表
 * @author Administrator
 *
 */
public class GoodsTransportDto {

	private Long orderuuid;//订单uuid
	private Long createTime;//下单时间
	private String zdrname;//制单人
	private Long checkTime;//审核时间
	private String checkname;//审核人
	private String gysname;
	private int needs;//发货方式
	private String gdrname;//跟单人name
	
	public Long getOrderuuid() {
		return orderuuid;
	}
	public void setOrderuuid(Long orderuuid) {
		this.orderuuid = orderuuid;
	}
	public Long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	public String getZdrname() {
		return zdrname;
	}
	public void setZdrname(String zdrname) {
		this.zdrname = zdrname;
	}
	public Long getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(Long checkTime) {
		this.checkTime = checkTime;
	}
	public String getCheckname() {
		return checkname;
	}
	public void setCheckname(String checkname) {
		this.checkname = checkname;
	}
	public String getGysname() {
		return gysname;
	}
	public void setGysname(String gysname) {
		this.gysname = gysname;
	}
	public int getNeeds() {
		return needs;
	}
	public void setNeeds(int needs) {
		this.needs = needs;
	}
	public String getGdrname() {
		return gdrname;
	}
	public void setGdrname(String gdrname) {
		this.gdrname = gdrname;
	}
	@Override
	public String toString() {
		return "GoodsTransportDto [orderuuid=" + orderuuid + ", createTime="
				+ createTime + ", zdrname=" + zdrname + ", checkTime="
				+ checkTime + ", checkname=" + checkname + ", gysname="
				+ gysname + ", needs=" + needs + ", gdrname=" + gdrname + "]";
	}
	
	
	
	
	
}

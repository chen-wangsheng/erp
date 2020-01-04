package cn.erp.dto;
/**
 * 订单审核 列表根据下单时间 和下单人查询
 * 
 * @author Administrator
 *
 */
public class SelOrderByTimeAndCreaterDto {

	private String ordernum;//订单编号
	private String zdrname;//制单人name
	private String gysname;//gysname
	private Long createtime;//创建时间
	private int num;//订单数量
	private Double totalprice;//订单总金额
	private Long uuid;//顶但uuid
	
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
	public String getZdrname() {
		return zdrname;
	}
	public void setZdrname(String zdrname) {
		this.zdrname = zdrname;
	}
	public String getGysname() {
		return gysname;
	}
	public void setGysname(String gysname) {
		this.gysname = gysname;
	}
	public Long getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Long createtime) {
		this.createtime = createtime;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(Double totalprice) {
		this.totalprice = totalprice;
	}
	@Override
	public String toString() {
		return "SelOrderByTimeAndCreaterDto [ordernum=" + ordernum
				+ ", zdrname=" + zdrname + ", gysname=" + gysname
				+ ", createtime=" + createtime + ", num=" + num
				+ ", totalprice=" + totalprice + "]";
	}
	
	
	
}

package cn.erp.dto;
/**
 * 任务详情,根据订单uuid，查询出企业名称等。
 * @author Administrator
 *
 */
public class InfoByOrderuuid {

	private String gysname;
	private int needs;
	private String orderNum;
	private String contact;
	private String tele;
	private String address;
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
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getTele() {
		return tele;
	}
	public void setTele(String tele) {
		this.tele = tele;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "InfoByOrderuuid [gysname=" + gysname + ", needs=" + needs
				+ ", orderNum=" + orderNum + ", contact=" + contact + ", tele="
				+ tele + ", address=" + address + "]";
	}
	
	
	
}



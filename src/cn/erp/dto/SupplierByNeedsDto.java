package cn.erp.dto;
/**
 * 根据供应商和发货方式，查询出供应商 等信息。
 * @author Administrator
 *
 */
public class SupplierByNeedsDto {

	private String name;//供应商name
	private int needs;//发货方式
	private String concat;//联系人
	private String tele;//
	private String address;
	private Long orderuuid;
	
	public Long getOrderuuid() {
		return orderuuid;
	}
	public void setOrderuuid(Long orderuuid) {
		this.orderuuid = orderuuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNeeds() {
		return needs;
	}
	public void setNeeds(int needs) {
		this.needs = needs;
	}
	public String getConcat() {
		return concat;
	}
	public void setConcat(String concat) {
		this.concat = concat;
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
		return "SupplierByNeedsDto [name=" + name + ", needs=" + needs
				+ ", concat=" + concat + ", tele=" + tele + ", address="
				+ address + "]";
	}
	
	
}

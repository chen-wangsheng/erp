package cn.erp.dto;

public class StoreByGlynameGoodsname {

	private String storeName;
	private String glyName;
	private String goodsName;
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getGlyName() {
		return glyName;
	}
	public void setGlyName(String glyName) {
		this.glyName = glyName;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	@Override
	public String toString() {
		return "StoreByGlynameGoodsname [storeName=" + storeName + ", glyName="
				+ glyName + ", goodsName=" + goodsName + "]";
	}
	
	
	
}

package cn.erp.dto;
/**
 * 报表，根据订单时间，供应商uuid查询  
 * @author Administrator
 *
 */
public class ExcelGoodsByTimeAndGys {

	private String goodsname;
	private Long goodsuuid;
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public Long getGoodsuuid() {
		return goodsuuid;
	}
	public void setGoodsuuid(Long goodsuuid) {
		this.goodsuuid = goodsuuid;
	}
	@Override
	public String toString() {
		return "ExcelGoodsByTimeAndGys [goodsname=" + goodsname
				+ ", goodsuuid=" + goodsuuid + "]";
	}
	
}

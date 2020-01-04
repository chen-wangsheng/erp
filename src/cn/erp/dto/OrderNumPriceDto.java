package cn.erp.dto;
/**
 * 返回订单明细价格数量
 * @author Administrator
 *
 */
public class OrderNumPriceDto {

	private Double inprice;//进货单价
	private  Double totalprice;//总价格
	private   int totalnum;//总数量
	public Double getInprice() {
		return inprice;
	}
	public void setInprice(Double inprice) {
		this.inprice = inprice;
	}
	public Double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(Double totalprice) {
		this.totalprice = totalprice;
	}
	public int getTotalnum() {
		return totalnum;
	}
	public void setTotalnum(int totalnum) {
		this.totalnum = totalnum;
	}
	@Override
	public String toString() {
		return "OrderNumPriceDto [inprice=" + inprice + ", totalprice="
				+ totalprice + ", totalnum=" + totalnum + "]";
	}
	
	
}

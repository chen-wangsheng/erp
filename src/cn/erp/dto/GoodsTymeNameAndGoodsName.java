package cn.erp.dto;
/**
 * 任务指派,根据订单id查询商品类别,商品名称
 * @author Administrator
 *
 */
public class GoodsTymeNameAndGoodsName {

	private String goodstypename;
	private String goodsname;
	public String getGoodstypename() {
		return goodstypename;
	}
	public void setGoodstypename(String goodstypename) {
		this.goodstypename = goodstypename;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	
}

package cn.erp.dto;
/**
 * 操作详情查询
 * @author Administrator
 *
 */
public class OperDetailsDto {

	private String ckname;
	private int cztype;
	private Long cztime;
	private String czname;
	private String goodsname;
	public String getCkname() {
		return ckname;
	}
	public void setCkname(String ckname) {
		this.ckname = ckname;
	}
	public int getCztype() {
		return cztype;
	}
	public void setCztype(int cztype) {
		this.cztype = cztype;
	}
	public Long getCztime() {
		return cztime;
	}
	public void setCztime(Long cztime) {
		this.cztime = cztime;
	}
	public String getCzname() {
		return czname;
	}
	public void setCzname(String czname) {
		this.czname = czname;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	@Override
	public String toString() {
		return "OperDetailsDto [ckname=" + ckname + ", cztype=" + cztype + ", cztime=" + cztime + ", czname=" + czname
				+ ", goodsname=" + goodsname + "]";
	}
	
	
	
}

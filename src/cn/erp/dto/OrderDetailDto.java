package cn.erp.dto;

import cn.erp.util.FormatUtil;

/**
 * 返回订单详情
 * @author Administrator
 *
 */
public class OrderDetailDto {

	/* private String gysname;//供应商name
	    private String zdrname;//制单人name
	    //---试图值用于 日期
	    private String createtimeView;
	    
	    public String getCreatetimeView() {
			return createtimeView;
		}*/
	    
	    
	
	 private Long uuid;

	    private String ordernum;

	    private Long creater;//制单人

	    private Long createtime;

	    private Long checker;

	    private Long checktime;

	    private Long completer;

	    private Long endtime;

	    private Integer ordertype;

	    private Integer type;

	    private Integer totalnum;

	    private Double totalprice;

	    private Long supplieruuid;
	    //
	    private Long ddxquuid;//订单详情id

	    private Long goodsuuid;

	    private Double price;

	    private Long orderuuid;

	    private Integer num;

	    private Integer surplus;

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

		public Long getCreater() {
			return creater;
		}

		public void setCreater(Long creater) {
			this.creater = creater;
		}

		public Long getCreatetime() {
			return createtime;
		}

		public void setCreatetime(Long createtime) {
			this.createtime = createtime;
			//this.createtimeView=FormatUtil.formatDate(createtime);
		}

		public Long getChecker() {
			return checker;
		}

		public void setChecker(Long checker) {
			this.checker = checker;
		}

		public Long getChecktime() {
			return checktime;
		}

		public void setChecktime(Long checktime) {
			this.checktime = checktime;
		}

		public Long getCompleter() {
			return completer;
		}

		public void setCompleter(Long completer) {
			this.completer = completer;
		}

		public Long getEndtime() {
			return endtime;
		}

		public void setEndtime(Long endtime) {
			this.endtime = endtime;
		}

		public Integer getOrdertype() {
			return ordertype;
		}

		public void setOrdertype(Integer ordertype) {
			this.ordertype = ordertype;
		}

		public Integer getType() {
			return type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public Integer getTotalnum() {
			return totalnum;
		}

		public void setTotalnum(Integer totalnum) {
			this.totalnum = totalnum;
		}

		public Double getTotalprice() {
			return totalprice;
		}

		public void setTotalprice(Double totalprice) {
			this.totalprice = totalprice;
		}

		public Long getSupplieruuid() {
			return supplieruuid;
		}

		public void setSupplieruuid(Long supplieruuid) {
			this.supplieruuid = supplieruuid;
		}

		public Long getDdxquuid() {
			return ddxquuid;
		}

		public void setDdxquuid(Long ddxquuid) {
			this.ddxquuid = ddxquuid;
		}

		public Long getGoodsuuid() {
			return goodsuuid;
		}

		public void setGoodsuuid(Long goodsuuid) {
			this.goodsuuid = goodsuuid;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

		public Long getOrderuuid() {
			return orderuuid;
		}

		public void setOrderuuid(Long orderuuid) {
			this.orderuuid = orderuuid;
		}

		public Integer getNum() {
			return num;
		}

		public void setNum(Integer num) {
			this.num = num;
		}

		public Integer getSurplus() {
			return surplus;
		}

		public void setSurplus(Integer surplus) {
			this.surplus = surplus;
		}

		@Override
		public String toString() {
			return "OrderDetailDto [uuid=" + uuid + ", ordernum=" + ordernum
					+ ", creater=" + creater + ", createtime=" + createtime
					+ ", checker=" + checker + ", checktime=" + checktime
					+ ", completer=" + completer + ", endtime=" + endtime
					+ ", ordertype=" + ordertype + ", type=" + type
					+ ", totalnum=" + totalnum + ", totalprice=" + totalprice
					+ ", supplieruuid=" + supplieruuid + ", ddxquuid="
					+ ddxquuid + ", goodsuuid=" + goodsuuid + ", price="
					+ price + ", orderuuid=" + orderuuid + ", num=" + num
					+ ", surplus=" + surplus + "]";
		}
	
	
}

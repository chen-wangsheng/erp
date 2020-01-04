package cn.erp.dto;

public class GoodsDto {
	 private Long uuid;
	 private String gysaddress;//供应商地址
	    private String name;

	    private String origin;

	    private String producer;

	    private String unit;

	    private Double inprice;

	    private Double outprice;

	    private Long goodstypeuuid;

	    private Integer usenum;

	    private Integer minnum;

	    private Integer maxnum;
	     private String gysname;//供应商name
	     
	     private String goodstypename;//商品商类别name
	      
	     
		public String getGoodstypename() {
			return goodstypename;
		}
		public void setGoodstypename(String goodstypename) {
			this.goodstypename = goodstypename;
		}
		public String getGysaddress() {
			return gysaddress;
		}
		public void setGysaddress(String gysaddress) {
			this.gysaddress = gysaddress;
		}
		public Long getUuid() {
			return uuid;
		}
		public void setUuid(Long uuid) {
			this.uuid = uuid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getOrigin() {
			return origin;
		}
		public void setOrigin(String origin) {
			this.origin = origin;
		}
		public String getProducer() {
			return producer;
		}
		public void setProducer(String producer) {
			this.producer = producer;
		}
		public String getUnit() {
			return unit;
		}
		public void setUnit(String unit) {
			this.unit = unit;
		}
		public Double getInprice() {
			return inprice;
		}
		public void setInprice(Double inprice) {
			this.inprice = inprice;
		}
		public Double getOutprice() {
			return outprice;
		}
		public void setOutprice(Double outprice) {
			this.outprice = outprice;
		}
		public Long getGoodstypeuuid() {
			return goodstypeuuid;
		}
		public void setGoodstypeuuid(Long goodstypeuuid) {
			this.goodstypeuuid = goodstypeuuid;
		}
		public Integer getUsenum() {
			return usenum;
		}
		public void setUsenum(Integer usenum) {
			this.usenum = usenum;
		}
		public Integer getMinnum() {
			return minnum;
		}
		public void setMinnum(Integer minnum) {
			this.minnum = minnum;
		}
		public Integer getMaxnum() {
			return maxnum;
		}
		public void setMaxnum(Integer maxnum) {
			this.maxnum = maxnum;
		}
		public String getGysname() {
			return gysname;
		}
		public void setGysname(String gysname) {
			this.gysname = gysname;
		}
	
}

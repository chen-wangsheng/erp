package cn.erp.dto;

import java.util.List;

import cn.erp.util.FormatUtil;

/**
 * 返回订单所需数据
 * @author Administrator
 *
 */
public class OrderDto {

	 private String gysname;//供应商name
	    private String zdrname;//制单人name
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
  //---试图值用于 日期
    private String createtimeView;
    
    //-----
    /*private List<OrderNumPriceDto> orderNumPriceDto;
    
    
    public List<OrderNumPriceDto> getOrderNumPriceDto() {
		return orderNumPriceDto;
	}



	public void setOrderNumPriceDto(List<OrderNumPriceDto> orderNumPriceDto) {
		this.orderNumPriceDto = orderNumPriceDto;
	}*/



	public String getCreatetimeView() {
		return createtimeView;
	}

	
    
	public String getGysname() {
		return gysname;
	}

	public void setGysname(String gysname) {
		this.gysname = gysname;
	}

	public String getZdrname() {
		return zdrname;
	}

	public void setZdrname(String zdrname) {
		this.zdrname = zdrname;
	}

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
		this.createtimeView=FormatUtil.formatDate(createtime);
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

	@Override
	public String toString() {
		return "OrderDto [gysname=" + gysname + ", zdrname=" + zdrname
				+ ", uuid=" + uuid + ", ordernum=" + ordernum + ", creater="
				+ creater + ", createtime=" + createtime + ", checker="
				+ checker + ", checktime=" + checktime + ", completer="
				+ completer + ", endtime=" + endtime + ", ordertype="
				+ ordertype + ", type=" + type + ", totalnum=" + totalnum
				+ ", totalprice=" + totalprice + ", supplieruuid="
				+ supplieruuid + "]";
	}
   
	
	
}

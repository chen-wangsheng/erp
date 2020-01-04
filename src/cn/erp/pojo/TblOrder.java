package cn.erp.pojo;

public class TblOrder {
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
        this.ordernum = ordernum == null ? null : ordernum.trim();
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
}
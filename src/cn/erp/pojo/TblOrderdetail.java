package cn.erp.pojo;

public class TblOrderdetail {
    private Long uuid;

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
}
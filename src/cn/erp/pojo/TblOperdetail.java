package cn.erp.pojo;

public class TblOperdetail {
    private Long uuid;

    private Long empuuid;

    private Long opertime;

    private Integer type;

    private Long goodsuuid;

    private Long storeuuid;

    private Integer num;

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public Long getEmpuuid() {
        return empuuid;
    }

    public void setEmpuuid(Long empuuid) {
        this.empuuid = empuuid;
    }

    public Long getOpertime() {
        return opertime;
    }

    public void setOpertime(Long opertime) {
        this.opertime = opertime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getGoodsuuid() {
        return goodsuuid;
    }

    public void setGoodsuuid(Long goodsuuid) {
        this.goodsuuid = goodsuuid;
    }

    public Long getStoreuuid() {
        return storeuuid;
    }

    public void setStoreuuid(Long storeuuid) {
        this.storeuuid = storeuuid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
package cn.erp.pojo;

public class TblGoodstype {
    private Long uuid;

    private String name;

    private Long supplieruuid;

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
        this.name = name == null ? null : name.trim();
    }

    public Long getSupplieruuid() {
        return supplieruuid;
    }

    public void setSupplieruuid(Long supplieruuid) {
        this.supplieruuid = supplieruuid;
    }
}
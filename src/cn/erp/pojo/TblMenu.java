package cn.erp.pojo;

public class TblMenu {
    private Long uuid;

    private String name;

    private String url;

    private Long puuid;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Long getPuuid() {
        return puuid;
    }

    public void setPuuid(Long puuid) {
        this.puuid = puuid;
    }
}
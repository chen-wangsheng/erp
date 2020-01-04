package cn.erp.dto;
/**
 * 返回仓库信息
 * @author Administrator
 *
 */
public class StoreDto {

	private String glyname;//仓库管理员name
	private Long glyuuid;
	
	private Long uuid;

    private String name;

    private String address;

    private Long empuuid;

    
    
    
	public Long getGlyuuid() {
		return glyuuid;
	}

	public void setGlyuuid(Long glyuuid) {
		this.glyuuid = glyuuid;
	}

	public String getGlyname() {
		return glyname;
	}

	public void setGlyname(String glyname) {
		this.glyname = glyname;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getEmpuuid() {
		return empuuid;
	}

	public void setEmpuuid(Long empuuid) {
		this.empuuid = empuuid;
	}
    
	
	
}

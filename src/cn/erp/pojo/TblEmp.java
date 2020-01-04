package cn.erp.pojo;

import cn.erp.util.FormatUtil;

public class TblEmp {
    private Long uuid;

    private String username;

    private String pwd;

    private String name;

    private String email;

    private String tele;

    private String address;

    private Integer gender;

    private Long birthday;

    private Long depuuid;

    private Long roleid;//此字段废除

    private String lastloginip;

    private Integer logintimes;

    
    //---试图值用于 日期
    private String birthdayView;
    
    
    public String getBirthdayView() {
		return birthdayView;
	}

	public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele == null ? null : tele.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Long getBirthday() {
        return birthday;
    }

    public void setBirthday(Long birthday) {
    	this.birthday = birthday;
	      this.birthdayView=FormatUtil.formatDate(birthday);
    }

    public Long getDepuuid() {
        return depuuid;
    }

    public void setDepuuid(Long depuuid) {
        this.depuuid = depuuid;
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public String getLastloginip() {
        return lastloginip;
    }

    public void setLastloginip(String lastloginip) {
        this.lastloginip = lastloginip == null ? null : lastloginip.trim();
    }

    public Integer getLogintimes() {
        return logintimes;
    }

    public void setLogintimes(Integer logintimes) {
        this.logintimes = logintimes;
    }
}
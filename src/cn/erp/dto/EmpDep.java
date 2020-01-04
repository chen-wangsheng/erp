package cn.erp.dto;

import java.io.Serializable;

import cn.erp.util.FormatUtil;

/**
 * 返回部门员工对应值
 * @author Administrator
 *
 */
public class EmpDep implements Serializable{
	private String depName;//部门名字
	 private String username;
	 private Long uuid;//雇员id
	    private String pwd;

	    private String name;

	    private String email;

	    private String tele;

	    private String address;

	    private Integer gender;

	    private Long birthday;

	    private Long depuuid;

	    private Long lastlogintime;

	    private String lastloginip;

	    private Integer logintimes;

	    //---试图值用于 日期
	    private String birthdayView;
	    private Long jueseid;//用于返回员工对应的角色id
	    
		public Long getJueseid() {
			return jueseid;
		}

		public void setJueseid(Long jueseid) {
			this.jueseid = jueseid;
		}

		public Long getUuid() {
			return uuid;
		}

		public void setUuid(Long uuid) {
			this.uuid = uuid;
		}

		public String getDepName() {
			return depName;
		}

		public void setDepName(String depName) {
			this.depName = depName;
		}

		public String getDeName() {
			return depName;
		}

		public void setDeName(String depName) {
			this.depName = depName;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPwd() {
			return pwd;
		}

		public void setPwd(String pwd) {
			this.pwd = pwd;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getTele() {
			return tele;
		}

		public void setTele(String tele) {
			this.tele = tele;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
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

		public Long getLastlogintime() {
			return lastlogintime;
		}

		public void setLastlogintime(Long lastlogintime) {
			this.lastlogintime = lastlogintime;
		}

		public String getLastloginip() {
			return lastloginip;
		}

		public void setLastloginip(String lastloginip) {
			this.lastloginip = lastloginip;
		}

		public Integer getLogintimes() {
			return logintimes;
		}

		public void setLogintimes(Integer logintimes) {
			this.logintimes = logintimes;
		}

		public String getBirthdayView() {
			return birthdayView;
		}

		
	    
	
}

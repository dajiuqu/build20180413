package com.wl.model;

public class UserRole {
	private String id;
	private String userid;
	private String roleid;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getRoleid() {
		return roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	@Override
	public String toString() {
		return "UserRole [id=" + id + ", userid=" + userid + ", roleid=" + roleid + "]";
	}

}

package com.wl.model;

public class RoleResource {
	private String id;
	private String roleid;
	private String resourceid;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoleid() {
		return roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public String getResourceid() {
		return resourceid;
	}

	public void setResourceid(String resourceid) {
		this.resourceid = resourceid;
	}

	@Override
	public String toString() {
		return "RoleResource [id=" + id + ", roleid=" + roleid + ", resourceid=" + resourceid + "]";
	}

}

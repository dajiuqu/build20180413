package com.wl.model;

import java.util.List;

public class RoleResourceDao implements RoleResourceMapper {

	public void insert(RoleResource item) {
		// TODO Auto-generated method stub
		CommonDao<RoleResource, String> dao = new CommonDao<RoleResource, String>(RoleResourceMapper.class);
		dao.insert(item);
	}

	public void delete(String id) {
		// TODO Auto-generated method stub
		CommonDao<RoleResource, String> dao = new CommonDao<RoleResource, String>(RoleResourceMapper.class);
		dao.delete(id);
	}

	public void update(RoleResource item) {
		// TODO Auto-generated method stub
		CommonDao<RoleResource, String> dao = new CommonDao<RoleResource, String>(RoleResourceMapper.class);
		dao.update(item);
	}

	public RoleResource find(String id) {
		// TODO Auto-generated method stub
		CommonDao<RoleResource, String> dao = new CommonDao<RoleResource, String>(RoleResourceMapper.class);
		return dao.find(id);
	}

	public List<RoleResource> findAll() {
		// TODO Auto-generated method stub
		CommonDao<RoleResource, String> dao = new CommonDao<RoleResource, String>(RoleResourceMapper.class);
		return dao.findAll();
	}

}

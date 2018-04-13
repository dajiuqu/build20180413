package com.wl.model;

import java.util.List;

public class UserRoleDao implements UserRoleMapper {

	public void insert(UserRole item) {
		// TODO Auto-generated method stub
		CommonDao<UserRole, String> dao = new CommonDao<UserRole, String>(UserRoleMapper.class);
		dao.insert(item);
	}

	public void delete(String id) {
		// TODO Auto-generated method stub
		CommonDao<UserRole, String> dao = new CommonDao<UserRole, String>(UserRoleMapper.class);
		dao.delete(id);
	}

	public void update(UserRole item) {
		// TODO Auto-generated method stub
		CommonDao<UserRole, String> dao = new CommonDao<UserRole, String>(UserRoleMapper.class);
		dao.update(item);
	}

	public UserRole find(String id) {
		// TODO Auto-generated method stub
		CommonDao<UserRole, String> dao = new CommonDao<UserRole, String>(UserRoleMapper.class);
		return dao.find(id);
	}

	public List<UserRole> findAll() {
		// TODO Auto-generated method stub
		CommonDao<UserRole, String> dao = new CommonDao<UserRole, String>(UserRoleMapper.class);
		return dao.findAll();
	}

}

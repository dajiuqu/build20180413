package com.wl.model;

import java.util.List;

public class UserDao implements UserMapper {

	public void insert(User user) {
		CommonDao<User, String> dao = new CommonDao<User, String>(UserMapper.class);
		dao.insert(user);
	}

	public void delete(String id) {
		CommonDao<User, String> dao = new CommonDao<User, String>(UserMapper.class);
		dao.delete(id);
	}

	public void update(User user) {
		CommonDao<User, String> dao = new CommonDao<User, String>(UserMapper.class);
		dao.update(user);

	}

	public User find(String id) {
		CommonDao<User, String> dao = new CommonDao<User, String>(UserMapper.class);
		return dao.find(id);
	}

	public List<User> findAll() {
		CommonDao<User, String> dao = new CommonDao<User, String>(UserMapper.class);
		return dao.findAll();
	}

}

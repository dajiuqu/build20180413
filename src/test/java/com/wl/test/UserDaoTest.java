package com.wl.test;

import java.util.List;

import org.junit.Test;

import com.wl.model.CommonDao;
import com.wl.model.Resource;
import com.wl.model.ResourceDao;
import com.wl.model.Role;
import com.wl.model.RoleDao;
import com.wl.model.RoleResource;
import com.wl.model.RoleResourceDao;
import com.wl.model.RoleResourceMapper;
import com.wl.model.User;
import com.wl.model.UserDao;
import com.wl.model.UserRole;
import com.wl.model.UserRoleDao;

public class UserDaoTest {

	@Test
	public void TestUserDao() {
		UserDao dao = new UserDao();
		for (int i = 11; i < 15; i++) {
			User one = new User();
			one.setId("id" + i);
			one.setName("name" + i);
			one.setPassword("password" + i);
			dao.insert(one);
		}
		User x = dao.find("id12");
		x.setPassword("44444");
		dao.update(x);
		x = dao.find("id12");
		dao.delete("id13");

		x = dao.find("id13");
		List<User> itms = dao.findAll();
	}

	@Test
	public void TestCommonDao() {
		CommonDao<RoleResource, String> roleDao = new CommonDao<RoleResource, String>(RoleResourceMapper.class);

		// roledao.insert(item);
		RoleResource role = null;
		// RoleResourceDao roleDao = new RoleResourceDao();
		for (int i = 15; i < 20; i++) {
			role = new RoleResource();
			role.setId("id" + i);
			role.setRoleid("name" + i);
			role.setResourceid("desc" + i);
			roleDao.insert(role);
		}
		role = roleDao.find("id0");
		role.setResourceid("ggg");
		roleDao.update(role);
		roleDao.delete("id9");
		role = roleDao.find("id9");
		List<RoleResource> roles = roleDao.findAll();
	}

	@Test
	public void test1() {
		Role role = null;
		RoleDao roleDao = new RoleDao();
		// for (int i = 0; i < 10; i++) {
		// role = new Role();
		// role.setId("id" + i);
		// role.setName("name" + i);
		// role.setDescription("desc" + i);
		// roleDao.insert(role);
		// }
		role = roleDao.find("id0");
		role.setName("xx");
		roleDao.update(role);
		roleDao.delete("id9");
		List<Role> roles = roleDao.findAll();

		// User obj = userDao.find("111");
		// System.out.println(obj);
	}

	@Test
	public void testUserRoleDao() {
		UserRole role = null;
		UserRoleDao roleDao = new UserRoleDao();
		for (int i = 0; i < 10; i++) {
			role = new UserRole();
			role.setId("id" + i);
			role.setRoleid("name" + i);
			role.setUserid("desc" + i);
			roleDao.insert(role);
		}
		role = roleDao.find("id0");
		role.setRoleid("xx");
		roleDao.update(role);
		roleDao.delete("id9");
		role = roleDao.find("id9");
		// List<Role> roles = roleDao.findAll();

		// User obj = userDao.find("111");
		// System.out.println(obj);
	}

	@Test
	public void testResourceDao() {
		Resource role = null;
		ResourceDao roleDao = new ResourceDao();
		for (int i = 0; i < 10; i++) {
			role = new Resource();
			role.setId("id" + i);
			role.setUrl("name" + i);
			role.setDescription("desc" + i);
			roleDao.insert(role);
		}
		role = roleDao.find("id0");
		role.setUrl("xx");
		roleDao.update(role);
		roleDao.delete("id9");
		role = roleDao.find("id9");
		List<Resource> roles = roleDao.findAll();

		// User obj = userDao.find("111");
		// System.out.println(obj);
	}

	@Test
	public void TestRoleResourceDao() {
		RoleResource role = null;
		RoleResourceDao roleDao = new RoleResourceDao();
		for (int i = 0; i < 10; i++) {
			role = new RoleResource();
			role.setId("id" + i);
			role.setRoleid("name" + i);
			role.setResourceid("desc" + i);
			roleDao.insert(role);
		}
		role = roleDao.find("id0");
		role.setResourceid("ggg");
		roleDao.update(role);
		roleDao.delete("id9");
		role = roleDao.find("id9");
		List<RoleResource> roles = roleDao.findAll();
	}
}

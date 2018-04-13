package com.wl.help;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlHelper {

	private static SqlSessionFactory sessionFactory;
	static {
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream("mybatis.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sessionFactory = (new SqlSessionFactoryBuilder()).build(inputStream);

	}

	public static SqlSessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static SqlSession getSession()
	{
		return sessionFactory.openSession();
	}

}

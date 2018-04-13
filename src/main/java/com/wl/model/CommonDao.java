package com.wl.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.wl.help.SqlHelper;

public class CommonDao<T, K> implements CommonMapper<T, K> {

	private Class<?> mclass = null;

	public Class<?> getMclass() {
		return mclass;
	}

	public void setMclass(Class<?> mclass) {
		this.mclass = mclass;
	}

	public CommonDao(Class<?> mclass) {
		super();
		this.mclass = mclass;
	}

	public void insert(T item) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		SqlSession session = SqlHelper.getSession();
		try {
			CommonMapper<T, K> mapper = (CommonMapper<T, K>) session.getMapper(this.getMclass());
			mapper.insert(item);

			session.commit();

		} catch (Exception ex) {
			System.out.println(ex);
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void delete(K id) {
		// TODO Auto-generated method stub
		SqlSession session = SqlHelper.getSession();
		try {
			CommonMapper<T, K> mapper = (CommonMapper<T, K>) session.getMapper(this.getMclass());
			mapper.delete(id);

			session.commit();

		} catch (Exception ex) {
			System.out.println(ex);
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void update(T item) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		SqlSession session = SqlHelper.getSession();
		try {
			CommonMapper<T, K> mapper = (CommonMapper<T, K>) session.getMapper(this.getMclass());
			mapper.update(item);

			session.commit();

		} catch (Exception ex) {
			System.out.println(ex);
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public T find(K id) {
		T item = null;
		// TODO Auto-generated method stub
		SqlSession session = SqlHelper.getSession();
		try {
			CommonMapper<T, K> mapper = (CommonMapper<T, K>) session.getMapper(this.getMclass());
			item = mapper.find(id);

			session.commit();

		} catch (Exception ex) {
			System.out.println(ex);
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return item;
	}

	public List<T> findAll() {
		List<T> item = null;
		// TODO Auto-generated method stub
		SqlSession session = SqlHelper.getSession();
		try {
			CommonMapper<T, K> mapper = (CommonMapper<T, K>) session.getMapper(this.getMclass());
			item = mapper.findAll();

			session.commit();

		} catch (Exception ex) {
			System.out.println(ex);
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return item;

	}

}

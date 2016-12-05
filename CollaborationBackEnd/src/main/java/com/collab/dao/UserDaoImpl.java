package com.collab.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.collab.model.User;

@Repository("UserDao")
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory factory;
	
	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	
	public void saveUser(User u) {
		Session session;
		session= factory.getCurrentSession();
		session.save(u);

	}

	
	public List<User> getAllUsers() {
		Session session;
		
		session=factory.getCurrentSession();
		
		@SuppressWarnings({ "unchecked", "deprecation" })
		List<User> list=(List<User>) session.createCriteria(User.class).list();
		
		return list;
	
	}

	public User getUserByEmail(String email) {
		String hql = "from UserDetails where emailid=" + "'" + email + "'" ;
		Session session=factory.getCurrentSession();
		
		@SuppressWarnings({ "rawtypes", "deprecation" })
		Query query= session.createQuery(hql);
		@SuppressWarnings({ "unchecked", "deprecation" })
		List<User> list = (List<User>)query.list();
		
		if(list !=null && !list.isEmpty())
		{
			return list.get(0);
		}
		return null;
	}

	public User getUserById(Integer id) {
		User u=new User();
		u=factory.getCurrentSession().get(User.class, id);
		return u;
		
	}

	public void deleteUser(Integer id) {
		User u=getUserById(id);
		Session session=factory.getCurrentSession();
		session.delete(u);

	}

	

}

package com.collab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.collab.dao.UserDao;
import com.collab.model.User;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
public void saveUser(User u) {
		
		userDao.saveUser(u);
		
	}
public List<User> getAllUsers() {
	
	 return userDao.getAllUsers();
		
	}
	
	
public User getUserByEmail(String email) {
		
		return userDao.getUserByEmail(email);
		
		
	}
	
	
	public User getUserById(Integer id){
		
		return userDao.getUserById(id);
		
		
	}
	
	public void deleteUser(Integer id) {
		
		userDao.deleteUser(id);
	}


}

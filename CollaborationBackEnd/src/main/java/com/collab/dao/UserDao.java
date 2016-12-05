package com.collab.dao;

import java.util.List;

import com.collab.model.User;

public interface UserDao {

	void saveUser(User u);
	
	List<User> getAllUsers();
	
	User getUserByEmail(String email);
	
	User getUserById(Integer id);
	
	
	void deleteUser(Integer id);
}

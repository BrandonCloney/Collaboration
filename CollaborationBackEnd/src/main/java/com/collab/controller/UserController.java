package com.collab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.collab.model.User;
import com.collab.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user/{id}", method = RequestMethod.GET )
	public ResponseEntity<User> get(@PathVariable("id") Integer id) 
	{
		User user = userService.getUserById(id);
		
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@RequestMapping(value= "/user", method = RequestMethod.GET)
	public ResponseEntity<List<User>> list() 
	{	
		System.out.println("list od user obt");
		List<User> list = userService.getAllUsers();
		return new ResponseEntity<List<User>>(list, HttpStatus.OK);
	}
	

	@RequestMapping(value="/user", method=RequestMethod.POST)
	public ResponseEntity<User> saveNewUser(@RequestBody User user)
	{
		try
		{
			System.out.println("User save reached");
		userService.saveUser(user);
		System.out.println("user saved");
		User u = new User();
		u.setErrorcode("200");
		u.setErrormsg("Successfully saved");
		return new ResponseEntity<User>(u,HttpStatus.CREATED);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			User errormg=new User();
			errormg.setErrorcode("404");
			errormg.setErrormsg("Could not Create");
			return new ResponseEntity<User>(errormg,HttpStatus.CONFLICT);
		
		}	
			
	}
	
	@RequestMapping(value="/user/{id}", method = RequestMethod.DELETE )
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		
		userService.deleteUser(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
		


}

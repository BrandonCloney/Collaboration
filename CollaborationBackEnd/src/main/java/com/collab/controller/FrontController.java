package com.collab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontController {
	
	@RequestMapping("/")
	public String home()
	{
		
		// Blog, User, Comment Works Fine
		// Friendship to be tested
		return "index";
		
		
		
	}

}

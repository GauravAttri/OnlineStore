 package com.niit.trendystore.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String homePage()
	{
		return "index";
	}
	@RequestMapping("/about")
	public String aboutPage()
	{
		return "about";
	}
	@RequestMapping("/contact")
	public String contactPage()
	{
		return "contact";
	}
	


	
	

	





}

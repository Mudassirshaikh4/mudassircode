package com.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class propercontroller
{
@RequestMapping("/")
	public String guest()
	{
		System.out.println("hiii come to be ");
	return"guest";
	}
@RequestMapping("/jump")
public String jump()
{
System.out.println("this is dump page");
	return"jump";	
}
}

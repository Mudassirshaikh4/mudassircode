package com.boot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class exactcontroller 
{
@RequestMapping("/")
	public String guest()
{
System.out.println("this is main page");
	return"guest";
}	
}

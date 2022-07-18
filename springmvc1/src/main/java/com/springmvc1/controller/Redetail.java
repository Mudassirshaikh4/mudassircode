package com.springmvc1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class Redetail
{
@RequestMapping("/first")
public RedirectView first()
{
	System.out.println("this is your first page");
	RedirectView r=new RedirectView();
	r.setUrl("https://www.google.com");
	return r;
}
@RequestMapping("/second")
public String second()
{
	System.out.println("this is your second page");
	return"Detail";
}
}


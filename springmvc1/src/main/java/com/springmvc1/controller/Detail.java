package com.springmvc1.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc1.model.Bark;

import springmvc.barkserve.Barkserve;

@Controller
public class Detail {
	@Autowired
	private Barkserve barkserve;
	
	@ModelAttribute
	public void passion(Model m)
	{
		m.addAttribute("clue","match to be column");
		m.addAttribute("march","right to be do");
	System.out.println("hiii ");
	}
	@RequestMapping("/Detail")
	public String frontform() {
System.out.println("bye");
		return "Detail";
	}
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String surpriseform(@ModelAttribute Bark bark,Model model)
	{
	    
		System.out.println(bark);
	   this.barkserve.makeBark(bark);
	    return "fly";
	}
}
/*
@RequestMapping(path = "/processform", method = RequestMethod.POST)
public String surpriseform(@RequestParam(name="Email")String Emailaddress,@RequestParam("username")String Username,@RequestParam("password")String UserPassword,Model model) {

//	System.out.println("user Email is " + Emailaddress);
//	System.out.println("user name is " + Username);
//	System.out.println("user password " + UserPassword);
	
    Bark bark=new Bark();
    bark.setGmail(Emailaddress);
    bark.setUsername(Username);
    bark.setPassword(UserPassword);
    System.out.println(bark);
    
	//model.addAttribute("Email",Emailaddress);
	//model.addAttribute("name",Username);
	//model.addAttribute("password", Userpassword);
	
	model.addAttribute("bark",bark);
	return "fly";
}
}*/

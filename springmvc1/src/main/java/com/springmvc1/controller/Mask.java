package com.springmvc1.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class Mask 
{
@RequestMapping(path="/mask",method=RequestMethod.POST)
	public String mask(Model model)
{
	System.out.println("it is your safety");
	model.addAttribute("section","human resource");
	model.addAttribute("number" ,4365);
	List<String> model1=new ArrayList<String>();
	model1.add("top hundred");
	model1.add("down fifty");
	model1.add("middle eight");
	model.addAttribute("m",model1);
return "Index";
}
@RequestMapping("/range")
public String range()
{
System.out.println("can be possible do");
	return "rate";
}
@RequestMapping("/batch")
public ModelAndView batch()
{
System.out.println("this is batch");
ModelAndView modelandview=new ModelAndView(); 	
modelandview.addObject("vehicle","Alto" );

modelandview.addObject("swiftdezire",876043);
LocalDateTime now=LocalDateTime.now();
modelandview.addObject("time",now);
List<Integer> list=new ArrayList<Integer>();
list.add(8765);
list.add(4912);
list.add(8712);

modelandview.addObject("revenue", list);
modelandview.setViewName("batch");
return modelandview;
}
}

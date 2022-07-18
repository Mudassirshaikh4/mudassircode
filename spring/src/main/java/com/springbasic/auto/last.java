package com.springbasic.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class last {

	public static void main(String[] args) 
	{
	ApplicationContext con=new ClassPathXmlApplicationContext("com/springbasic/auto/autowire.xml"); 
    Location loc= con.getBean("loc",Location.class);
	System.out.println(loc);
	}
}

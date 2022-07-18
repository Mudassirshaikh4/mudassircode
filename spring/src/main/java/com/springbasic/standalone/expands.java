package com.springbasic.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class expands {

	public static void main(String[] args) 
	{
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springbasic/standalone/standconfig.xml");
        supermart su=con.getBean("super",supermart.class);
	System.out.println(su);
	System.out.println(su.getProduct().getClass().getName());
	System.out.println("_______________________-");
	System.out.println(su.getPrice());
	System.out.println(su.getPrice().getClass().getName());
	System.out.println("___________");
	System.out.println(su);
	System.out.println(su.getProperties());
	}
}

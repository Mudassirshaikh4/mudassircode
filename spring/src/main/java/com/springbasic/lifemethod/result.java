package com.springbasic.lifemethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class result {

	public static void main(String[] args) 
	{
	AbstractApplicationContext con=new ClassPathXmlApplicationContext("com/springbasic/lifemethod/lifecyclemethod.xml");
    //Furniture f=(Furniture)con.getBean("f11"); 
	//System.out.println(f);
	con.registerShutdownHook();
	//Chair c=(Chair) con.getBean("c2");
	//System.out.println(c);
	Shirt s=(Shirt)con.getBean("s4");
	System.out.println(s);
	}
}

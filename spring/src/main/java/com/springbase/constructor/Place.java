package com.springbase.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Place {

	public static void main(String[] args) 
	{
	ApplicationContext con=new ClassPathXmlApplicationContext("com/springbase/constructor/ciinject.xml");
    //Travel t=(Travel) con.getBean("travel");
	//System.out.println(t);
	
	plus met=(plus) con.getBean("met");
	met.doSum();
	}
}

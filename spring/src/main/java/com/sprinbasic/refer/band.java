package com.sprinbasic.refer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class band 
{
	public static void main(String[] args) 
	{
	ApplicationContext context=new ClassPathXmlApplicationContext("com/sprinbasic/refer/referdetect.xml");
	Bachelor b=(Bachelor) context.getBean("bach");	
    System.out.println(b.getA()+" "+b.getC());
	System.out.println(b.getView());
	System.out.println(b);
	}
}

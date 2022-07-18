package com.springbasic.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Institute 
{
	public static void main(String[] args)
	{
   ApplicationContext con=new ClassPathXmlApplicationContext("com/springbasic/collection/collectdetect.xml");	
	Attendace attendent=(Attendace)con.getBean("attendent");	
    
	System.out.println(attendent.getStudentname());
	System.out.println(attendent.getDuration());
	System.out.println(attendent.getAddresses());
	System.out.println(attendent.getSubject());
	}
}

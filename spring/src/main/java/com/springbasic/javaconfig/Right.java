package com.springbasic.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Right {

	public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(javaconf.class);
    Bureau b=context.getBean("third",Bureau.class);
	System.out.println(b);
	b.investigate();
	}
}

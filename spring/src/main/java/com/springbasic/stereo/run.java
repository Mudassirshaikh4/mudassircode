package com.springbasic.stereo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class run {

	public static void main(String[] args) 
	{
	ApplicationContext con=new ClassPathXmlApplicationContext("com/springbasic/stereo/stereoconfig.xml");
	Cycle cycle=con.getBean("obj",Cycle.class);	
    //System.out.println(cycle);
	//System.out.println(cycle.getMaterial().getClass().getName());
	//System.out.println(cycle.hashCode());
	//Cycle cycle1=con.getBean("obj",Cycle.class);
	//System.out.println(cycle.hashCode());
	
	behvave b=con.getBean("beh",behvave.class);
	behvave b1=con.getBean("beh",behvave.class);
	System.out.println(b.hashCode());
	System.out.println(b1.hashCode());
	}
}

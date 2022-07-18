package com.springbasic;

import java.beans.beancontext.BeanContextServiceProviderBeanInfo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context= new ClassPathXmlApplicationContext("detect.xml");
      Merah mr=(Merah)context.getBean("merah");
      Merah mr2=(Merah)context.getBean("merah3");	
    	System.out.println(mr2);
      System.out.println(mr);
    }
}

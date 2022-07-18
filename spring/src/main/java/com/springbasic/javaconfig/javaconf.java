package com.springbasic.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaconf
{
@Bean
	public Civil getCivil()
	{
	return new Civil();
	}
	@Bean(name={"first","second","third"})
	public Bureau getBureau()
{
Bureau b=new Bureau(getCivil());	
return b;
}
}

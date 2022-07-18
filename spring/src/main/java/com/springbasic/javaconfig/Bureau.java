package com.springbasic.javaconfig;

import org.springframework.stereotype.Component;

public class Bureau
{
private Civil civil;
	public Civil getCivil() {
	return civil;
}
public void setCivil(Civil civil) {
	this.civil = civil;
}
	public void investigate()
{
this.civil.jum();
		System.out.println("case evidence audit");	
}
	public Bureau(Civil civil) {
		super();
		this.civil = civil;
	}
}

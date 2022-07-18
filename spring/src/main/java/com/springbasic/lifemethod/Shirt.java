package com.springbasic.lifemethod;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Shirt
{
@Override
	public String toString() {
		return "Shirt [quantity=" + quantity + "]";
	}
private int quantity;

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public Shirt() {
	super();
	// TODO Auto-generated constructor stub
	}
@PostConstruct
public void start()
{
System.out.println("yes it is");	
}
@PreDestroy
public void end()
{
System.out.println("begin to check");	
}
}	


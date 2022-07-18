package com.springbasic.lifemethod;

public class Furniture 
{
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	System.out.println("setting price");
	this.price = price;
}
public Furniture()
{
	super();	
}
@Override
public String toString() {
	return "Furniture [price=" + price + "]";
}	
public void fact()
{
	System.out.println("inside init method : fact check in the project");
}
public void check()
{
System.out.println("inside destroy method :check in the file");	
}
}


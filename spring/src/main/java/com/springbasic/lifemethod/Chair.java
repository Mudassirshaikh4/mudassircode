package com.springbasic.lifemethod;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Chair implements InitializingBean,DisposableBean
{
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Chair() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Chair [price=" + price + "]";
}

public void afterPropertiesSet() throws Exception {
	System.out.println("taking chairs : init");

}

public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("going to client delivery : destroy");
}	
}

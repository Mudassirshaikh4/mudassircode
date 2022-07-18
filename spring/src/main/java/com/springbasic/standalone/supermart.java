package com.springbasic.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class supermart
{
private List<String> product;
private Map<String, Integer>price;
private Properties properties;
public Map<String, Integer> getPrice() {
	return price;
}

public Properties getProperties() {
	return properties;
}

public void setProperty(Properties property) {
	this.properties = property;
}

public void setPrice(Map<String, Integer> price) {
	this.price = price;
}

public List<String> getProduct() {
	return product;
}

public void setProduct(List<String> product) {
	this.product = product;
}
@Override
public String toString() {
	return "supermart [product=" + product + ", price=" + price + ", property=" + properties + "]";
}
}

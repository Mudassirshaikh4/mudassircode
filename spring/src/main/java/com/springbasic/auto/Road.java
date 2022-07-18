package com.springbasic.auto;

public class Road 
{
private int length;
private String material;
private String days;
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}
public String getDays() {
	return days;
}
public void setDays(String days) {
	this.days = days;
}
@Override
public String toString() {
	return "Road [length=" + length + ", material=" + material + ", days=" + days + "]";
}
}

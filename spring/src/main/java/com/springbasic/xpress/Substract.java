package com.springbasic.xpress;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Substract
{
@Value("#{2+3-5+9}")
private int a;
@Value("#{6+4-3+1}")
private int b;
@Value("#{ new java.lang.String('arbaz khan')}")
private String name;
public double getC() {
	return c;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void setC(int c) {
	this.c = c;
}
@Value("#{ T(java.lang.Math).sqrt(144) }")
private double c;

public double getE() {
	return e;
}
public void setE(double e) {
	this.e = e;
}
public void setC(double c) {
	this.c = c;
}
@Value("#{T (java.lang.Math).PI}")
private double e;
@Value("#{ 5-2<3 } ")
private boolean isActive;
public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public int getB() {
	return b;
}
public void setB(int b) {
	this.b = b;
}
@Override
public String toString() {
	return "Substract [a=" + a + ", b=" + b + ", name=" + name + ", c=" + c + ", e=" + e + ", isActive=" + isActive
			+ "]";
}
}

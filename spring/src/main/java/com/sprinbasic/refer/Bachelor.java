package com.sprinbasic.refer;

public class Bachelor
{
private int a;
private int c;
private Single view;
public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public int getC() {
	return c;
}
public void setC(int c) {
	this.c = c;
}
public Single getView() {
	return view;
}
public void setView(Single view) {
	this.view = view;
}
public Bachelor() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Bachelor [a=" + a + ", c=" + c + ", view=" + view + "]";
}
}

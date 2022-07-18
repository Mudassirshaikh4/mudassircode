package com.springbasic;

public class Merah 
{
private int vendorid;
private String vendorname;
private String vendorlocation;
public int getVendorid() {
	return vendorid;
}
public void setVendorid(int vendorid) {
	System.out.println("please find id");
	this.vendorid = vendorid;
}
public String getVendorname() {
	return vendorname;
}
public void setVendorname(String vendorname) {
	System.out.println("please find name");
	this.vendorname = vendorname;
}
public String getVendorlocation() {
	return vendorlocation;
}
public void setVendorlocation(String vendorlocation) {
	System.out.println("please find location");
	this.vendorlocation = vendorlocation;
}
public Merah(int vendorid, String vendorname, String vendorlocation) {
	super();
	this.vendorid = vendorid;
	this.vendorname = vendorname;
	this.vendorlocation = vendorlocation;
}
public Merah() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Merah [vendorid=" + vendorid + ", vendorname=" + vendorname + ", vendorlocation=" + vendorlocation + "]";
}


}

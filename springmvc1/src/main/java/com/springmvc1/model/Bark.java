package com.springmvc1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bark 
{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String gmail;
private String username;
private String password;
public String getGmail() {
	return gmail;
}
public void setGmail(String gmail) {
	this.gmail = gmail;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Bark [email=" + gmail + ", username=" + username + ", password=" + password + "]";
}	
}

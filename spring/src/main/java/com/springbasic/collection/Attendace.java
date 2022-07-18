package com.springbasic.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Attendace
{
private String Studentname;
private List<String> duration;
private Set<String> addresses;
private Map<String,String> Subject;
private Properties props;
public Attendace() {
	super();
	// TODO Auto-generated constructor stub
}
public Attendace(String studentname, List<String> duration, Set<String> addresses, Map<String, String> subject,
		Properties props) {
	super();
	Studentname = studentname;
	this.duration = duration;
	this.addresses = addresses;
	Subject = subject;
	this.props = props;
}
public Properties getProps() {
	return props;
}
public void setProps(Properties props) {
	this.props = props;
}
public Attendace(String studentname, List<String> duration, Set<String> addresses, Map<String, String> subject) {
	super();
	Studentname = studentname;
	this.duration = duration;
	this.addresses = addresses;
	Subject = subject;
}
public String getStudentname() {
	return Studentname;
}
public void setStudentname(String studentname) {
	Studentname = studentname;
}
public List<String> getDuration() {
	return duration;
}
public void setDuration(List<String> duration) {
	this.duration = duration;
}
public Set<String> getAddresses() {
	return addresses;
}
public void setAddresses(Set<String> addresses) {
	this.addresses = addresses;
}
public Map<String, String> getSubject() {
	return Subject;
}
public void setSubject(Map<String, String> subject) {
	Subject = subject;
}	
}

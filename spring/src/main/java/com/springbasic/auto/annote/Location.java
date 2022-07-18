package com.springbasic.auto.annote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Location 
{
	@Override
	public String toString() {
		return "Location [road=" + road + "]";
	}
@Autowired	
@Qualifier("road")
private Road road;

public Road getRoad() {
	return road;
}

public void setRoad(Road road) {
	this.road = road;
}

public Location(Road road) {
	super();
	this.road = road;
	System.out.println("under the construction");
}

public Location() {
	super();
	// TODO Auto-generated constructor stub
}
}

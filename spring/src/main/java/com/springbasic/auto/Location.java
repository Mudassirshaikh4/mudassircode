package com.springbasic.auto;

public class Location 
{
@Override
	public String toString() {
		return "Location [road=" + road + "]";
	}

private Road road;

public Road getRoad() {
	return road;
}

public void setRoad(Road road) {
	System.out.println("under the road");
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

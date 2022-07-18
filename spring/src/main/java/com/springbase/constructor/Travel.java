package com.springbase.constructor;

public class Travel 
{
private int Seatno;
private String Name;	
private String Destination;
private Hillstation hill;
public Travel(int Seatno,String Name,String Destination,Hillstation hill)
{
this.Seatno=Seatno;	
this.Name=Name;
this.Destination=Destination;
this.hill=hill;
}
@Override
public String toString() {
	return this.Seatno+" : "+this.Name+" : "+this.Destination+" {"+this.hill.name+"}";

}
}	



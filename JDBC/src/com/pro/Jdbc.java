package com.pro;
import java.sql.*;
public class Jdbc 
{	
	public static void main(String[] args) 
	{
try
{
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/mudassir";
String username="root";
String password="root";
Connection con=DriverManager.getConnection(url,username,password);
if(con.isClosed())
{
System.out.println("connection is closed");
}
else
{
	System.out.println("connection created...");
}
}
catch(Exception e)
{
	e.printStackTrace();
	}
}
	}

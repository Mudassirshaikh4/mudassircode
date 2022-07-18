package EXAMPLE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class createtable4 {
	public static void main(String[] args) {
	

	
	try
	{
	Class.forName("com.mysql.jdbc.Driver");	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mudassir","root","root");	
	String query="select * from bureau";	
Statement stmt=con.createStatement();	
ResultSet set=stmt.executeQuery(query);
	
while(set.next())
{
int id = set.getInt(1);
String name=set.getString(2);
 String city=set.getString(3);
 System.out.println(id+" "+name+" "+city);
}
	}
		catch(Exception e)
	{
			e.printStackTrace();
			
	}
	}
}

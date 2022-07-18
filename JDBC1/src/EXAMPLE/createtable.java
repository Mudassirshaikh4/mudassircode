package EXAMPLE;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class createtable
{
	public static void main(String[] args) 
	{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mudassir","root","root");	
String q="insert into images(pic) values(?)";	
PreparedStatement pstmt=con.prepareStatement(q);	
FileInputStream fis=new FileInputStream("C:\\Users\\LC5669948\\Desktop\\mypic1.jpg");
//pstmt.setInt(201);
pstmt.setBinaryStream(1, fis, fis.available());
pstmt.executeUpdate();
System.out.println("done");
con.close();
}	
catch(Exception e)
{
	e.printStackTrace();
}
	}
}

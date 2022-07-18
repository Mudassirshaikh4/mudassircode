package EXAMPLE;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class createtable3 
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mudassir","root","root");
	String b="update bureau set tname=?, tcity=? where tid=?";	
	PreparedStatement pstmt=con.prepareStatement(b);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter new name : ");
	String tname=br.readLine();
	System.out.println("Enter new city : ");	
	String tcity=br.readLine();
	System.out.println("Enter the id : ");	
	int tid=Integer.parseInt(br.readLine());	
	pstmt.setString(1, tname);	
	pstmt.setString(2, tcity);	
	pstmt.setInt(3, tid);
    pstmt.executeUpdate();
	System.out.println("done");
	con.close();	
		}
catch(Exception e)
		{
	System.out.println(e);
		}	
	}
}

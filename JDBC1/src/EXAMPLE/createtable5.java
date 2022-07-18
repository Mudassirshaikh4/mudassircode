package EXAMPLE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class createtable5 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mudassir", "root", "root");
			String q = "create table water(sid int(20) primary key auto_increment,sname varchar(200)not null,scity varchar(300))";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("create table");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

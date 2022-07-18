package com.program;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondcClass extends GenericServlet
{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException 
	{
	System.out.println("this is servlet using generic services");	// TODO Auto-generated method stub
 ServletResponse res = null;
res.setContentType("text/html");		
PrintWriter out=res.getWriter();	
out.println("<h1>this is using for web pages</h1>");
out.println(new Date().toString());	
	}
}

package com.rrm;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servletsecond extends HttpServlet 
{
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
{
	resp.setContentType("text/html");	
	PrintWriter out=resp.getWriter();	
    ServletContext context = getServletContext();
	String u=(String)context.getAttribute("Park");
	out.println("<h1>");
	out.println("welcome to "+u);
	out.println("</h1>");
	}
}
}


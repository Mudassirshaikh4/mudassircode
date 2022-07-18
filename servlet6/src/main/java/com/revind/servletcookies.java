package com.revind;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servletcookies extends HttpServlet 
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();	
		String m=request.getParameter("username");
		out.println("come on to " +m);
	   Cookie ck=new Cookie("uname",m);
	   response.addCookie(ck);
	   out.println("<form action='servletsecondcookies' method='pos'>");
	   out.println("<input type='submit' value='done'>");
	   out.println("</form>");
	   out.close();
	}		
}

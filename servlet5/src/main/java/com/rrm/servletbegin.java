package com.rrm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servletbegin extends HttpServlet
{
public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();	
	String m=request.getParameter("user_name");
	out.println("come on to " +m);
   Cookie ck=new Cookie("validname",m);
   response.addCookie(ck);
   out.println("<form action='servletmedal' method='post'>");
   out.println("<button type='submit' >go to servletmedal</button>");
   out.println("</form>");
   out.close();
}		
}

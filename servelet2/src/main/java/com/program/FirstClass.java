package com.program;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;
public class FirstClass implements Servlet
{
ServletConfig conf;
	public void init(ServletConfig conf)
	{
this.conf=conf;
		System.out.println("creating object");
	}
public void service(ServletRequest req,ServletResponse resp)throws ServletException,IOException
{
System.out.println("servicing ");	
resp.setContentType("text/html");
PrintWriter out=resp.getWriter();
out.println("<h1>this is my result for servlet method:</h1>");
out.println("<h1>Todays date and time is "+new Date().toString()+"<h1>");
}
public void destroy()
{
System.out.println("going to destroy");	
}
public ServletConfig getServletConfig()
{
return this.conf;	
}
public String getServletInfo()
{
return "this.servlet is created by mudassir";	
}
}

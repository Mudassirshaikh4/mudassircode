package com.rrm;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servletfirst extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");	
PrintWriter out=res.getWriter();
ServletContext context=getServletContext();
context.setAttribute("Park", "Lonavala");
out.println("<h1>Welcome to Park to go for ready to Lonavla</h1>");
out.println("<h2><a href='servletsecond'>visit</a></h2>");
}
}

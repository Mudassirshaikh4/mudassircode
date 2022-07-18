package Examples;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class submmitservlet extends HttpServlet
{
public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
response.setContentType("text/html");	
PrintWriter out=response.getWriter();
out.println("<h2>welcome to submmitservlet</h2>");
String name=request.getParameter("user_name");
String password=request.getParameter("user_password");
String emailid=request.getParameter("user_name");
String gender=request.getParameter("user_gender");
String field=request.getParameter("user_field");
String cond=request.getParameter("condition");
if(cond!=null)
{
	if(cond.equals("checked")) {
	out.println("<h2> Name : " + name + "</h2>");	
out.println("<h2> password : " + password +"</h2>");
out.println("<h2> emailid : " + emailid + "</h2>");
out.println("<h2> gender : " + gender + "</h2>");
out.println("<h2> field : " + field + "</h2>");
RequestDispatcher rd=request.getRequestDispatcher("completeservlet");
rd.forward(request, response);	
	}
else
{
out.println("<h2> you have not accepted terms and conditions</h2>");
}
}
else
{
out.println("<h2> you have not accepted terms and conditions </h2>");
RequestDispatcher rd=request.getRequestDispatcher("index6.html");
rd.include(request, response);
}
}
}


package Examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class completeservlet extends HttpServlet
{
protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException
{
resp.setContentType("text/html");	
PrintWriter out=resp.getWriter();
out.println("this is done servlet");
out.println("<h2>complete registerd");
}
}

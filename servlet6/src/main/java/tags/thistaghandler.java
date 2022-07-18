package tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class thistaghandler extends TagSupport
{
public int doStartTag()throws JspException
{
try
{
JspWriter out=pageContext.getOut();	
out.println("<h1>this is my natural tag</h1>");	
}
catch(Exception e)
{
e.printStackTrace();
}	
return SKIP_BODY;	
}
}

package exceptionhandlefold;

public class practiceexception {

	public static void main(String[] args) 
	{
	try
	{	
	int a=10,b=0,c;
	c=a/b;
	System.out.println(c);
	}
	catch(Exception e)
	{
	System.out.println(e.toString());
	}
	System.out.println("yes it is good");
	}
}

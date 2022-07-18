package stringconstructor;

public class reverseprogram {

	public static void main(String[] args) 
	{
	String g="madam";
    String rev="";
	for(int a=g.length()-1;a>=0;a--)
    {
    	rev=rev+g.charAt(a);
    }
	if(g.equals(rev))
	{
		System.out.println("no is palindrome");
	}
	else
	{
		System.out.println("no is not palindrome");
	}
	}
}

package stringconstructor;

public class Stringmethod {

	public static void main(String[] args) 
	{
	 String d="muzaffar";
	String g="HASHMIT";
	 //System.out.println(d.indexOf('z'));	
   // System.out.println(d.lastIndexOf('r'));
    //System.out.println(d.contains("g"));
	//System.out.println(d.charAt(6));
	//System.out.println(g.toUpperCase());
	System.out.println(g.toLowerCase());
	int a=10;
	String f=String.valueOf(a);
	System.out.println(f);
	String u="ranjeet";
	char[] c=u.toCharArray();
	System.out.println(c);
	StringBuffer s=new StringBuffer();
	StringBuffer s2=s.append("wrong");
	System.out.println(s.capacity());
	s.append("congrates");
	System.out.println(s.capacity());
	s.append("marks");
	System.out.println(s.capacity());
	System.out.println(s.deleteCharAt(4));
System.out.println(s.equals(s2));
System.out.println(s.reverse());
System.out.println(s.indexOf("v"));

s.setCharAt(3,'v');
System.out.println(s);
s.setLength(6);
	System.out.println(s);
	s.ensureCapacity(50);
	s.append("ronak");
	s.trimToSize();
	System.out.println(s.capacity());
	}
}

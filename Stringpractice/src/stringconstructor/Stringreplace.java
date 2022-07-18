package stringconstructor;

public class Stringreplace {

	public static void main(String[] args) 
	{
	String g="matching for master";
		System.out.println(g.replace("ma", "ac"));
        System.out.println(g.replaceFirst("m", "g"));
        System.out.println(g.replaceAll("a", "d"));
        System.out.println(g.replaceAll("a(.*)","g"));
	}
}

package com.lambda.eight;

import java.util.Optional;

public class Optionexamp {

public static Optional<String> getName()
{
String name="micromax";	
return Optional.ofNullable(name);
}
		public static void main(String[] args)
	{
	 String st=null;
    Optional<String> optional=Optional.ofNullable(st);
	
   // System.out.println(optional.get());
	System.out.println(optional.orElse("value is present or not"));
Optional<String> naop=getName();
	System.out.println(naop.orElse("blank print"));
	}
}

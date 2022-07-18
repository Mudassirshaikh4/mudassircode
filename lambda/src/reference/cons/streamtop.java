package reference.cons;

import java.util.List;

public class streamtop {

	public static void main(String[] args) 
	{
	List<Integer> back=List.of(87,54,98,34);	
	back.stream().forEach(System.out::println);
	
	}
}

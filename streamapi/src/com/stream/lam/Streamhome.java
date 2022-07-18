package com.stream.lam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streamhome {

	public static void main(String[] args) 
	{
	List<Integer> list1=List.of(12,8,9,4,0);
 
	List<Integer> list2=new ArrayList<Integer>();
	list2.add(6);
	list2.add(8);
	list2.add(6);
	System.out.println(list2);
	List<Integer> list3=new ArrayList<>();
	for(Integer i:list1)
	{
		if(i%2==0)
		{
			list3.add(i);
			
		}
	}
	System.out.println(list1);
	System.out.println(list3);
	
	Stream<Integer> fact=list1.stream();
	List<Integer> batch =fact.filter(i-> i%2==0).collect(Collectors.toList());
	
	System.out.println(batch);
	
	List<Integer> rule=list1.stream().filter(i-> i%2==0).collect(Collectors.toList());
	System.out.println(rule);
	
	List<Integer> book=list1.stream().filter(i-> i > 4).collect(Collectors.toList());
	System.out.println(book);
	
	Stream<Object> emptystream=Stream.empty();
	emptystream.forEach(e->{
		System.out.println(e);
	});
	String names[]= {"ankit","mahesh","rajesh","kushal"};
	Stream<String> dude=Stream.of(names);
	dude.forEach(e->{
		System.out.println(e);
	});
	Stream<Object> jose=Stream.builder().build();
	IntStream resume=Arrays.stream(new int[] {4,8,7,2,4});
	resume.forEach(e->{
		System.out.println(e);
	});
	Stream<Integer> joke=list2.stream();
	joke.forEach(e->{
		System.out.println(e);
	});
	List<String> name=List.of("jharkand","maharashtra","rajasthan","uttarpradesh");
	List<String> product=name.stream().filter(e-> e.startsWith("m")).collect(Collectors.toList());
	System.out.println(product);
	
	List<Integer> part=List.of(2,4,6,8,8);
	List<Integer> subpart=part.stream().map(i-> i).collect(Collectors.toList());
	System.out.println(subpart);
	
	name.stream().forEach(e->{
		System.out.println(e);
	});
	part.stream().collect(Collectors.toList()).forEach(System.out::println);
	name.stream().forEach(System.out::println);
	
	Integer integer=part.stream().min((x,y)-> x.compareTo(y)).get();
	System.out.println(integer);
	
	Integer integer1=part.stream().max((x,y)-> x.compareTo(y)).get();
	System.out.println(integer1);
	}
}

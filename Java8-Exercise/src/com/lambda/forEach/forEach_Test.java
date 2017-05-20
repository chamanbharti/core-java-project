package com.lambda.forEach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class forEach_Test {
	public static void main(String[] args) {
		
		//1. forEach and Map
		//1.1 Normal way to loop a Map.
		
		Map<String, Integer> items = new HashMap<>();

		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		System.out.println(">>>>Map>>>>");
		System.out.println(">>>>Classical View>>>>");
		for(Map.Entry<String, Integer>entry:items.entrySet()){
			System.out.println("Item : "+entry.getKey()+" Count : "+entry.getValue());
		}
		//1.2 In Java 8, you can loop a Map with forEach + lambda expression.
		
		System.out.println(">>>>New Java8 View with forEach>>>>");
		
		items.forEach( (k,v) -> System.out.println("Item : "+k+" Count : "+v) );
		
		System.out.println(">>>>New Java8 View with Lambda >>>>");
		items.forEach( (k,v) -> {
			System.out.println("Item : "+k+" Count : "+v);
			if("E".equals(k)){
				System.out.println("Hello E");
			}
		});
		
		//2. forEach and List
		//2.1 Normal for-loop to loop a List.
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		
		System.out.println(">>>>List>>>>");
		System.out.println(">>>>Classical View>>>>");
		
		for(String item:list){
			System.out.print(item+" ");
		}
		System.out.println();
		
		//2.2 In Java 8, you can loop a List with forEach + lambda expression or method reference.
		System.out.println(">>>>New Java8 View>>>>");
		//lambda
		list.forEach( 
					  (item)-> System.out.print( item+" ")
					);
		System.out.println();
		
		//output : C
		list.forEach( item ->{
			if("C".equals(item)){
				System.out.println(item);//C
			}
		});
		
		System.out.println(">>>>New Java8 Method Reference View>>>>");
		//method reference
		list.forEach(System.out::print);//ABCDEF
		System.out.println();
		
		System.out.println(">>>>New Java8 stream and filter View>>>>");
		//stream and filter
		list.stream()
		.filter( s-> s.contains("B"))
		.forEach(System.out::println);
		
	}

}

package com.top10.exception.compiletime;

import java.util.ArrayList;
import java.util.Collections;

public class AbstractMethodError {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(223, "Rahi", 30));
		al.add(new Student(224, "Chaman", 27));
		al.add(new Student(225, "Sahil", 24));
		
		Collections.sort(al); 
		for(Student str:al){
			System.out.println(str);
		}
	}
//Exception in thread "main" java.lang.AbstractMethodError: com.top10.exception.compiletime.Student.compareTo(Ljava/lang/Object;)I
}

package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Management {
	
	public static void main(String args[]) {
		Student student1=new Student(104,"swathi",55);
		Student student2=new Student(102,"sony",70);
		Student student3=new Student(105,"swetha",30);
		Student student4=new Student(114,"sai",58);
		Student student5=new Student(111,"pranita",53);
		
		ArrayList<Student> management=new ArrayList<>();
		management.add(student1);
		management.add(student2);
		management.add(student3);
		management.add(student4);
		management.add(student5);

		
		MySort.sortList(management);
		Collections.sort(management);
		
		System.out.println("After sorting");
		MySort.sortList(management);





		
	}

}

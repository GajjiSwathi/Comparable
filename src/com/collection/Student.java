package com.collection;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private Integer marks;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public Student(int id, String name, Integer marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student student) {
		// TODO Auto-generated method stub
		
		return this.getMarks().compareTo(student.getMarks());//ascending order

		//return -this.getMarks().compareTo(student.getMarks());//descending order
		//if the current obj is less than the specified obj('a'.compareTo('z'))then return -ve 
		//if the current obj is greater than the specified obj('c'.compareTo('a'))then return +ve 
		//if the current obj is equal to the specified obj('a'.compareTo('a'))then return 0  

		

	}
	

}

package com.inheritance.demo;

public class Student {
	private int rollno; 
	private String name;
	public void inputDetail(int rollno,String name) {
		this.rollno=rollno;
		this.name=name;
	}
	public void Display() {
		System.out.println("Name : "+name);
		System.out.println("Rollno : "+rollno);
	}
}

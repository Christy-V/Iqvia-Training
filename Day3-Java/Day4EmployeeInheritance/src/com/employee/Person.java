package com.employee;

public class Person {
	private String name,id;
	public void personDetails(String name,String id) {
		this.name=name;
		this.id=id;
	}
public void displayDetails() {
	System.out.println("Name is :"+name);
	System.out.println("Id is :"+id);
}
}

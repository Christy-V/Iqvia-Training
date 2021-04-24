package com.student;

public class Student {
	/*Create a class called Student. Get the details like name, degree, age, total marks and 
percentage from the user and display the same.*/
private int age,total,percentage;
private String name,degree;
public void setAge(int age) {
	this.age = age;
}
public void setTotal(int total) {
	this.total = total;
}
public void setPercentage(int percentage) {
	this.percentage = percentage;
}
public void setName(String name) {
	this.name = name;
}
public void setDegree(String degree) {
	this.degree = degree;
}

public void Display() {
	System.out.println("Name : "+name);
	System.out.println("Age : "+age);
	System.out.println("Degree : "+degree);
	System.out.println("Total Marks : "+total);
	System.out.println("Percentage : "+percentage);
}
}

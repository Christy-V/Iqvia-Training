package com.inheritance.demo;

public class Marks extends Student {
	private int marks1 ,marks2,marks3;
	public void inputMarksDetail(int rollno, String name,int marks1,int marks2,int marks3) {
		inputDetail(rollno, name);
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
	}
	
	public int getMarks1() {
		return marks1;
	}

	public int getMarks2() {
		return marks2;
	}

	public int getMarks3() {
		return marks3;
	}

	public void displayMarks() {
		Display();
		System.out.println("Marks : "+marks1);
		System.out.println("Marks : "+marks1);	
	}
}

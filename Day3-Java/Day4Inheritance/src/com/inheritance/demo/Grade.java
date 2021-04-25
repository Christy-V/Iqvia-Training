package com.inheritance.demo;

public class Grade extends Marks {
	private char grade;
	
	public void setGrade(){
		int total=(getMarks1()+getMarks2()+getMarks3());
		if (total>270) {
			grade='A';
		}
		else {
			grade='B';
		}
	}

	public char getGrade() {
		return grade;
	}


}

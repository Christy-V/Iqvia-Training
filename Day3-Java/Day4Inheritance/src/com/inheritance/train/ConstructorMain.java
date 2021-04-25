package com.inheritance.train;
import com.inheritance.demo.*;
public class ConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Sm=new Student();
		Sm.inputDetail(33,"Chrsity");
		Sm.Display();
		
		System.out.println("===================");
		
		Marks Mk=new Marks();
		Mk.inputMarksDetail(33,"Chrsity",75,86,90);
		Mk.displayMarks();
		
		System.out.println("===================");

		Grade Gd=new Grade();
		Gd.inputMarksDetail(33,"Chrsity",75,86,90);
		Gd.setGrade();
		System.out.println("The Grade is :"+Gd.getGrade());
		
	}

}

package com.employee;

public class Employee extends Person {
	private String designation,dept;
	private int salary;
   public void employeeInput(String name,String id,String designation,String dept,int salary) {
	   personDetails(name,id);
	   this.designation=designation;
	   this.dept=dept;
	   this.salary=salary;
   }
   public void employeeDisplay() {
	   displayDetails();
	   System.out.println("Designation is :"+designation);
	   System.out.println("Dept is :"+dept);
	   System.out.println("Salary is :"+salary);
	   
   }
}

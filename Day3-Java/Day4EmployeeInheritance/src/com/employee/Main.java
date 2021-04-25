package com.employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Person P =new Person();
     Employee emp=new Employee();
     Business bs =new Business();
     P.personDetails("Raman", "Lr123");
     P.displayDetails();
     
     System.out.println("=============");
     
     emp.employeeInput("Anand", "An435", "Gerer", "boring", 2000);
     emp.employeeDisplay();
     
     System.out.println("=============");

     emp.employeeInput("Anand", "An435", "Gerer", "boring", 2000);
     emp.employeeDisplay();
     
     System.out.println("=============");
     
     bs.inputBusinessDetails("Christy", "CH10234", "Tech", 30000);
     bs.businessDisplay();
     
	}

}

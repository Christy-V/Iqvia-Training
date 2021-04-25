package com.employee;

public class Business extends Person {
	private String bus;
	private int profit;
	public void inputBusinessDetails(String name,String id,String bus,int profit) {
		personDetails(name,id);
		this.bus=bus;
		this.profit=profit;
	}
	   public void businessDisplay() {
		   displayDetails();
		   System.out.println("Business is :"+bus);
		   System.out.println("Profit is :"+profit);
	   }

}

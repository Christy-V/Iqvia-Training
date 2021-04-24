package com.mycalculator;

public class CalculatorMain {
	public static void main(String[] args) {
		MyCalculator Mclc=new MyCalculator();
		char operator;
		operator='+';
		Mclc.setNum1(3);
		Mclc.setNum2(5);
		Mclc.setOperator(operator);
		System.out.println("Result of '"+operator+"' is " +Mclc.getResult());
		
	}
}

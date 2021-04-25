package com.calculator.demo;

public class Calculator {
	private int a,b;
/*Create a class called Calculator which has 4 different methods add, diff, mul and div which 
accepts two numbers as parameters. Overload the methods such that the parameters can be 
of the following pattern.
1.Both are of int data type.
2.Both are of double data type.
3.First parameter is of int data type and second parameter is of double data type.
4.First parameter is of double data type and second parameter is of int data type.
                  Create anobject to access these methods and invoke these methods with different type of
numbers and display the result in the corresponding methods. */
	public int add(int a, int b){
		int sum=a+b;
		return sum;
	}
	public double add(double a, double b){
		double sum=a+b;
		return sum;
	}
	public double add(int a, double b){
		double sum=a+b;
		return sum;
	}
	public double add(double a, int b){
		double sum=a+b;
		return sum;
	}


	
	public int diff(int a, int b){
		int diff=a-b;
		return diff;
	}
	public double diff(double a, double b){
		double diff=a-b;
		return diff;
	}
	public double diff(int a, double b){
		double diff=a-b;
		return diff;
	}
	public double diff(double a, int b){
		double diff=a-b;
		return diff;
	}
	
	
	public int div(int a, int b){
		int div=a/b;
		return div;
	}
	public double div(double a, double b){
		double div=a/b;
		return div;
	}
	public double div(int a, double b){
		double div=a/b;
		return div;
	}
	public double div(double a, int b){
		double div=a/b;
		return div;
	}
	
	
	public int mul(int a, int b){
		int mul=a*b;
		return mul;
	}
	public double mul(double a, double b){
		double mul=a/b;
		return mul;
	}
	public double mul(int a, double b){
		double mul=a/b;
		return mul;
	}
	public double mul(double a, int b){
		double mul=a/b;
		return mul;
	}
	
	
}

package com.complex.demo;

public class Complex {
	private int real,imag;
	public Complex() {
		this.real=3;
		this.imag=5;
	}
	
	public Complex(int real,int image) {
		this.real=real;
		this.imag=image;
	}
 public void display() {
	 System.out.println("The number is : "+real+" + i"+imag);
 }
}

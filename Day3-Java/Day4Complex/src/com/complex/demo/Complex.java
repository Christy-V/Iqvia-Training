package com.complex.demo;

public class Complex {
	private int real, imag;
	
	public int getReal() {
		return real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public int getImag() {
		return imag;
	}
	public void setImag(int imag) {
		this.imag = imag;
	}

 public void Csum(Complex c1,Complex c2) {
	this.real= c1.getReal()+c2.getReal();
	this.imag= c1.getImag()+c2.getImag();
	
 }
}

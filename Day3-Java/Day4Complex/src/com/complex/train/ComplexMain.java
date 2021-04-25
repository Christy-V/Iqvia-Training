package com.complex.train;

import com.complex.demo.Complex;

public class ComplexMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 =new Complex();
		
		c1.setReal(5);
		c1.setImag(7);
		
		Complex c2=new Complex();
		c2.setReal(6);
		c2.setImag(7);
		
		Complex Sum =new Complex();
		Sum.Csum(c1, c2);
		System.out.println("Complex number is : "+Sum.getReal()+"+/-"+Sum.getImag()+"i");
	}

}

package com.shape;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape Sh=new Shape();
		System.out.println("Area of Square is:"+Sh.area(8));
		System.out.println("Area of Rectangle is:"+Sh.area(8,5));
		
		System.out.println("Perimeter of Square is:"+Sh.perimeter(8));
		System.out.println("Perimeter of Rectangle is:"+Sh.perimeter(8,5));
	}

}

package com.height;

public class HeightMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Height Hob=new Height ();
		int height =256;
		Hob.setHeight(height);
		System.out.println("Feet : "+Hob.getFeet()+" Inches : "+Hob.getInches());
		
		HeightAdd h1 =new HeightAdd();
		h1.setFeet(5);
		h1.setInches(3);
		HeightAdd h2 =new HeightAdd();
		h2.setFeet(8);
		h2.setInches(4);
		
		HeightAdd sum =new HeightAdd();
		sum.Sum(h1, h2);
		
		System.out.println("Feet : "+sum.getFeet()+" Inches : "+sum.getInches());
		
	}

}

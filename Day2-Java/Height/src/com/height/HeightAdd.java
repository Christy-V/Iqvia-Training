package com.height;

public class HeightAdd {
	private int feet,inches;
	
	
	
	public void setFeet(int feet) {
		this.feet = feet;
	}
	public void setInches(int inches) {
		this.inches = inches;
	}
	public int getFeet() {
		return feet;
	}
	public int getInches() {
		return inches;
	}
	public void Sum (HeightAdd h1,HeightAdd h2) {
		feet =h1.getFeet()+h2.getFeet();
		inches=h1.getInches()+h2.getInches();
		}

}

package com.height;

public class Height {
	private int height, feet, inches;

	public int getFeet() {
		feet=height/12;
		return feet;
	}

	public int getInches() {
		feet=height%12;
		return inches;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	

}

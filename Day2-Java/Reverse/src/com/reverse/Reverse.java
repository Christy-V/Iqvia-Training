package com.reverse;

public class Reverse {
	private int number, rev,rem;

	public void setNumber(int number) {
		this.number = number;
	}

	public int getRev() {
		rem=0;
		rev=0;
		while(number>0) {
			rem=number%10;
			rev=rev*10+rem;
			number=number/10;
		}
		return rev;
	}


}

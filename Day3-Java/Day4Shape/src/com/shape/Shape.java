package com.shape;

public class Shape {
	/*Create a class called shape with the following methods
1.area
2.perimeter

                    Overload the area and perimeter method to calculate for both square and rectangle.
                    Create a main class and invoke the area method to calculate the area of the square and 
rectangle. Also invoke the perimeter method to calculate the perimeter of the square 
and rectangle*/
 
	public int area(int a) {
		int area=a*a;
		return area;
	}
	
	public int area(int a,int b) {
		int area=a*b;
		return area;
	}
	
	public int perimeter(int a) {
		int peri=4*a;
		return peri;
	}
	
	public int perimeter(int a,int b) {
		int peri=2*a+2*b;
		return peri;
	}
}

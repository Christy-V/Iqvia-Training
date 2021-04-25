package com.overloading;

public class Area {
public int area(int length,int breadth) {
	int area= length*breadth;
	return area;
}
public double area(double side) {
	double area= 3.14*side*side;
	return area;
}

public int area(int side) {
	int area= side*side;
	return area;
}
}

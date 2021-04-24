package com.array;

import java.util.Scanner;

public class ArraySqr {

	public static void main(String[] args) {
		/*Write a program to display the square of the elements of a two dimensional array.*/
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		int arr[][];
		
		System.out.println("Enter the number of rows");
		int rows=Sc.nextInt();
		
		System.out.println("Enter the number of columns");
		int columns=Sc.nextInt();
		arr =new int[rows][columns];
		for (int i =0;i<rows;i++) {
			for (int j =0;j<columns;j++) {
			System.out.println("Enter the element");
			arr[i][j]=Sc.nextInt();
			}
		}
		for (int i =0;i<rows;i++) {
			for (int j =0;j<columns;j++) {
			System.out.print(arr[i][j]*arr[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}

package com.array;

import java.util.Scanner;

public class ArratAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a program to display the sum and the average of elements in the array.*/
		Scanner Sc=new Scanner(System.in);
		int arr[];
		int sum=0,avg=0;
		System.out.println("Enter the number of elemnets");
		int total=Sc.nextInt();
		arr =new int[total];
		for (int i =0;i<total;i++) {
			System.out.println("Enter the element");
			arr[i]=Sc.nextInt();
			sum+=arr[i];
		}
		avg=sum/total;
		System.out.println(" the sum is "+sum+" avg is "+avg);			


	}

}

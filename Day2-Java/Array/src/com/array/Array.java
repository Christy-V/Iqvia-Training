package com.array;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		int arr[];
		System.out.println("Enter the number of elemnets");
		int total=Sc.nextInt();
		arr =new int[total];
		for (int i =0;i<total;i++) {
			System.out.println("Enter the element");
			arr[i]=Sc.nextInt();			
		}
		for (int i =0;i<total;i++) {
			System.out.println(" the element "+i+" is "+arr[i]);			
		}
	}

}

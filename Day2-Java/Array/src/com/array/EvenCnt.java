package com.array;
import java.util.Scanner;
public class EvenCnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc= new Scanner(System.in);
		int arr[];
		int cnt=0;
		System.out.println("Enter the total number of elements ");
		int total=Sc.nextInt();
		arr =new int[total];
		for(int i=0; i<total;i++) {
			System.out.println("Enter the element");
			arr[i]=Sc.nextInt();
			if (arr[i]%2==0) {
				cnt+=1;
				}
		}
		System.out.println("The count of even number is "+cnt);
	}

}

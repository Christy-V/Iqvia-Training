package com.christy.client;

import java.util.Scanner;

import com.christy.presentation.SharesPresentation;
import com.christy.presentation.SharesPresentationImpl;

public class SharesClient {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SharesPresentation sharesPresentation=new SharesPresentationImpl();
		while(true){
			sharesPresentation.showMenu();
			System.out.println("Enter choice ");
			int choice=sc.nextInt();
			sharesPresentation.performMenu(choice);
		}

	}

}

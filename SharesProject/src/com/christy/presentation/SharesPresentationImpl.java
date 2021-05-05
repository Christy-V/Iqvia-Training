package com.christy.presentation;

import java.util.ArrayList;
import java.util.Scanner;

import com.christy.bean.Shares;
import com.christy.service.SharesService;
import com.christy.service.SharesServiceImpl;

public class SharesPresentationImpl implements SharesPresentation {
	private SharesService shareService=new SharesServiceImpl();
	public void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("1. Show All Shares");
		System.out.println("2. Insert Share ");
		System.out.println("3. Delete Share");
		System.out.println("4. Search Share By ID ");
		System.out.println("5. Updaet Market Values  By ID ");
		System.out.println("6. Exit");
	}

	public void performMenu(int choice) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		switch(choice){
		case 1:
			ArrayList<Shares> shares=shareService.getAllShares();
			for(Shares share:shares){
				System.out.println(share);
			}
		break;
		case 2:
			System.out.println("Enter share id : ");
			String id=sc.next();
			System.out.println("Enter share name : ");
			String sn=sc.next();
			System.out.println("Enter type : ");
			String ty=sc.next();
			System.out.println("Enter market value : ");
			int val=sc.nextInt();
			
			Shares sh=new Shares(id, sn, ty,val);
			if(shareService.insertShares(sh))
				System.out.println("Shares inserted successfully");
			else
				System.out.println("Shares insertion failed");
			break;
			
		case 3:
			System.out.println("Enter Share id whoes record you want to delete ");
			String Id=sc.next();
			if(shareService.deleteShares(Id))
				System.out.println("Shares Deleted");
			else
				System.out.println("Shares not Deleted");
			break;
		case 4:
			System.out.println("Enter shares id whoes record you want to search : ");
			String share_id =sc.next();
			Shares shr=shareService.searchSharesById(share_id);
			if(shr!=null)
				System.out.println(shr);
			else
				System.out.println("Shares not found with share id "+share_id);
			break;
		case 5:
			System.out.println("Enter Share id whoes record you want to delete ");
			String Sid=sc.next();
			System.out.println("Enter market value : ");
			int mval=sc.nextInt();
			if(shareService.updateMarketValues( mval,Sid ))
				System.out.println("Shares Updated");
			else
				System.out.println("Shares not Updated");
			break;	
		case 6:
			System.out.println("Thanks for using Shares Management System! Have a Nice Day!");
			System.exit(0);
			
		}

	}
	

}

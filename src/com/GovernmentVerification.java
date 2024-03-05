package com;

import java.util.Scanner;

public class GovernmentVerification {

	public static void main(String[] args)
	{
			Scanner sc =new Scanner(System.in);
			boolean status=true;
			while(status)
			{
			System.out.println();
			System.out.println("---------------------------------------------	    WELCOME TO MEE SEVA        ------------------------------------------------------");
			System.out.println("Enter The Choice : \n 1 : Aadhar Card \n 2 : VoterId \n 3 : PanCard \n 4 : Driving License \n 5 : Exit ");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1 : 
				{
					System.out.println("------------AADHAR CARD-------------- ");
					AadharCard.displayAadhar();
				}
				break;
				case 2 :
				{
					System.out.println("------------VOTER ID ---------------");
					VoterCard.voterId();
				}
				break;
				case 3 :
				{
					System.out.println("--------PAN CARD -----------");
					PanCard.panDetails();
				}
				break;
				case 4 : 
				{
					System.out.println("----------DRIVING LICENSE ------------");
					DrivingLiscences.drivingLicense();
				}
				break;
				case 5 :
				{
					
					System.out.println("----------------------------------------                 Thank You                ------------------------------------------");
					status=false;
				}
				break;
				default :
				{
					System.out.println("ENter The valid Choice ");
				}
			
			}
		}
	}
}

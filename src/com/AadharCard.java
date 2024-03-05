package com;


import java.util.Random;
import java.util.Scanner;
public class AadharCard 
{
	private static AadharCard aadhar=null;
	private static User u;
	private int aadharCard;
	
	private AadharCard( User u ,int aadharCard)
	{
		this.u=u;
		this.aadharCard = aadharCard;
		System.out.println("Aadhar Number :"+aadharCard);		
	}	
	
	
	public static void displayAadhar()
	{
		Scanner sc =new Scanner(System.in);
		if(aadhar==null)
		{
			Random r =new Random();
			int aadharNo=r.nextInt(1000000000);
			System.out.println("Enter The Details  Order Wise : \n Name :  \n Age : \n Mobile No :  \n Gender : \n Location : \n Father Name : ");
			aadhar= new AadharCard(new User(sc.nextLine(), sc.nextInt(),sc.nextLong(),sc.next(),sc.next(),sc.nextLine()),aadharNo);
			u.details();
		}
		else
		{
			System.out.println("Aadhar Number Has Already Been Generated");
		}		
	}
	
	
	
	
	
	
	
	

}
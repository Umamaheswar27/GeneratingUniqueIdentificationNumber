package com;

import java.util.Random;
import java.util.Scanner;

public class DrivingLiscences
	{
	
		private static User u;
		private static   Car c;
		private static DrivingLiscences drivingL=null;
		private static  int drivingLicense;
		
		
		private DrivingLiscences(User u, Car c,int drivingLicense)
		{
			
			this.u = u;
			this.c = c;
			this.drivingLicense=drivingLicense;
		}

	public static void drivingLicense()
	{
		if(drivingL==null) 
		{
			Scanner sc =new Scanner(System.in);
			System.out.println("Answer For The Follwing Questions :");
			System.out.println("What Red Color Indicates In Traffic Lights : \n 1: start \n 2: stop \n 3: ready");
			int ans1 =sc.nextInt();
			System.out.println("What Green Color Indicates In Traffic Lights : \n 1: start \n 2: stop \n 3: ready");
	        int ans2=sc.nextInt();
			System.out.println("What Orange Color Indicates In Traffic Lights : \n 1: start \n 2: stop \n 3: ready");
			int ans3=sc.nextInt();
			
			if(ans1==2 && ans2==1 && ans3==3)
			{
				Random r =new Random();
				int driving=r.nextInt();
				System.out.println("Enter The Details  Order Wise : \n Name :  \n Age : \n Mobile No :  \n Gender : \n Location : \n Father Name : \n Vehicle No : \n Color Of The Vehicle : \n No Of Wheels : \n Chassis No : ");
				drivingL= new DrivingLiscences(new User(sc.next(), sc.nextInt(), sc.nextLong(), sc.next(), sc.next(), sc.next()) ,new Car(sc.next(), sc.next(), sc.nextInt(), sc.nextLong()), driving);
				System.out.println("Driving License :"+drivingLicense);
				u.details();	
				c.carDetails();

			}
			else
			{
				System.out.println("Your Not Eligible ");
			}
			
		}
		else
		{
			System.out.println("Driving License Has Been Already Generated.");
		}
	}
}

package com;

import java.util.Random;
import java.util.Scanner;

public class PanCard 
{
		private static User u;
		private static PanCard panCard=null;
		private int pan;
		
		private PanCard(User u,int pan) 
		{
			this.u=u;
			this.pan = pan;
			System.out.println("Pan No :"+pan);
		}
	
	
		public static void panDetails() 
		{
			 if(panCard==null)
			 {			 
				 	Scanner sc =new Scanner(System.in);
					Random r =new Random();
					int panNo=r.nextInt();
					System.out.println("Enter The Details  Order Wise : \n Name :  \n Age : \n Mobile No :  \n Gender : \n Location : \n Father Name : ");
					panCard= new PanCard(new User(sc.next(), sc.nextInt(),sc.nextLong(),sc.next(),sc.next(),sc.next()),panNo);
					u.details();
	
			 }
			 else
			 {
				 System.out.println("PAN CARD Has Already Been Generated");
			 }
			
		}
}

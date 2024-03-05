package com;

import java.util.Random;
import java.util.Scanner;

public class VoterCard 
	{
	
	    private static User user;
		private static VoterCard voterid=null;
		private static  int voterId;
		
		private VoterCard(User user, int voterId) 
		{
			this.user = user;
			this.voterId = voterId;
		}
		
		
		public static void voterIdDetails()
		{	
			if(user.getAge()>=18)
			{
				System.out.println("Voter Id : "+voterId);
				user.details();
			}
			else
			{
				System.out.println("You ara not Eligibe for voteId");
			}
		}
	
		
		public static void voterId()
		{
				Scanner sc =new Scanner(System.in);
				if(voterid==null)
				{
					Random r =new Random();
					int voterNo=r.nextInt();
					System.out.println("Enter The Details  Order Wise : \n Name :  \n Age : \n Mobile No :  \n Gender : \n Location : \n Father Name : ");
					voterid= new VoterCard(new User(sc.next(), sc.nextInt(),sc.nextLong(),sc.next(),sc.next(),sc.next()),voterNo);
					voterIdDetails();
				}
				else
				{
					System.out.println("Voter Id has Aleady been generated");
				}
				
		}
	}

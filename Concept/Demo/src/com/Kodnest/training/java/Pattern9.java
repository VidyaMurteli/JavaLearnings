package com.Kodnest.training.java;

public class Pattern9 {
	public static void main(String []args)
	{
		int n=5;
		//Upper half
		for(int i=1;i<=n;i++)
		{
			//First part
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			//Space
			int space=2*(n-i);
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			//Second part
			for(int j=1;j<=i;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		//Lower part
				for(int i=n;i>=1;i--)
				{
					//first part
					for(int j=1;j<=i;j++)
					{ 
					System.out.print("*");
					}
					//space
					int space=2*(n-i);
					for(int j=1;j<=space;j++)
					{
						System.out.print(" ");
					}
					//Second part
					for(int j=1;j<=i;j++) 
					{
						System.out.print("*");
					}
					
					System.out.println();
				}
		
	}

}

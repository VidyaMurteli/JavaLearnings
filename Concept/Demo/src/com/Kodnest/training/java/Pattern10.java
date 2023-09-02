package com.Kodnest.training.java;

public class Pattern10 {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<=n;i++)
		{
			//Space
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
	    	}
			//Stars
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

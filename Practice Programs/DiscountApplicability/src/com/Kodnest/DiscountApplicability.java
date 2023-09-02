package com.Kodnest;

import java.util.Scanner;

public class DiscountApplicability {
	public static void checkDiscount(double purchaseAmount)
	{
		if(purchaseAmount>(100))
		{
			System.out.println("Discount Applicable");
		}
		else
		{
			System.out.println("Discount not Applicable");
		}
		
	}

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Amount");
	   double amt=sc.nextDouble();
	   checkDiscount(amt);
	   sc.close();
	}

}

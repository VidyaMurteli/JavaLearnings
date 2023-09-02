package com.Kodnest;

import java.util.Scanner;

public class FactorialCalculator {
	public static void calculateFactorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		calculateFactorial(n);
	}

}

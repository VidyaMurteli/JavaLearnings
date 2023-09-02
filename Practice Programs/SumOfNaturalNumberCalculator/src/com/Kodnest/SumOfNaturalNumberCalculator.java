package com.Kodnest;
import java.util.Scanner;
public class SumOfNaturalNumberCalculator {
	public static void calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		calculateSum(n);
		sc.close();
	}
	}


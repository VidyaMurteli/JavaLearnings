package com.Kodnest;
import java.util.Scanner;
public class EvenNumberPrinter {
	public static void printEvenNumbers(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		printEvenNumbers(n);
	}
}


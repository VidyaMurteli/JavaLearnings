package com.Kodnest;

import java.util.Scanner;

public class CountDigits {
public static void main(String []args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a number");
 int n=sc.nextInt();
 count(n);
}

public static void count(int n) {
	int c=0;
	while(n!=0)
	{
		
		n/=10;
		c++;
	}
	System.out.println(c);
}
}

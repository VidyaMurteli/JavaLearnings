package com.Kodnest;
import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	int rem = 0,temp,sum=0;
	temp=n;
	while(n!=0)
	{
		rem=n%10;
		sum=(sum*10)+rem;
		n=n/10;
	}
	if(sum==temp)
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not Palindrome");
	}
}
}

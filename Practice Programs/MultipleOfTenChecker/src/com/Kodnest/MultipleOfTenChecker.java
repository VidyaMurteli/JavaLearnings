package com.Kodnest;

import java.util.Scanner;

public class MultipleOfTenChecker
{
public static void checkMultipleOfTen(int n)
{
 if(n%10==0) {
	 System.out.println("A number is multiple of 10");
 }
}
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a number");
 int n=sc.nextInt();
 checkMultipleOfTen(n);
}
}
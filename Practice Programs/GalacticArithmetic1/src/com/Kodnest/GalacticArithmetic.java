package com.Kodnest;

import java.util.Scanner;

public class GalacticArithmetic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		Long num1=sc.nextLong();
		Long num2=sc.nextLong();
		System.out.println("Sum of two number is..");
		System.out.println(galacticAddition(num1,num2));
	}
	public static long galacticAddition(long num1, long num2)
	{
		return num1+num2;
	}
}
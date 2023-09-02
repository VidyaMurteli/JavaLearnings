package com.Kodnest.train.java;

import java.util.Scanner;

public class C1 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        Long num1=sc.nextLong();
        Long num2=sc.nextLong();
        System.out.println(galacticAddition(num1,num2));
      }
	public static long galacticAddition(long num1,long num2)
	{
		long res=num1+num2;
		return res;
		
	}
}

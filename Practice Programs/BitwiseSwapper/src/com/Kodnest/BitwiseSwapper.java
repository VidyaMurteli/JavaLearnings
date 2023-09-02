package com.Kodnest;
import java.util.Scanner;
public class BitwiseSwapper {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a first number"); 
	   int n1=sc.nextInt();
	   System.out.println("Enter a second number");
	   int n2=sc.nextInt();
	   n1=n1^n2;
	   n2=n1^n2;
	   n1=n1^n2;
	   System.out.println("after swapping value of  n1 is"+n1+" and n2 value is "+n2);
	   
	}

}

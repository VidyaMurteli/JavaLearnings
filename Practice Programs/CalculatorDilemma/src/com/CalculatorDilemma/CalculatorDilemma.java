package com.CalculatorDilemma;

import java.util.Scanner;

public class CalculatorDilemma {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("Enter the choice");
		int num=sc.nextInt();
		switch(num)
		{
		case 1:System.out.println("Addiing of two numbers");
		       System.out.println(n1+n2);
		        break;
		case 2:System.out.println("Substracting of two numbers");
		       System.out.println(n1-n2);
		       break;
		case 3:System.out.println("Multiplication of two numbers");
			   System.out.println(n1*n2);
			   break;
		case 4:System.out.println("Divison of two numbers");
			   System.out.println(n1/n2);
		        break;
		default:System.out.println("Enter correct choice");
		}
}

}

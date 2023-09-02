package com.Kodnest;
import java.util.Scanner;
public class MethodOverloadingCalculator {
		public static double calculate(double a, double b, char operator) {
			switch(operator)
			{
			case '+':return a + b;
			case '-':return a-b;
			case '*':return a*b;
			case '/':return a/b;
			default:
				System.out.println("Enter a correct choice");
			}
			return operator;
			
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a first number");
		    double a=sc.nextDouble();
			System.out.println("Enter a second number");
			double b=sc.nextDouble();
			System.out.println("Enter the operator");
			char operator=sc.next().charAt(0);
			MethodOverloadingCalculator cal=new MethodOverloadingCalculator();
			double result=cal.calculate(a,b,operator);
			System.out.println("Result: "+result);
			sc.close();
		}

	}




package com.Kodnest;
import java.util.Scanner;
public class TaxCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Purchase amount");
		double amt=sc.nextDouble();
		System.out.println("Enter a Tax Rate");
		double rate=sc.nextDouble();
		calculateTotalWithTax(amt,rate);
	}
	public static void calculateTotalWithTax(double amt,double rate)
	{
		double res= (amt*rate);
		System.out.println(res+amt);
	}
}

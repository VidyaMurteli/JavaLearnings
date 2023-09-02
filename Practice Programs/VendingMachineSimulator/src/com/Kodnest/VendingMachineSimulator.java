package com.Kodnest;

import java.util.Scanner;

public class VendingMachineSimulator {
	public static void getProduct(String productCode)
	{
		switch(productCode)
		{
		case "P01":System.out.println("Coca Cola");
					break;
		case "P02": System.out.println("Pepsi");
					break;
		case "P03":System.out.println("Fanta");
					 break;
		case "P04":System.out.println("JalJeera");
					break;
		case "P05":System.out.println("MountainDew");
					break;
		case "P06":System.out.println("BoatGuava");
					break;
		default:System.out.println("Let the Drink be Panaka.");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a choice");
		String productCode=sc.next();
		getProduct(productCode);
	}

}

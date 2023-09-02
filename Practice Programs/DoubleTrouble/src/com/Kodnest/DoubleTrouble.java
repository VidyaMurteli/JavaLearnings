package com.Kodnest;

import java.util.Scanner;

public class DoubleTrouble {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int num=sc.nextInt();
    System.out.println(doubleTheNumber(num));
    sc.close();
    
	}
	public static int doubleTheNumber(int num)
	{
		return num*2;
	}

}

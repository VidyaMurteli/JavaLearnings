package com.Kodnest.patternlevel1;

import java.util.Scanner;
import java.util.Random;

public class P12 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		
		int n=rand.nextInt(10);
		System.out.println(n);
		printPattern(n);
		scan.close();
		
	}
	public static void printPattern(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(n);
			}
			System.out.println();
		}
	}
}
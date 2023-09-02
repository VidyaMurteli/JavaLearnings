package com.p1;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		P1 p1=new P1();
		int res=p1.power(n);
		System.out.println(res);
		sc.close();
	}

}

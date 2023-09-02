package com.Kodnest;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number");
	int m=sc.nextInt();
	System.out.println("Enter a Power");
	int n=sc.nextInt();
	power(m,n);
}
public static void power(int m,int n) {
	int finalres=1;
	for(int i=1;i<=n;i++) {
		finalres=finalres*m;
	}
	System.out.println(finalres);
}
}

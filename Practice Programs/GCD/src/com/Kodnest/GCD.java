package com.Kodnest;
import java.util.Scanner;
public class GCD {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter 2 numbers");
int m=scan.nextInt();
int n=scan.nextInt();
findGCD(m, n);
}
public static void findGCD(int m, int n)
{
while(n!=0)
{
int rem=m%n;
m=n;
n=rem;
}
System.out.println("GCD IS "+m);
}
}
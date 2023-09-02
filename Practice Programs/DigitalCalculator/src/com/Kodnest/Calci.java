package com.Kodnest;
import java.util.Scanner;
public class Calci{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter a number");
int n=scan.nextInt();
CalculateSum c1 = new CalculateSum();
c1.calculateSumOfDigits(n);
}
}


package com.Kodnest.training.java;

import java.util.Scanner;

public class Main{
	public static void main(String args[])
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter Student First name");
	  String a=scan.next();
	  System.out.println("Value in a" +a);
	  System.out.println("Enter Student Last Name");
	  String b=scan.next();
	  System.out.println("Value in b" +b);
	  System.out.println("Enter the age");
	  int c=scan.nextInt();
	  System.out.println("Value in c" +c);
	  System.out.println("Enter Student gender");  
	  String d=scan.next();
	  System.out.println("Value in d" +d);
	  System.out.println("Is student married? say true or false");
	  Boolean e=scan.nextBoolean();
	  System.out.println("Value in e" +e);
	  System.out.println("Enter Student branch");
	  String f=scan.next();
	  System.out.println("Value in f" +f);
	  System.out.println("Enter Student Height");
	  int g=scan.nextInt();
	  System.out.println("Value in g" +g);
	  System.out.println("Enter Student Weight");
	  int h=scan.nextInt();
	  System.out.println("Value in h" +h);
		scan.close();
	  
  }

}

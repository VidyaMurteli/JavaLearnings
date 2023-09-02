package com.kodenst.java;

import java.util.Scanner;

public class StringJoin {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two Strings");
       String str1=sc.next();
       String str2=sc.next();
       System.out.println(joinerString(str1,str2));
       sc.close();
	}
	public static String joinerString(String str1,String str2)
	{
		return str1+str2;
	}
}

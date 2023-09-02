package com.Kodnest;

public class Fibonacci {
	public static void printFibonacciSeries(int n)
	{
      int fib1=0;
      int fib2=1;
      int fib3=0;
      if(n==1)
      {
    	  System.out.print(fib1+" ");
      }
      else if(n==2)
      {
      System.out.print(fib1+" "+fib2);
      }
      else {
    	  System.out.print(fib1+" "+fib2);
      for(int i=3;i<=10;i++)
      {	
    	  fib3=fib1+fib2;
    	  System.out.print(" "+fib3);
    	  fib1=fib2;
    	  fib2=fib3;
      }
      }
	}
	public static void main(String[] args)
	{
     	printFibonacciSeries(10);
	}
}

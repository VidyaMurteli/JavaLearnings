package com.Kodnest;
import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Welocome to Temperature Conversion Tool!");
		 System.out.println("Select an Option");
		 int choice=sc.nextInt();		
		 switch(choice)
		 {
		 case 1:System.out.println("Celsius to Fahernheit Conversion");
		        System.out.println("Enter Temperature in Celsius");
		        double celsius=sc.nextDouble();
		        double res1=celsiusToFahrenheit(celsius);
		        System.out.println(celsius+ "°C is Equivalent to "+res1+"°F");
		        break;
		 case 2:System.out.println("Fahernheit to Celsius Conversion");
	            System.out.println("Enter Temperature in Fahrenheit");
	            double fahrenheit=sc.nextDouble();
	            double res2=fahrenheitToCelsius(fahrenheit);
	            System.out.println(res2+"°F is Equivalent to "+res2+"°C");
	            break;
		 }
	}

	private static double celsiusToFahrenheit(double celsius) {
		return (celsius * 9/5) + 32;
	}
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5/9;
	}


}

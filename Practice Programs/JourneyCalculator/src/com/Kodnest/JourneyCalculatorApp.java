package com.Kodnest;

import java.util.Scanner;

public class JourneyCalculatorApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter speed and  time");
		Double speed=sc.nextDouble();
		Double time=sc.nextDouble();
        JourneyCalculator c=new JourneyCalculator();
        double distance=c.calculateDistance(speed,time);
		System.out.println(distance);
		}
	}



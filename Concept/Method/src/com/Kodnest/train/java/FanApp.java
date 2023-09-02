package com.Kodnest.train.java;

public class FanApp {

	public static void main(String[] args) {
		Fan f1= new Fan();
		f1.no_Of_Wings=3;
		f1.color="brown";
		f1.cost=2000;
		f1.brand="crompton";
		System.out.println(f1.no_Of_Wings+" "+f1.color+" "+f1.cost+" "+f1.brand);
		f1.rotate();
		f1.blow_Air();
		System.out.println("============================================================================");
		Fan f2=new Fan();
		f2.no_Of_Wings=4;
		f2.color="black";
		f2.cost=3000;
		f2.brand="crompton";
		System.out.println(f2.no_Of_Wings+" "+f2.color+" "+f2.cost+" "+f2.brand);
		f2.rotate();
		f2.blow_Air();
		System.out.println("=============================================================================");
		Fan f3=new Fan();
		f3.no_Of_Wings=5;
		f3.color="white";
		f3.cost=4000;
		f3.brand="crompton";
		System.out.println(f3.no_Of_Wings+" "+f3.color+" "+f3.cost+" "+f3.brand);
		f3.rotate();
		f3.blow_Air();
		
	}

}

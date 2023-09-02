package com.Kodnest.Armstrong1;

import java.util.Scanner;

public class Armstrong1 {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the starting range :");
		int start=scan.nextInt();
		System.out.println("Enter the ending range :");
		int end=scan.nextInt();
		ArmStrong A=new ArmStrong();
		A.printArmNumber(start,end);
		scan.close();
		
	}
}
class ArmStrong
{
	public void printArmNumber(int st,int end)
	{
		for(int i=st;i<=end;i++)
		{
			int res=checkArmStrongNum(i);
			if(res==1)
			{
				System.out.print(i+" ");
			}
		}
	}
	
	
	public int checkArmStrongNum(int num)
	{
		int sum=0;
		int rem;
		int v=num;
		while(v!=0)
		{
			rem=v%10;
			v=v/10;
			sum=sum+makeCube(rem);
			
		}
		if(sum==num)
		{
			return 1;
		}
		return 0;
	}
	
	
	public static int makeCube(int num)
	{
		return (num*num*num);
	}
	
	
}
package Power;

import java.util.Scanner;
public class Power2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	Print P=new Print();
	P.print(n);
	scan.close();
}
}
class Print
{
	static int count=0;
	public void print(int n)
	{
		
			int sum=0;
		
			int rem;
			int v=n;
			int temp=n;
			while(temp!=0)
			{
				
				temp=temp/10;
				count++;
				
			}
			while(v!=0)
			{
				rem=v%10;
				v=v/10;
				sum=sum+makeCube(rem);
				
			}
			System.out.println(sum);
			
			
		}
		public static int makeCube(int num)
		{
			int mul=1;
			for(int i=1;i<=count;i++)
			{
				mul=mul*num;
			}
			return mul;
		}
		
	}

//simple input : 22
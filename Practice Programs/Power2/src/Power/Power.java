package Power;
import java.util.Scanner;
public class Power {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	int res=count(n);
	power(n,res);
	}

	public static int count(int n) {
		int c=0;
		while(n!=0)
		{
			
			n/=10;
			c++;
		}
		return c;
	}
	public static void power(int n,int res) {
		int finalres=1;
		for(int i=1;i<=res;i++) {
			finalres=finalres*n;
		}
		System.out.println(finalres);
	}
}


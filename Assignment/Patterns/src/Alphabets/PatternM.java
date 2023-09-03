package Alphabets;
public class PatternM {
public static void main(String[] args) {
	int n=7;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=7;j++)
		{
			if(j==1||(i==j&&(i<=n/2+1)&&(j<=n/2+1))||(i+j==8&&(i<=n/2+1)&&(j>=n/2+1))||j==n)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}

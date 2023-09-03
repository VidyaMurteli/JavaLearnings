package Alphabets;
public class PatternQ {
public static void main(String[] args) 
	{
		int n=7;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(((i==1||i==n/2+2)&&(j>1&&j<n/2+2))||((j==1||j==n/2+2)&&(i>1&&i<n/2+2))||(i==j&&(i>3&&i<7)))
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

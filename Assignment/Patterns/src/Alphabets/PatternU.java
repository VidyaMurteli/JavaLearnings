package Alphabets;
public class PatternU {
	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(((j==1||j==n)&&i<6)||i==6&&(j>1&&j<n))
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

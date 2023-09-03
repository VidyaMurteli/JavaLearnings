package Alphabets;
public class PatternT {
	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||j==n/2+1)
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

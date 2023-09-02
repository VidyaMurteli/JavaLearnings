package BitwiseBitCounter;
import java.util.Scanner;
public class BitwiseBitCounter {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter an Integer");
		 int n=sc.nextInt();
		int res=countSetBits(n);
		System.out.println(res);
}
	public static int countSetBits(int n)
	{
		int count=0;
		while(n>0)
		{
			count=count+n&1;
			n=n>>1;
		}
		return count;
	}

}

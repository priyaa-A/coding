import java.util.Scanner;

class Tablefor {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number which are the tables you want to print : ");
		int tables=scan.nextInt();
		System.out.println("enter the value of i: ");
		int i=scan.nextInt();
		System.out.println("enter the bottom value : ");
		int n=scan.nextInt();
		
		for(int num=i;i<=n;i++)
		{
			System.out.println(tables+"x"+i+"="+(tables*i));
		}
		
		
		
	}

}

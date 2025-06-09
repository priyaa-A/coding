import java.util.Scanner;

public class Tablewhile {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value of table: ");
		int tables=scan.nextInt();
		System.out.println("enter the value of i");
		int i=scan.nextInt();
		while(i<=10)
		{
			
			System.out.println(tables+"x"+i+"="+(tables*i));
			i+=1;
		}
	}

}

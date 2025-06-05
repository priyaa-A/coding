import java.util.Scanner;

class Operations{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number a: ");
        int a = scan.nextInt();
        System.out.println("enter the number b: ");
        int b = scan.nextInt();

        System.out.println("addition of two numbers");
        int c= a+b;
        System.out.println("the addition is: "+c);

        System.out.println("subraction of two numbers");
        int d = a-b;
        System.out.println("the subraction is: "+d);

        System.out.println("multiplication of two number");
        int e = a*b;
        System.out.println("the multiplication is: "+e);

        System.out.println("division of two numbers");
        int f = a/b;
        System.out.println("the division is: "+f);

        System.out.println("reminder");
        int g = a%b;
        System.out.println("the reminder is: "+g);


    }
}

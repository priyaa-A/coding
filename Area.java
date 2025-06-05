import java.util.Scanner;
class Area{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the value of radius");
        int radius = scan.nextInt();
        System.out.println("enter the value of pi");
        double pi  = scan.nextDouble();

        //to print area and perimeter of a circle

        //area of a circle is pi *r*r
        //perimeter of a circle is pi 2*pi*r

        System.out.println(" area of the cicle");
        double area = pi * radius * radius;
        System.out.println("the area of the circle is: "+area);

        //perimeter of a circle is pi 2*pi*r
        System.out.println(" perimeter of a cicle");
        double perimeter =  2 * pi * radius;
        System.out.println("the perimeter of a circle is: "+perimeter);






    }
}
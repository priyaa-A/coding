import java.util.Scanner;
class Oddeven{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int number = scan.nextInt();

        if(number%2==0)
        {
            System.out.println("the number is odd:"+number);
        
        }
        else{
            System.out.println("the number is even:"+number);
        }
    }
}
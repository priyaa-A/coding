import java.util.Scanner;
class numbers{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int number = scan.nextInt();

        if(number>=0)
        {
            System.out.println("the number is postive: "+number);

        }
        else
        {
            System.out.println("the number is negative: "+number);
        }
    }
}
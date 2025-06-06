import java.util.Scanner;
class sumnumbers{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int number= scan.nextInt();
        
        if(number<=50)
        {
            System.out.println("the number is : "+number);
            //number +=10;
        }
        if(number<=50)
        {
            number += 10;
            System.out.println("the number is : "+number);
           
        }
        System.out.println("the total is : "+number);
        

    }
}
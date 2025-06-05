import java.util.Scanner;
class Student{
    public static void main(String args[])
    {
        System.out.println(" STUDENT DETAILS");

        Scanner scan = new Scanner(System.in);
        //enter the student name
        System.out.println("enter the name of the student");
        String name = scan.nextLine();
        
        
        //enter the roll no
        System.out.println("enter the roll no of the student");
        int roll_no = scan.nextInt();

       

        //enter the subject marks
        System.out.println("marks of the five subject");
        int subject1 = scan.nextInt();
        int subject2 = scan.nextInt();
        int subject3 = scan.nextInt();
        int subject4 = scan.nextInt();
        int subject5 = scan.nextInt();

        //print the average of five marks

        
        int total = subject1+subject2+subject3+subject4+subject5;
        float Average = total/5;
        

        System.out.println("the student name is: "+name);
        System.out.println("the rollno is: "+roll_no);
        System.out.println("mark of subject 1 is: "+subject1);
        System.out.println("mark of subject 2 is: "+subject2);
        System.out.println("mark of subject 3 is: "+subject3);
        System.out.println("mark of subject 4 is: "+subject4);
        System.out.println("mark of subject 5 is: "+subject5);
        System.out.println("the total mark is: "+total);
        System.out.println("the Average is: "+ Average);

        



    }
}
import java.util.Scanner;

//write a java program to implement static method for add, multiply and divide(non static method) to use both static and non static variable 
//like a, b, c 

public class Stattask {
	static int a;
    static int b;
    int c;
   
    
  
    static void add()
    {
    	int add=a+b;
    	System.out.println("the addition of a+b is : "+add);
    	
    }
    
    static void multiply()
    {
    	int product=a*b;
    	System.out.println("the mutliplication of a*b is: "+product);
    }
    
     void divide()
    {
    	float divide=a/c;
    	System.out.println("the division of a/c  is: " +divide);
    	
    }
    
    public static void main(String args[])
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("enter the value of a : ");
    	//if we want user input for static variables , the syntax is ---classname.variablename=scan.nextInt();
    	Stattask.a=scan.nextInt();
    	System.out.println("enter the value of b: ");
    	Stattask.b=scan.nextInt();
    	//if we want user input for non-static variables, the syntax is datatype somevariable = scan.nextInt()
    	System.out.println("enter the value of c: ");
    	int cvalue=scan.nextInt();
    	
    	Stattask obj= new Stattask();
    	Stattask obj1=new Stattask();
    	//object creation and user input for non static variables
    	Stattask obj2=new Stattask();
    	obj2.c=cvalue;
    	
    	add();
    	multiply();
    	
    	obj2.divide();
    	
    }
	

}
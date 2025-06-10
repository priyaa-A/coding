//package priyaa_java;

//program to print employee details,emp id,name ,designation,location using parameterised constructor

public class Constructorparametertask {

	int empid;
	String empname;
	String designation;
	public Constructorparametertask(int eid,String ename,String design)
	{
		
		empid=eid;
		empname=ename;
		designation=design;
	}
	public void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(designation);
		
		
	}
	public static void main(String args[])
	{
		Constructorparametertask cp =new Constructorparametertask(101,"priya","team leader"); 
		Constructorparametertask cp1 =new Constructorparametertask(102,"saranya","hr"); 
		Constructorparametertask cp2 =new Constructorparametertask(103,"sivashree","manager"); 
		Constructorparametertask cp3 =new Constructorparametertask(104,"shanmuga","chairman"); 
		Constructorparametertask cp4=new Constructorparametertask(105,"thejasshree","general manager"); 
		
	    cp.display();
        cp1.display();
        cp2.display();
        cp3.display();
        cp4.display();

			
		}
		
}
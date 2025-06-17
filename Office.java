class Employee
{
	public void work()
	{
		System.out.println("Employee working in an office");
	}
	
	public double getsalary(double salary)

	{ 
		
		System.out.println("the salary is: "+salary);
		return salary;
		
	}
}

class HRManager extends Employee
{
	public void work()
	{
		super.work();
		System.out.println("Hr doing is work properly");
	}
	
	public void addemployee()
	{
		System.out.println("It is mandotary to add the employee ");
	}

	
}

public class Office {
	public static void main(String args[]) {
		
		HRManager hr=new HRManager();
		hr.work();
		hr.getsalary(25000.00);
		hr.addemployee();
	}
	
	 

}
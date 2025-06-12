public class Employeedetails {
	private int Empid;
	private String Empname;
	private String Emplocation;
	
	//getter method
	public int getEmpid()
	{
		return Empid;
	}
	public String getEmpname()
	{
		return Empname;
	}
	
	public String getEmplocation()
	{
		return Emplocation;
	}
	
	
	//setter method
	public void setEmpid(int Empid)
	{
		this.Empid=Empid;
		
	}
	
	public void setEmpname(String Empname)
	{
		this.Empname=Empname;
	}
	
	public void setEmplocation(String Emplocation)
	{
		this.Emplocation=Emplocation;
	}
	
	public static void main(String args[]) 
	{
        Employeedetails e1 = new Employeedetails();
        e1.setEmpid(101);
        e1.setEmpname("Priya");

        // Print the employee details
        System.out.println("Employee ID: " + e1.getEmpid());
        System.out.println("Employee Name: " + e1.getEmpname());
    }
}
	
	
	

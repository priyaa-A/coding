class Studentsdetails{
	String name;
	int id;
	String branch;
	String location;
	String degree;


   Studentsdetails(String name,int id,String branch,String location,String degree)
   {
	   this.name=name;
	   this.id=id;
	   this.branch=branch;
	   this.location=location;
	   this.degree=degree;
   }
   
   void displaydetails(){
	   if(id>3)
	   {
		   System.out.println("the student details are: "+name+" , "+id+" , "+branch+" , "+location+" , "+degree);
	   }
	   
   }
}
   

public class ArrayObjecttask {
	public static void main(String args[])
	{
		Studentsdetails[ ] obj= new Studentsdetails[6];
		
		obj[0]= new Studentsdetails("priya",21,"ECE","south","BE");
		obj[1]= new Studentsdetails("saranya",22,"ECE","north","BE");
		obj[2]= new Studentsdetails("poshika",02,"IT","west","B.tech");
		obj[3]= new Studentsdetails("swathi",24,"CS","south","B.Sc");
		obj[4]= new Studentsdetails("sangeetha",25,"CS","east","B.Sc");
		obj[5]= new Studentsdetails("divya",23,"Commerce","south","B.com");
		
		
		for(int i=0;i<obj.length;i++)
		{
			obj[i].displaydetails();
		}
		
		
	}
}



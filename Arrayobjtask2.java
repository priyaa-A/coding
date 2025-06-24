class Studentsdetailss{
	String name;
	int id;
	String branch;
	String location;
	String degree;


   Studentsdetailss(String name,int id,String branch,String location,String degree)
   {
	   this.name=name;
	   this.id=id;
	   this.branch=branch;
	   this.location=location;
	   this.degree=degree;
   }
   
   void displaydetails(){
	   if(location=="south"&& degree=="BE")
	   {
		   System.out.println("the student details are: "+name+" , "+id+" , "+branch+" , "+location+" , "+degree);
	   }
	   
   }
}
   

public class Arrayobjtask2 {
	public static void main(String args[])
	{
		Studentsdetailss[ ] obj= new Studentsdetailss[6];
		
		obj[0]= new Studentsdetailss("priya",21,"ECE","south","BE");
		obj[1]= new Studentsdetailss("saranya",22,"ECE","north","BE");
		obj[2]= new Studentsdetailss("poshika",02,"IT","west","B.tech");
		obj[3]= new Studentsdetailss("swathi",24,"CS","south","B.Sc");
		obj[4]= new Studentsdetailss("sangeetha",25,"CS","east","B.Sc");
		obj[5]= new Studentsdetailss("divya",23,"Commerce","south","B.com");
		
		
		for(int i=0;i<obj.length;i++)
		{
			obj[i].displaydetails();
		}
		
		
	}
}




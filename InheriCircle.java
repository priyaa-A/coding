class Shapes
 {
	double radius;
	public void getarea()
	
	{
		double area=Math.PI*radius*radius;
		System.out.println("the area is: " +area);
	
		
	}
 
     public void getperimeter()
     
     {
    	 double perimeter=2*Math.PI*radius;
    	 System.out.println("the perimeter is: "+perimeter);
    	
     }
 }
 
 class Circles extends Shapes
 {
	  
      public void getarea()
		 {
			super.getarea();
			
		 }
      public void getperimeter()
        {
    	  super.getperimeter();
    	  
    	}
 }
     
public class InheriCircle {
	public static void main(String args[])
	{
		Circles obj=new Circles();
	    obj.radius=3.4;
		obj.getarea();
		obj.getperimeter();
		
	}
	

}

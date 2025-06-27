interface Area{
	public double getarea();
}


class Circles implements Area
{
	double radius;
	Circles(double radius)
	{
		this.radius=radius;
	}
	public double getarea()
	{
		System.out.println("the area of the Circle is: ");
		return 3.14*radius*radius;
	}
}
class Rectangle implements Area
{
	double base;
	double height;
	 Rectangle(double base,double height )
	 {
		 this.base=base;
		 this.height=height;
	 }
	 public double getarea()
	 {
		 System.out.println("the area of the Rectangle is: ");
		 return 0.5*base*height;
	 }
}
class Triangle implements Area
{
	double length;
	double breadth;
	
	Triangle(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	 public double getarea()
	 {
		 System.out.println("the area of the Rectangle is: ");
		 return length*breadth;
	 }
}


public class AreaInterface {
	public static void main(String args[])
	{
		Area a1=new Circles(1.4);
		double areaofcircle=a1.getarea();
		System.out.println(areaofcircle);
		
		Area a2=new Triangle(4.0,5.0);
		double areaofTriangle=a2.getarea();
		System.out.println(areaofTriangle);
		
		Area a3=new Rectangle(4.0,5.0);
		double areaofRectangle=a3.getarea();
		System.out.println(areaofRectangle);
	}

}
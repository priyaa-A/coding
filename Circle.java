public class Circle {

	
	 
	    private double radius;

	    // Getter method 
	    public double getradius() {
	        return radius;
	    }

	    // Setter method for radius
	    public void setradius(double radius) {
	        
	            this.radius = radius;
	        
	    }

	    // Method to calculate area
	    public double calculateArea() {
	        return 3.14* radius * radius;
	    }

	    // Method to calculate perimeter (circumference)
	    public double calculatePerimeter() {
	        return 2 * 3.14 *radius;
	    }
	


 public static void main(String[] args) {
     // Create object of Circle
     Circle c = new Circle();

     // Set radius
     c.setradius(7.0);

     // Get radius and display calculations
     System.out.println("Radius: " + c.getradius());
     System.out.println("Area: " + c.calculateArea());
     System.out.println("Perimeter: " + c.calculatePerimeter());
 }}





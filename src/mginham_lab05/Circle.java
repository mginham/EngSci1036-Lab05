package mginham_lab05;

public class Circle extends Shape {
	
	// Constructor //
	public Circle(double radius) {
		setSideLength(radius);
	} // end constructor
	
	// Methods //
	public double computeArea() {
		double area, radius;

		// Call method from super-class
		super.computeArea();
		
		// Get side length (radius) by calling getter from super-class
		radius = getSideLength();
		
		// Calculate area
		area = Math.PI*Math.pow(radius, 2);
		
		return area;
	} // end computeArea
	public double computePerimeter() {
		double circumference, radius;
		
		// Call method from super-class
		super.computePerimeter();
		
		// Get side length (radius) by calling getter from super-class
		radius = getSideLength();
		
		// Calculate perimeter (circumference)
		circumference = 2*Math.PI*radius;
		
		return circumference;
	} // end computePerimeter
	
} // end class

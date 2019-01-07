package mginham_lab05;

public class Square extends Shape {
	
	// Constructor //
	public Square(double sideLength) {
		setNumberOfSides(4);
		setSideLength(sideLength);
	} // end constructor
	
	// Methods //
	public double computeArea() {
		double area, sideLength;

		// Call method from super-class
		super.computeArea();
		
		// Get side length by calling getter from super-class
		sideLength = getSideLength();
		
		// Calculate area
		area = Math.pow(sideLength, 2);
		
		return area;
	} // end computeArea
	public double computePerimeter() {
		double perimeter, sideLength;
		
		// Call method from super-class
		super.computePerimeter();
		
		// Get side length by calling getter from super-class
		sideLength = getSideLength();
		
		// Calculate perimeter
		perimeter = sideLength*4;
		
		return perimeter;
	} // end computePerimeter
	
} // end class

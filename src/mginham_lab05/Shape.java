package mginham_lab05;

public class Shape { // super-class
	
	// Declare global variables //
	private int numOfSides;
	private double sideLength;
	
	// Getters and setters //
	protected void setNumberOfSides(int num) {
		this.numOfSides = num;
	} // end setNumberOfSides
	protected int getNumberOfSides() {
		return numOfSides;
	} // end getNumberOfSides
	protected void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	} // end setSideLength
	protected double getSideLength() {
		return sideLength;
	} // end getSideLength
	
	// Methods //
	public double computeArea() {
		System.out.println("Calling superclass computeArea");
		
		return 0;
	} // end computeArea
	public double computePerimeter() {
		System.out.println("Calling superclass computePerimeter");
		
		return 0;
	} // end computePerimeter

} // end class

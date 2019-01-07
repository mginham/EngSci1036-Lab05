package mginham_lab05;

public class Rectangle {
	
	// Declare global variables //
	private double side1;
	private double side2;
	
	// Constructor//
	public Rectangle(double x1, double y1, double x2, double y2) {
		side1 = x2-x1;
		side2 = y2-y1;
	} // end constructor
	
	// Methods //
	public void scale(double scale) {
		side1 *= scale;
		side2 *= scale;
	} // end scale
	public void print() {
		System.out.println(); // cosmetic
		
		// Print top
		for(int i = 0; i < side1; i++) {
			System.out.print("*");
		}
		System.out.println(); // end top line
		
		// Print body
		for(int i = 0; i < (side2-2); i++) { // lines down
			System.out.print("*");
			for(int j = 0; j < (side1-2); j++) { // spaces across
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
		// Print bottom
		for(int i = 0; i < side1; i++) {
			System.out.print("*");
		}
		
		System.out.println(); // cosmetic
	} // end print
	
} // end class

package mginham_lab05;

public class mginham_lab05_q2 {

	// Methods //
	public static void displayStudentInfo() {
		// Display information & question to user
		System.out.println("********************************"
					   + "\nES1036: Lab 05 Q2"
					   + "\n        Overriding Methods"
					   + "\nDate: November 6, 2018"
					   + "\nName: Megan Ginham"
					   + "\nStudent Number: 251029381"
					   + "\nMission: Compute the perimeter"
					   + "\n         and area of different"
					   + "\n         shapes using class"
					   + "\n         inheritance"
					   + "\n********************************");
	} // end displayStudentInfo
	
	// MAIN //
	public static void main(String[] args) {
		displayStudentInfo();
		
		// Create object square
		Square s = new Square(3.6);
		
		// Display characteristics of square object
		System.out.println("The area of the square is: " + s.computeArea());
		System.out.println("The perimeter of the square is: " + s.computePerimeter());

		System.out.println(); // cosmetic
		
		// Create object circle
		Circle c = new Circle(3.6);
		
		// Display characteristics of circle object
		System.out.println("The area of the circle is: " + c.computeArea());
		System.out.println("The circumference of the circle is: " + c.computePerimeter());
	} // end main

} // end class

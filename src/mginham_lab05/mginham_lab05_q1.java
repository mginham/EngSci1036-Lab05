package mginham_lab05;

public class mginham_lab05_q1 {

	// Methods //
	public static void displayStudentInfo() {
		// Display information & question to user
		System.out.println("********************************"
					   + "\nES1036: Lab 05 Q1"
					   + "\n        Overloading Methods"
					   + "\nDate: November 6, 2018"
					   + "\nName: Megan Ginham"
					   + "\nStudent Number: 251029381"
					   + "\nMission: Create several"
					   + "\n         overloaded print"
					   + "\n         methods that will be"
					   + "\n         called based on the"
					   + "\n		 data type of the"
					   + "\n		 argument passed"
					   + "\n********************************");
	} // end displayStudentInfo
	public static void print(char a) {
		System.out.println("The character is " + a);
	} // end print (char)
	public static void print(int b) {
		System.out.println("The integer is " + b);
	} // end print (int)
	public static void print(String c) {
		System.out.println("The string is " + c);
	} // end print (String)
	public static void print(double d) {
		System.out.println("The double is " + d);
	} // end print (double)
	public static void print(boolean e) {
		System.out.println("The boolean is " + e);
	} // end print (boolean)
	
	// MAIN //
	public static void main(String[] args) {
		print(3);
		print('f');
		print(4 > 3);
		print(9.81);
		print("great");
	} // end main

} // end class

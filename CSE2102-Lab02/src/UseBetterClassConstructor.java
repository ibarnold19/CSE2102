/* Bryan Arnold
 * CSE 2102
 * Lab 02
 * 2/17/2017
 */

/* Class UseBetterClassConstructor
 * Purpose: this class just utilizes and sets the variables
 * of the class BetterClassConstrucot and displays them in date
 * format as well as validates them utilizing
 * try and catch statements for the error messages
 * thrown by the validate method in the class
 * BetterClassConstructor, but not for the default
 * constructor as that does not need validation. That's it, pretty simple.
 */
public class UseBetterClassConstructor { //start class

	/* main() Method
	 * Purpose: this just utilizes and allows for the class
	 * BetterClassConstructor to be run and used.
	 */
	public static void main(String[] args) throws Exception { //start method

		BetterClassConstructor obj1 = new BetterClassConstructor(); //creates object using default constructor
		obj1.validate(); //checks for correct member variables values, not necessary but why not
		System.out.println("First object:");
		obj1.writeOutput(); //displays member variables in date format
		System.out.println(obj1.getMonth() + " " + obj1.getDay() + ", " + obj1.getYear()); //also displays member variables in date format

		try{ //start try

			BetterClassConstructor obj2 = new BetterClassConstructor("April", 1899, 28); //create object using other constructor, invalid year
			obj2.validate(); //checks for correct member variables
			System.out.println("Second object:");
			obj2.writeOutput(); //displays member variables in date format
			System.out.println(obj2.getMonth() + " " + obj2.getDay() + ", " + obj2.getYear()); //also displays member variables in date format

		} catch (IllegalArgumentException e){ //start catch

			System.out.println(e.getMessage()); //displays error message

		} //end try catch

	} //end method

} //end class

/* Bryan Arnold
 * CSE 2102
 * Lab 02
 * 2/17/2017
 */

/* Class UseBetterClassValidate
 * Purpose: this class just utilizes and sets the variables
 * of the class BetterClassValidate and displays them in date
 * format as well as validates them utilizing
 * try and catch statements for the error messages
 * thrown by the validate method in the class
 * BetterClassValidate. That's it, pretty simple.
 */
public class UseBetterClassValidate { //start class

	/* main() Method
	 * Purpose: this just utilizes and allows for the class
	 * BetterClassValidate to be run and used.
	 */
	public static void main(String[] args) throws Exception {

		try{ //start try

			BetterClassValidate obj1 = new BetterClassValidate(); //creates object
			obj1.setMonth("January"); //sets month
			obj1.setDay(50); //sets day (invalid)
			obj1.setYear(2017); //sets year
			obj1.validate(); //checks if the member variables are valid
			System.out.println("First object:");
			obj1.writeOutput(); //displays member variables in date format
			System.out.println(obj1.getMonth() + " " + obj1.getDay() + ", " + obj1.getYear()); //also displays member variables in output format

		} catch (IllegalArgumentException e){ //start catch, catches IllegalArgumentException

			System.out.println(e.getMessage()); //displays previously created error message

		} //end try catch

		try { //start try

			BetterClassValidate obj2 = new BetterClassValidate(); //creates object
			obj2.setMonth("April"); //sets month
			obj2.setDay(28); //sets day
			obj2.setYear(2017); //sets year
			obj2.validate(); //checks if member variables are valid
			System.out.println("Second object:");
			obj2.writeOutput(); //displays member variables in date format
			System.out.println(obj2.getMonth() + " " + obj2.getDay() + ", " + obj2.getYear()); //also displays member variables in output format

		} catch (IllegalArgumentException e){ //start catch, catches IllegalArgumentException

			System.out.println(e.getMessage()); //displays previously create error message

		} //end try catch

	} //end method

} //end class

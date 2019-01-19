/* Bryan Arnold
 * CSE 2102
 * Lab 02
 * 2/17/2017
 */

/* Class UseBetterClass
 * Purpose: this class just utilizes and sets the variables
 * of the class BetterClass and displays them in date
 * format. That's it, pretty simple.
 */
public class UseBetterClass { //start class

	/* main() Method
	 * Purpose: this just utilizes and allows for the class
	 * BetterClass to be run and used.
	 */
	public static void main(String[] args){ //start method

		BetterClass obj1;
		obj1 = new BetterClass(); //creates new object
		obj1.setMonth("January"); //sets month
		obj1.setDay(17); //sets day
		obj1.setYear(2017); //sets year
		System.out.println("First object:");
		obj1.writeOutput(); //outputs member variables in date format
		System.out.println(obj1.getMonth() + " " + obj1.getDay() + ", " + obj1.getYear()); //also displays member variable in date format

		BetterClass obj2 = new BetterClass(); //creates new object
		obj2.setMonth("April"); //sets month
		obj2.setDay(28); //sets day
		obj2.setYear(2017); //sets year
		System.out.println("Second object:");
		obj2.writeOutput(); //outputs member variables in date format
		System.out.println(obj2.getMonth() + " " + obj2.getDay() + ", " + obj2.getYear()); //also displays member variables in date format

	} //end method

} //end class
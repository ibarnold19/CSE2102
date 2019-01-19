/* Bryan Arnold
 * CSE 2102
 * Lab 02
 * 2/17/2017
 */

/* Class UseSimpleClass
 * Purpose: this class just utilizes and sets the variables
 * of the class SimpleClass and displays them in date
 * format. That's it, pretty simple.
 */
public class UseSimpleClass { //start class

	/* main() Method
	 * Purpose: this just utilizes and allows for the class
	 * SimpleClass to be run and used.
	 */
	public static void main(String[] args) { //start method

		SimpleClass obj1;
		obj1 = new SimpleClass(); //create object
		obj1.month = "January"; //sets the month
		obj1.day = 17; //sets day
		obj1.year = 2017; //sets year
		System.out.println("First object:");
		obj1.writeOutput(); //outputs variables in date format

		SimpleClass obj2 = new SimpleClass(); //creates object
		obj2.month = "April"; //sets month
		obj2.day = 28; //sets day
		obj2.year = 2017; //sets year
		System.out.println("Second object:");
		obj2.writeOutput(); //outputs variables in date format

		SimpleClass bdate = new SimpleClass(); //creates object
		bdate.month = "October"; //sets month
		bdate.day = 8; //sets day
		bdate.year = 1996; //sets year
		System.out.println("Third object (my date of birth):");
		bdate.writeOutput(); //outputs variables in date format

	} //end method

} //end class
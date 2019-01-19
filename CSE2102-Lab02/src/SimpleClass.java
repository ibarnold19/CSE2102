/* Bryan Arnold
 * CSE 2102
 * Lab 02
 * 2/17/2017
 */

/* Class SimpleClass
 * Purpose: this is quite literally just a simple class
 * with the purpose of demonstrating variables in a class
 * as well as utilizing them in methods used in the class.
 * The class has three variables (day, month, and year) and
 * displays them using a method.
 */
public class SimpleClass {//start class

	public String month;
	public int day;
	public int year;

	/* writeOutput() Method
	 * Purpose: this method takes the variables in the class and displays
	 * them in proper date format (month day, year).
	 * Parameters: none
	 * Returns: nothing
	 */
	public void writeOutput(){ //start method

		System.out.println(month + " " + day + ", " + year);

	} //end method	

} //end class

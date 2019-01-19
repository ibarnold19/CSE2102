/* Bryan Arnold
 * CSE 2102
 * Lab 02
 * 2/17/2017
 */

/* Class BetterClass
 * Purpose: this class is an advancement of the class
 * SimpleClass by adding mutators and private member variables,
 * but accomplishes the same purpose as the class SimpleClass in regards
 * to dates.
 */
public class BetterClass { //start class

	private String month;
	private int day;
	private int year;

	//simple get mutator to access the private member variable month
	public String getMonth() { //start method

		return month;

	} //end method

	//simple set mutator to change the private member variable month
	public void setMonth(String month) { //start method

		this.month = month;

	} //end method

	//simple get mutator to access the private member variable day
	public int getDay() { //start method

		return day;

	} //end method

	//simple set mutator to change the private member variable day
	public void setDay(int day) { //start method

		this.day = day;

	} //end method

	//simple get mutator to access the private member variable year
	public int getYear() { //start method

		return year;

	} //end method

	//simple set mutator to change the private member variable year
	public void setYear(int year) { //start method

		this.year = year;

	} //end method

	/* writeOutput() Method
	 * Purpose: this method takes the variables in the class and displays
	 * them in proper date format (month day, year) utilizing the class'
	 * mutator functions.
	 * Parameters: none
	 * Returns: nothing
	 */
	public void writeOutput(){ //start method

		System.out.println(this.getMonth() + " " + this.getDay() + ", " + this.getYear());

	} //end method

} //end class

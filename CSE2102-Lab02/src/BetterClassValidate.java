/* Bryan Arnold
 * CSE 2102
 * Lab 02
 * 2/17/2017
 */

/* Class BetterClassValidate
 * Purpose: this class is an advancement of the class
 * BetterClass by adding mutators and private member variables,
 * but accomplishes the same purpose as the class BetterClass in regards
 * to dates and mutators, but also has a method to validate whether or not
 * the given values for the date are valid or not.
 */
public class BetterClassValidate { //start class

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

	/* validate() Method
	 * Purpose: this method validates whether the given values
	 * for the class' member variables are valid or not. Valid
	 * years must be greater than 1900, days between 1 and 31, and
	 * the months must be the known months of the year. If an invalid
	 * value is found, an error message is thrown.
	 * Parameters: none
	 * Returns: nothing
	 */
	public void validate() throws Exception{ //start method

		if(this.getYear() < 1900){ //start if to find validate year

			IllegalArgumentException bad = new IllegalArgumentException("Invalid year."); //error message
			throw bad; //throw exception

		} //end if

		String month = this.getMonth();

		if(month == "September" || month == "October" || month == "November" || month == "December" || month == "January"|| month == "February" || 
				month == "March" || month == "April" || month == "May" || month == "June" || month == "July" || month == "August"){ //start if to validate month

		} else { //start else

			IllegalArgumentException bad = new IllegalArgumentException("Invalid month."); //error message
			throw bad; //throw exception

		} //end if else chain

		int day = this.getDay();

		if(day < 1 || day > 31){ //start if to validate day

			IllegalArgumentException bad = new IllegalArgumentException("Invalid day."); //error message
			throw bad; //throws exception

		} //end if

	} //end method

} //end class

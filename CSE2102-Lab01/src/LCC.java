import java.util.Scanner; //scanner for user input

/* Bryan Arnold
 * CSE 2102
 * Lab01
 * 2/3/17
 */

/* LCC Class
 * Purpose: this class takes input from the user, 
 * call numbers associated with publications, that then
 * tell the user which category, or none, the call
 * number belongs to. This program only works if valid
 * call numbers are inputed.
 */
public class LCC { //start class

	/* verifyCategory Method
	 * Purpose: this method is responsible for checking the call
	 * number and seeing if it belongs to a category. The category, if 
	 * found to be valid, is found, it is saved ion a string to be used
	 * in another method.
	 * Parameters: String input, the input of a call number from
	 * the user is required to run the program.
	 * Returns: String category, the category the call number
	 * belongs to.
	 */
	public static String verifyCategory(String input){ //start method

		String category = ""; //string to return

		/* All these if, else ifs are
		 * pretty self explanatory. Checks
		 * the first letter of the call number, which determines
		 * the category, then changes the return string to the 
		 * category the call number belongs to.
		 */

		if(input.charAt(0) == 'A'){ //start if

			category = "General Works";

		} else if(input.charAt(0) == 'B'){ //start else if

			category = "Philosophy, Psychology, and Religion";

		} else if(input.charAt(0) == 'C'){ //start else if

			category = "Auxiliary Sciences of History";

		} else if(input.charAt(0) == 'D'){ //start else if

			category = "General and Old World History";

		} else if(input.charAt(0) == 'E'){ //start else if

			category = "History of America";

		} else if(input.charAt(0) == 'F'){ //start else if

			category = "History of the United States and British, Dutch, French, and Latin America";

		} else if(input.charAt(0) == 'G'){ //start else if

			category = "Geography, Anthropology, and Recreation";

		} else if(input.charAt(0) == 'H'){ //start else if

			category = "Social Sciences";

		} else if(input.charAt(0) == 'J'){ //start else if

			category = "Political Science";

		} else if(input.charAt(0) == 'K'){ //start else if

			category = "Law";

		} else if(input.charAt(0) == 'L'){ //start else if

			category = "Education";

		} else if(input.charAt(0) == 'M'){ //start else if

			category = "Music";

		} else if(input.charAt(0) == 'N'){ //start else if

			category = "Fine Arts";

		} else if(input.charAt(0) == 'P'){ //start else if

			category = "Language and Literature";

		} else if(input.charAt(0) == 'Q'){ //start else if

			category = "Science";

		} else if(input.charAt(0) == 'R'){ //start else if

			category = "Medicine";

		} else if(input.charAt(0) == 'S'){ //start else if

			category = "Agriculture";

		} else if(input.charAt(0) == 'T'){ //start else if

			category = "Technology";

		} else if(input.charAt(0) == 'U'){ //start else if

			category = "Military Science";

		} else if(input.charAt(0) == 'V'){ //start else if

			category = "Naval Science";

		} else if(input.charAt(0) == 'Z'){ //start else if

			category = "Bibliography, Library Science, and General Information Resources";

		} else { //start else

			category = "Invalid";

		} //end if else chain

		return category; //return category as a string

	} //end method

	/* callNumber Method
	 * Purpose: this method is responsible for getting the call
	 * number input from the user, checking if it is valid enough
	 * input, then displaying the category associated with the call 
	 * number, utilizing the verifyCategory method.
	 * Parameters: none, just needs user input in method
	 * Return: nothing, just need to display
	 */
	public static void callNumber(){

		Scanner s = new Scanner(System.in); //scanner for input

		System.out.print("Enter a call number: ");

		String input = s.nextLine(); //user call number

		while(input.equals(null) || input.equals("")){ //start while, checks if input null or nothing

			System.out.print("Some input must be given. Please enter a call number: ");

			input = s.nextLine();

		} //end while

		String category = verifyCategory(input); //finds category of call number

		System.out.println("The category for the call number " + input + " is " + category); //displays

		s.close();

	} //end method

	/* Main Method
	 * Purpose: this method just runs the overall 
	 * program by utilizing the callNumber method.
	 */

	public static void main(String[] args) { //start method

		callNumber();

	} //end method

} //end class

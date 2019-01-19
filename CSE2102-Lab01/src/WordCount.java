import java.util.Scanner; //import for later use

/* Bryan Arnold
 * CSE 2102
 * Lab01
 * 2/3/17
 */


/* Class WordCount
 * Purpose: this class excepts a string input
 * from the user, counts how many words are in
 * the given string the user input, then displays 
 * the number of words in the sentence for the user.
 * This class does not account for if other things than
 * strings.
 */
public class WordCount { //start class

	/* wordCounter Method()
	 * Purpose: this method is responsible for taking in the input from
	 * the user, checking whether or not the input exists or is null, 
	 * then counts the number of words in the input. It determines words from one another by
	 * space separations, thus I used the .split() method for the input. This accounts for all
	 * space/word combo.
	 * Parameters: none, just need to alter input.
	 * Returns: int total, the total number of words in the input.
	 */
	public int wordCounter(){ //start method

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in); //scanner for input

		System.out.print("Please enter some words: ");

		String input = s.nextLine(); //input words

		while(input == null || input.equals("")){ //start while, checks if input exists or is null and asks again

			System.out.print("You must enter at least one word (even be it a space). Please re-enter some words: ");

			input = s.nextLine();

		} //end while

		int total = 0; //total words

		if(input.equals("") == true){ //start if, checks if input exists again

		} else if(Character.isLetter(input.charAt(0)) == false && input.length() > 1){//start if else, checks if there is only a space as input

			if(input.charAt(0) == ' '){ //only a space

				total = -1; //gets rid of an annoying only space case

			} //end if

		} //end if else

		String[] str = input.split(" "); //splits string into words

		for(int i = 0; i < str.length; i++){ //start for i

			if(str[i] != " " && str[i] != "" && str[0] != null){ //checks for valid strings in input, if they aren't spaces, add to total

				total++; //total words adds

			} //end if

		} //end for i

		return total; //returns total word count

	} //end method

	/* Main Method
	 * Purpose: runs the program WordCount
	 * and then displays the number of words in the
	 * input the user gave.
	 */
	public static void main(String[] args){ //start method

		WordCount a = new WordCount(); //new WordCount object

		int words = a.wordCounter(); //total word count

		System.out.println("Number of words: " + words); //displays word count

	} //end method

} //end class

/* Bryan Arnold
 * CSE 2102
 * Lab01
 * 2/3/17
 */

/* ConditionalLogic Class
 * Purpose: this class' purpose is to help us
 * understand conditional logic and why the initial
 * program did not work. 
 */
public class ConditionalLogic { //start class

	public static void main(String[] args){ //start method

		int x, y; //creates variables

		x = 0;
		y = 0; //did not exist initially

		if (x < 0) { //start if

			y = 1;

		} //end if

		if (x >= 0) { //start if

			y = 2;

		} //end if

		System.out.println(y); //reported initial error due to y not being initialized. A variable must be initialized before being used in anyway. Final value of y should be 2.

	} //end method

} //end class

/* Bryan Arnold
 * CSE 2102
 * Lab 03
 * 2/24/17
 */

/* Main Class
 * Purpose: to create and run all the methods and objects
 * created in the dog hierarchy. It creates an array of type 
 * dog objects, size 3 as desired by the project, and assigns each
 * type of dog to a sheep dog or poodle dog with given member variables
 * as constructors for each (also desired by the project).
 */
public class Main { //start class

	/* Main Method
	 * This method simple creates dog objects in an array
	 * and runs bark for each. Basically, it runs the overall
	 * programs created prior.
	 */
	public static void main(String[] args) { //start main

		Dog[] kennel = new Dog[3]; //an array of dogs
		kennel[0] = new PoodleDog(12.5, 10, "Toy"); //assign dog one as poodle with specific height and weight and size type
		kennel[1] = new SheepDog(45.3, 50, 12); //assign dog two as a sheep dog with specific height and weight and sheep it guards
		kennel[2] = new PoodleDog(34.7, 16, "Standard"); //assign dog three as poodle with specific height and weight and size type

		for(int i = 0; i < kennel.length; i++){ //start for i

			System.out.print((i + 1) + ": "); //display dog number
			kennel[i].bark(); //invoke bark for each type of dog

		} //end for i

	} //end main

} //end class
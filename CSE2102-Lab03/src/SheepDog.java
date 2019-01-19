/* Bryan Arnold
 * CSE 2102
 * Lab 03
 * 2/24/17
 */

/* SheepDog Class
 * Purpose: this class is an extension of the
 * dog class as it is a specific type of dog. 
 * It's constructor will inherit all the previous
 * member variable of a dog, whilst creating new ones
 * to differentiate itself as a type of dog in the hierarchy.
 */
public class SheepDog extends Dog{ //start class

	private int numberSheep;

	/* SheepDog Constructor
	 * Purpose: since a sheep dog is a dog, it will
	 * inherit the superclass constructor member variables
	 * of height and weight, but now adds on it's own member
	 * to differentiate itself. That variable is the number
	 * of sheep it guards.
	 */
	public SheepDog(double weight, double height, int numberSheep) { //start constructor

		super(weight, height);
		this.setNumberSheep(numberSheep);

	} //end constructor

	//simple getter mutator to get the value of the private member variable of the number of sheep the dog guards
	public int getNumberSheep() { //start method

		return numberSheep;

	} //end method

	//simple setter mutator to change the value of the private member variable of the number of sheep the dog guards
	public void setNumberSheep(int numberSheep) { //start method

		this.numberSheep = numberSheep;

	} //end method

	/* bark Method
	 * Purpose: this is the inherited method from the dog
	 * class that each type of dog will need/use to differentiate 
	 * the type of dog they are. For a sheep dog, it will display it's
	 * height and weight, as well as how many sheep it guards.
	 * Parameters: none
	 * Returns: nothing
	 */
	public void bark() { //start method

		System.out.println("I am a sheepdog weighing " + this.getWeight() + " pounds.");
		System.out.println("I have a height of " + this.getHeight() + ".");
		System.out.println("I guard " + this.getNumberSheep() + " sheep.");

	} //end method

} //end class
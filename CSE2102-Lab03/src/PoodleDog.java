/* Bryan Arnold
 * CSE 2102
 * Lab 03
 * 2/24/17
 */

/* PoodleDog Class
 * Purpose: this class is another extension of the dog
 * class as another type of dog. It's constructor will inherit all the previous
 * member variable of a dog, whilst creating new ones
 * to differentiate itself as a type of dog in the hierarchy.
 */
public class PoodleDog extends Dog{ //start class

	private String size;

	/* SheepDog Constructor
	 * Purpose: since a poodle dog is a dog, it will
	 * inherit the superclass constructor member variables
	 * of height and weight, but now adds on it's own member
	 * to differentiate itself. That variable is the size that
	 * the poodle dog is (Toy, Standard, etc).
	 */
	public PoodleDog(double weight, double height, String size) { //start constructor

		super(weight, height);
		this.setSize(size);

	} //end constructor

	/* bark Method
	 * Purpose: this is the inherited method from the dog
	 * class that each type of dog will need/use to differentiate 
	 * the type of dog they are. For a poodle dog, it will display it's
	 * height and weight, as well the size type of poodle that it is.
	 * Parameters: none
	 * Returns: nothing
	 */
	public void bark() { //start method

		System.out.println("I am a " + this.getSize() + " poodle weighing " + this.getWeight() + " pounds.");
		System.out.println("I have a height of " + this.getHeight() + ".");

	} //end method

	//simple getter mutator to access the type of poodle the dog is stored in the member variable
	public String getSize() { //start method

		return size;

	} //end method

	//simple setter mutator to change the type of poodle the dog is stored in the member variable
	public void setSize(String size) { //start method

		this.size = size;

	} //end method

} //end class
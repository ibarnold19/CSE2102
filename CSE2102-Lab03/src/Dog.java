/* Bryan Arnold
 * CSE 2102
 * Lab 03
 * 2/24/17
 */

/* Dog Class
 * Purpose: this class creates the top of the hierarchy 
 * for dog objects. It sets the baseline for what all dog
 * objects will have, height and weight, and creates a constructor
 * as well as methods that all dog objects will inherit. 
 */
public abstract class Dog { //start class

	private double weight;
	private double height;

	/* Dog Constructor
	 * Purpose: sets the weight and height for a 
	 * dog object, which all dogs have. As well as
	 * initializes the object's private member variables.
	 * Parameters: a double of height and weight
	 * since all dogs have them
	 */
	public Dog(double weight, double height){ //start constructor

		this.setWeight(weight);
		this.setHeight(height);

	} //end constructor

	public abstract void bark(); //bark method to be inherited later on by other dog objects, but different since all dogs barks are different.

	//simple getter mutator to get the value of the private member variable for weight
	public double getWeight() { //start method

		return weight;

	} //end method

	//simple setter mutator to change the private member variable for height
	public void setWeight(double weight) { //start method

		this.weight = weight;

	} //end method

	//simple getter mutator to get the value of the private member variable for height
	public double getHeight() { //start method

		return height;

	} //end method

	//simple setter mutator to change the value of the private member variable for height
	public void setHeight(double height) { //start method

		this.height = height;

	} //end method

} //end class
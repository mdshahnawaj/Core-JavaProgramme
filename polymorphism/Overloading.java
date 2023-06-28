package polymorphism;

/**
 * @author MdShahnawaj
 * Class is used for overloading
*/
public class Overloading {

	/**
	 * Method is used to prit value of number
	 * @param number
	*/
	public void show(int number) {
		System.out.println("Value of a : " + number);
	}

	/**
	 * Method is used to prit value of numberOne and numberTwo
	 * @param numberOne
	 * @param numberTwo
	*/
	public void show(int numberOne, float numberTwo) {
		System.out.println("Value of a & b: " + numberOne + "," + numberTwo);
	}

	/**
	 * Method is used to prit value of numberOne and name
	 * @param numberOne
	 * @param name
	 */
	public void show(int numberOne, String name) {
		System.out.println("Value of a & name : " + numberOne + "," + name);
	}

	public static void main(String[] args) {
		Overloading object = new Overloading();
		object.show(1);
		object.show(5, 10.5f);
		object.show(20, "Chankit");
	}

}
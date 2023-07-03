package BasicProgramme;

/**
 * This class is used for creating constructor
 * @author MdShahnawaj
*/
public class Constructor {

	/** This is default constructor */
	Constructor() {
		System.out.println("Constructor = This is example of constructor");
	}

	/**
	 * Method is used for parameterized constructor 
	 * @param numberOne
	 * @param numberTwo
	*/
	Constructor(int numberOne, int numberTwo) {
		System.out.println("Parameter Constructor = This is example of parameters constructor");
		System.out.println("Addition of 2 + 3 = " + (numberOne + numberTwo));
	}

	public static void main(String[] args) {
		Constructor objectOne = new Constructor();
		Constructor objectTwo = new Constructor(2, 3);
	}

}
package BasicProgramme;

/**
 * This class is used for Print Number using Do-While Loop
 * @author MdShahnawaj
*/
public class DoWhileLoop {

	public static void main(String[] args) {
		int numberOne = 1;
		int numberTwo = 10;
		System.out.println("List Of Number 1 To 10");

		/** This loop is used for print number 1 to 10 */
		do {
			System.out.println("Number : " + numberOne);
			number1++;
		} while (numberOne <= numberTwo);
	}

}
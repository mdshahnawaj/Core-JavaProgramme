package BasicProgramme;

/**
 * @author MdShahnawaj
 * This class is used for Print Number using While Loop
*/
public class WhileLoop {

	public static void main(String[] args) {
		int numberOne = 1;
		int numberTwo = 10;
		System.out.println("List of number 1 To 10");

		// This loop is used for print number 1 to 10
		while (numberOne <= numberTwo) {
			System.out.println("Number : " + numberOne);
			numberOne++;
		}
	}

}
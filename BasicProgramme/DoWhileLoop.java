package BasicProgramme;

/**
 * @author MdShahnawaj 
 * This class is used for Print Number using Do-While Loop
*/
public class DoWhileLoop {

	public static void main(String[] args) {
		int number1 = 1;
		int number2 = 10;
		System.out.println("List Of Number 1 To 10");

		//This loop is used for print number 1 to 10
		do {
			System.out.println("Number : " + number1);
			number1++;
		} while (number1 <= number2);
	}

}
package BasicProgramme;

import java.util.Scanner;

/** 
 * This class is used for wrapper class implementation
 * @author MdShahnawaj
*/
public class WrapperClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first number");
		Integer numOne = input.nextInt();

		System.out.println("Enter the second number");
		Integer numTwo = input.nextInt();

		/** Condition is check for number comparison */
		if (numOne == numTwo) {
			System.out.println("Number is equal");
		} else if (numOne > numTwo) {
			System.out.println("Numone is grater than numtwo");
		} else {
			System.out.println("Numtwo is grater than numone");
		}
		input.close();
	}

}
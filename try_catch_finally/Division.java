package try_catch_finally;

import java.util.Scanner;
/**
 * @author MdShahnawaj
 * Class is used for implement try, catch and finally block
*/
public class Division {

	public static void main(String[] args) {

		//Scanner class used to take input from user
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first number");
		int numberOne = input.nextInt();

		System.out.println("Enter the second number");
		int numberTwo = input.nextInt();

		try {
			int result = numberOne / numberTwo;
			System.out.println("Result:" + result);
		} catch (ArithmeticException e) {
			System.out.println("Number cannot divide by zero");
		} finally {
			System.out.println("This is finally block which is used for closing resourse");
			input.close();
		}
	}

}
package throw_exception;

import java.util.Scanner;

/**
 * Class is used to create custom exception using throw keyword
 * @author MdShahnawaj
*/
public class Voting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your age : ");

		try {
			int age = input.nextInt();
			if (age < 18) {
				throw new YongerAgeException("You are not eligible for voting");
			} else {
				System.out.println("You are eligible for voting");
			}
		} catch (YongerAgeException e) {
			System.out.println("Exception Occour");
		} finally {
			input.close();
		}
	}

}
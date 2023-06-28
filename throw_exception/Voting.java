package throw_exception;

import java.util.Scanner;

/**
 * @author MdShahnawaj
 * Class is used to create custom exception using throw keyword
*/
public class Voting {

	public static void main(String[] args) {

		//Scanner class used to take input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age : ");

		try {
			int age = input.nextInt();
			//Condition check 
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
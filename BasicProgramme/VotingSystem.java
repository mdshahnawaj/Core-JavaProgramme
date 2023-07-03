package BasicProgramme;

import java.util.Scanner;

/**
 * This class is used for creating Voting System program
 * @author MdShahnawaj
*/
public class VotingSystem {

	public static void main(String[] args) {
		final int AGE = 18;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your age");
		int number = input.nextInt();

		/** This condition is used to compare age */
		if (number >= AGE) {
			System.out.println("You are eligible for vote");
		} else {
			System.out.println("You are not eligible for vote");
		}
		input.close();
	}

}
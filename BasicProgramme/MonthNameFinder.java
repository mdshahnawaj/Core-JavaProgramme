package BasicProgramme;

import java.util.Scanner;

/**
 * This class is used for switch case for finding month name
 * @author MdShahnawaj
*/
public class MonthNameFinder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of month");
		int number = input.nextInt();

		/** This is switch case to switch condition according to user input */
		switch (number) {
		case 1:
		{
			System.out.println("Current month name is : January");
			break;
		}
		case 2:
		{
			System.out.println("Current month name is : February");
			break;
		}
		case 3:
		{
			System.out.println("Current month name is : March");
			break;
		}
		case 4:
		{
			System.out.println("Current month name is : April");
			break;
		}
		case 5:
		{
			System.out.println("Current month name is : May");
			break;
		}
		case 6:
		{
			System.out.println("Current month name is : June");
			break;
		}
		case 7:
		{
			System.out.println("Current month name is : July");
			break;
		}
		case 8:
		{
			System.out.println("Current month name is : August");
			break;
		}
		case 9:
		{
			System.out.println("Current month name is : September");
			break;
		}
		case 10:
		{
			System.out.println("Current month name is : October");
			break;
		}
		case 11:
		{
			System.out.println("Current month name is : November");
			break;
		}
		case 12:
		{
			System.out.println("Current month name is : December");
			break;
		}
		default:
			System.out.println("This is wrong month number");
		}
		input.close();
	}

}

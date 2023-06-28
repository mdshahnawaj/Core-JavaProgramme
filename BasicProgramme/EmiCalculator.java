package BasicProgramme;

import java.util.Scanner;

/**
 * @author MdShahnawaj 
 * Class is used for EMI calculator
*/
public class EmiCalculator {

	public static void main(String[] args) {
		//Scanner class used to take input from user
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the principal amount: ");
		double principal = input.nextDouble();

		System.out.println("Enter the annual interest rate (%) : ");
		double interestRate = input.nextDouble() / 100.0;

		double monthlyRate = interestRate / 12.0;

		System.out.println("Enter the loan tenure (in years): ");
		int years = input.nextInt();

		//Convert year to month
		int months = years * 12;

		//Method is used for call calculateEMI method
		double emi = calculateEMI(principal, monthlyRate, months);
		System.out.println("The Equated Monthly Installment (EMI) is: " + emi);
		input.close();
	}

	/**
	 * Method is used to calculate EMI 
	 * @param principle
	 * @param monthlyRate
	 * @param months
	 * @return emi ammount of per year
	*/
	public static double calculateEMI(double principal, double monthlyRate, int months) {
		return (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) / (Math.pow(1 + monthlyRate, months) - 1);
	}

}
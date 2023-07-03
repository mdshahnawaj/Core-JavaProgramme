package BasicProgramme;

import java.math.BigDecimal;

/** 
 * This class is used to implement BigDecimal
 * @author MdShahnawaj
*/
public class Precision {

	public static void main(String[] args) {

		/** BigDecimal class to store large precision point */
		BigDecimal numberOne = new BigDecimal("23.3450430088888");
		BigDecimal numberTwo = new BigDecimal("20.3450432099995");

		/** Condition is used to compare BigDecimal number */
		if (numberOne.compareTo(numberTwo) == 0) {
			System.out.println(numberOne + "and " + numberTwo + " are equal");
		} else if (numberOne.compareTo(numberTwo) == 1) {
			System.out.println(numberOne + "is greater than " + numberTwo);
		} else {
			System.out.println(numberOne + "is lesser than " + numberTwo);
		}
	}

}
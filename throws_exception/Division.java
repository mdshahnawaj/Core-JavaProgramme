package throws_exception;

/**
 * @author MdShahnawaj 
 * Class is used for throws keyword
*/
public class Division {

	/**
	 * Method is used to perform division operation
	 * @param numberOne
	 * @param numberTwo
	 * @return result
	 * @throws ArithmeticException
	*/
	public int divideNumber(int numberOne, int numberTwo) throws ArithmeticException {
		int result = numberOne / numberTwo;
		return result;
	}

	public static void main(String[] args) {
		Division division = new Division();

		try {
			int result = division.divideNumber(50, 5);
			System.out.println("Results :" + result);
		} catch (ArithmeticException e) {
			System.out.println("Number cannot be divided by 0");
		}
		System.out.println("Rest of the code");
	}

}
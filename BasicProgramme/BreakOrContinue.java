package BasicProgramme;

/**
 * This class is used for break & continue statement
 * @author MdShahnawaj
*/
public class BreakOrContinue {

	public static void main(String[] args) {
		final int NUMBER = 10;
		final int CHECK = 8;
		int i;
		System.out.println("List Of Number : ");

		/** This loop is used for print number and implement break and continue */
		for (i = 1; i <= NUMBER; i++) {
			if (i == CHECK) {
				break;
			} else if (i == 5) {
				continue;
			}
			System.out.println("Number : " + i);
		}
	}

}

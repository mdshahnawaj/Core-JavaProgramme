package BasicProgramme;

/**
 * This class is used for print triangle pattern
 * @author MdShahnawaj
*/
public class TrianglePattern {

	public static void main(String[] args) {
		final int NUMBER = 5;
		int row;
		int col;

		/** This loop is used for print triangle pattern */
		for (row = 1; row <= NUMBER; row++) {
			for (col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
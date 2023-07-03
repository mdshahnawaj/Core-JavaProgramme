package BasicProgramme;

/**
 * Class is used for search index position in array
 * @author MdShahnawaj
*/
public class IndexSearchElement {

	public static void main(String[] args) {
		int[] array = { 5, 6, 7, 8, 9 };
		int index = -1;

		/** Loop is used for searching index position */
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 4) {
				index = i;
			}
		}

		/** Check condition for index position is found or not */
		if (index != -1) {
			System.out.println("Index position is :" + index);
		} else {
			System.out.println("Number is not found");
		}
	}

}
package collection;

import java.util.ArrayList;

/**
 * Class is used to remove element from list
 * @author MdShahnawaj
*/
public class RemoveElement {

	public static void main(String[] args) {

		/** This is ArrayList class */
		ArrayList<String> element = new ArrayList<>();
		element.add("A");
		element.add("B");
		element.add("C");
		element.add("D");
		element.add("A");
		element.add("C");
		element.add("E");
		element.add("E");
		element.add("E");

		/** Print all element */
		System.out.println("Before removeing duplicate element :" + element);

		/** Createing new ArrayList to store unique element */
		ArrayList<String> list = new ArrayList<>();

		/** Loop is used for remove duplicate element from list */
		for (int i = 0; i < element.size(); i++) {
			if (!list.contains(element.get(i))) {
				list.add(element.get(i));
			}
		}

		/** Print all unique element */
		System.out.println("After removeing duplicate element :" + list);
	}

}
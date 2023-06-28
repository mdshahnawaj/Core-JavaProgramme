package collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author MdShahnawaj
 * Class is used for add element in list
*/
public class Add {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		list.add("Java");

		//This is Iterator class
		Iterator<String> name = list.iterator();

		System.out.println("List of all elements:");

		//Loop is used for print element from list using iterator
		while (name.hasNext()) {
			System.err.println(name.next());
		}
	}

}
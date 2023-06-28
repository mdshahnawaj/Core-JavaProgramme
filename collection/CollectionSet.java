package collection;

import java.util.HashSet;
/**
 * @author MdShahnawaj
 * Class is used to implementation of Set
*/
public class CollectionSet {

	public static void main(String[] args) {

		//This is HashSet class
		HashSet<Integer> element = new HashSet<Integer>();
		element.add(10);
		element.add(20);
		element.add(30);
		element.add(20);
		element.add(40);
		element.add(50);
		element.add(60);

		//Print all element
		System.out.println("List of element: " + element);

		//Method of HashSet
		element.remove(20);
		System.out.println("After remove element 20 : " + element);
		System.out.println("Check element: " + element.contains(30));
		System.err.println("Element is emty: " + element.isEmpty());
		System.err.println("Size of set elment :" + element.size());
	}

}
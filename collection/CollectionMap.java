package collection;

import java.util.HashMap;

/**
 * @author MdShahnawaj
 * Class is used to implementation of Map
*/
public class CollectionMap {

	public static void main(String[] args) {

		//This is HashMap class
		HashMap<String, Integer> student = new HashMap<>();
		student.put("Id", 1);
		student.put("Roll Number", 101);
		student.put("Total Marks", 500);
		student.put("Obtain Marks", 400);

		//Print all element
		System.out.println("Student result :" + student);

		//This is map method
		System.out.println("Student roll number :" + student.get("Roll Number"));
		System.out.println("Size of map :" + student.size());
		System.out.println("Check the key :" + student.containsKey("Id"));
		System.out.println("Check the key value :" + student.containsValue(101));
		System.out.println("Check the map empty or not  :" + student.isEmpty());
	}

}
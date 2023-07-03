package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Class is used to implements comparable
 * @author MdShahnawaj
*/

class Student implements Comparable<Student> {

	private String name;
	private int age;

	/**
	 * Method is used for set name and age
	 * @param name
	 * @param age
	*/
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * Method is used for get name
	 * @return name
	*/
	public String getName() {
		return name;
	}

	/**
	 * Method is used for get age
	 * @return age
	*/
	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Student otherStudent) {
		return this.age - otherStudent.getAge();
	}

}

/**
 * Class is used to implement comparator.
*/
class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student studentOne, Student studentTwo) {
		return studentOne.getName().compareTo(studentTwo.getName());
	}
}

/**
 * This is main Class is used to implement comparable & comparator
*/
class ComparableAndComparator {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Chankit", 23));
		studentList.add(new Student("Shahnawaj", 22));
		studentList.add(new Student("vibhanshu", 21));

		System.out.println("Before sorting list element:");
		for (Student student : studentList) {
			System.out.println(student.getName() + " - " + student.getAge());
		}

		/** This method is short age in ascending order using comparable */
		Collections.sort(studentList);

		System.out.println("\nAfter sorting by age using Comparable:");
		for (Student student : studentList) {
			System.out.println(student.getName() + " - " + student.getAge());
		}

		/** This method is short name in ascending order using comparator */
		Collections.sort(studentList, new NameComparator());

		System.out.println("\nAfter sorting by name using Comparator:");
		for (Student student : studentList) {
			System.out.println(student.getName() + " - " + student.getAge());
		}
	}

}
package polymorphism;

/**
 * @author MdShahnawaj
 * Class is used for overriding
*/
class Person {

	/**
	 * Method is used to print message
	*/
	public void teach() {
		System.out.println("I can teach Hindi ");
	}

}
/**
 * Class is used for inherit properties of Person
*/
class Teacher extends Person {

	/**
	 * Method is used to print message
	*/
	@Override
	public void teach() {
		System.out.println("I can teach English");
	}

	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.teach();
	}

}
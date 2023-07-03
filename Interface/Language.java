package Interface;

/**
 * Create interface class for achieve abstraction
 * @author MdShahnawaj
*/
interface Language {

	/**
	 * This is abstract method
	 * @param name
	*/
	void getName(String name);
}

class ProgrammingLanguage implements Language {

	/**
	 * This is body of abstract method
	 * @param name
	*/
	public void getName(String name) {
		System.out.println("Programming Language: " + name);
	}

}

class Main {

	public static void main(String[] args) {
		ProgrammingLanguage language = new ProgrammingLanguage();
		language.getName("Java");
	}

}
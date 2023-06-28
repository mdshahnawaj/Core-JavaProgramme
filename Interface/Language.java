package Interface;

/**
 * @author MdShahnawaj
 * Create interface class for achieve abstraction
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
package BasicProgramme;

/**
 * @author MdShahnawaj
 * This class is used for creating static block, method & variable.
*/
public class StaticExample {

	static int number = 10;

	//This is static block
	static {
		System.out.println("This is static block");
	}

	/**
	 * This is static method
	*/
	public static void display() {
		System.out.println("This is static Method:" + number);
	}

	public static void main(String[] args) {
		System.out.println("Access static variable using class name:" + StaticExample.number);
		StaticExample.display();
	}

}
package BasicProgramme;

/**
 * @author MdShahnawaj
 * This class is used for implement parent class.
*/
public class SuperKeyword extends Parent {

	int value = 10;

	/**
	 * Method is used to print value of current or parent class
	*/
	public void display() {
		System.out.println("value of superkeyword class: " + value);
		System.out.println("value of super class: " + super.value);
	}

	public static void main(String[] args) {
		SuperKeyword obj = new SuperKeyword();
		obj.display();
	}

}
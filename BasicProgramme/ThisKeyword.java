package BasicProgramme;

/**
 * This class is used for implementation of this keyword
 * @author MdShahnawaj
*/
public class ThisKeyword {

	int value = 10;

	/**
	 * This is parameterize constructor
	 * @param value
	*/
	ThisKeyword(int value) {
		this();
		System.out.println("Value : " + value);
	}

	/**
	 * This is default constructor
	*/
	ThisKeyword() {
		System.out.println("Calling constructor using this keyword");
	}

	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * This method is used to print value of current instance variable
	*/
	public void display() {
		System.out.println("Access value of instance variable of current class :" + value);
	}

	public static void main(String[] args) {
		ThisKeyword set = new ThisKeyword(12);
		set.setValue(20);
		set.display();
	}

}
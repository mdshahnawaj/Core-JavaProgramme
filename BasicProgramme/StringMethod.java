package BasicProgramme;

/** 
 * Class is used for implementation of string method
 * @author MdShahnawaj
*/
public class StringMethod {

	public static void main(String[] args) {
		String nameOne = "stringOne";
		String nameTwo = "stringTwo";

		/** String method to perform string operation */
		System.out.println("Find index position in string : " + nameOne.charAt(3));
		System.out.println("Concat two string : " + nameOne.concat(nameTwo));
		System.out.println("Compare two string : " + nameOne.equals(nameTwo));
	}

}

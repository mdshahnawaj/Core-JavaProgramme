package BasicProgramme;
/**
 * @author MdShahnawaj
 * Class is used to compare two string == or equals method
*/
public class Compare {

	public static void main(String[] args) {
		String nameOne = "chankit";
		String nameTwo = "chankit";
		String nameThree = new String("chankit");

		//Compare string using == or equals()
		System.out.println("Compare string using == operator:" + (nameOne == nameTwo));
		System.out.println("Compare string using == operator:" + (nameOne == nameThree));
		System.out.println("Compare string using equal method:" + nameOne.equals(nameTwo));
	}

}
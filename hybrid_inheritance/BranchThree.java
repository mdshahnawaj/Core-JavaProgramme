package hybrid_inheritance;

/**
 * @author MdShahnawaj
 * Class is used for inherit properties of BranchOne
*/
public class BranchThree extends BranchOne {

	String name = "Harshit";

	/**
	 * Method is used to display name and companyName
	*/
	public void view() {
		System.out.println("Employee name :" + name);
		System.out.println("Company name :" + companyName);
	}

}
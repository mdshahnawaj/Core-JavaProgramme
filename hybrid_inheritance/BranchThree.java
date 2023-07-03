package hybrid_inheritance;

/**
 * Class is used for inherit properties of BranchOne
 * @author MdShahnawaj
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
package multilevel_inheritance;

/**
 * Class is used for inherit properties of BranchOne
 * @author MdShahnawaj
*/
public class BranchTwo extends BranchOne {

	String name = "Shahnawaj";

	/**
	 * Method is used to display name and companyName
	*/
	public void print() {
		System.out.println("Employee name :" + name);
		System.out.println("Company name :" + companyName);
	}

}
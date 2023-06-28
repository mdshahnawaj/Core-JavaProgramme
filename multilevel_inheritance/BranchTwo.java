package multilevel_inheritance;

/**
 * @author MdShahnawaj
 * Class is used for inherit properties of BranchOne
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
package hierarchical_inheritance;

/**
 * Class is used for inherit properties of Company
 * @author MdShahnawaj
*/
public class BranchOne extends Company {

	String name = "Shahnawaj";

	/**
	 * Method is used to display name and companyName
	*/
	public void print() {
		System.out.println("Employee name :" + name);
		System.out.println("Company name :" + companyName);
	}

}
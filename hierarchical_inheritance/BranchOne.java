package hierarchical_inheritance;
/**
 * @author MdShahnawaj
 * Class is used for inherit properties of Company
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
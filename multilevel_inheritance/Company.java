package multilevel_inheritance;

/**
 * @author MdShahnawaj
 * Class is used for inherit properties of BranchTwo
*/
public class Company extends BranchTwo {

	String name = "Garvit";

	/**
	 * Method is used to display name and companyName
	*/
	public void show() {
		System.out.println("Employee name :" + name);
		System.out.println("Company name :" + companyName);
	}

	public static void main(String[] args) {
		Company company = new Company();
		company.display();
		company.print();
		company.show();
	}

}
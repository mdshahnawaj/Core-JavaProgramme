package hierarchical_inheritance;

/**
 * Class is used for inherit properties of Company
 * @author MdShahnawaj
*/
public class BranchTwo extends Company {

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

		BranchOne branchOne = new BranchOne();
		branchOne.display();
		branchOne.print();

		BranchTwo branchTwo = new BranchTwo();
		branchTwo.show();
		branchTwo.display();
	}

}
package single_inheritance;

/**
 * @author MdShahnawaj
 * Class is used for inherit properties of company class
*/
public class Employee extends Company {

	String name = "Shahnawaj";

	/**
	 * Method is used to display name and companyName
	*/
	public void show() {
		System.out.println("Employee name :" + name);
		System.out.println("Company name :" + companyName);
	}

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.display();
		employee.show();
	}

}
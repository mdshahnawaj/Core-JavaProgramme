package BasicProgramme;

/**
 * @author MdShahnawaj 
 * Class is used for implementation of abstraction
*/
public class Company extends Employee {

	/**
	 * This is override abstract method
	*/
	public void employeeSalary(int a) {
		System.out.println("Employee salary is :" + a);
	}

	public static void main(String[] args) {
		Company company = new Company();
		company.employee("Chankit");
		company.employeeSalary(20000);
	}

}
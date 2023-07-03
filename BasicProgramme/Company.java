package BasicProgramme;

/** 
 * Class is used for implementation of abstraction
 * @author MdShahnawaj
*/
public class Company extends Employee {

	/**
	 * This is override abstract method
	 * @param salary
	*/
	public void employeeSalary(int salary) {
		System.out.println("Employee salary is :" + salary);
	}

	public static void main(String[] args) {
		Company company = new Company();
		company.employee("Chankit");
		company.employeeSalary(20000);
	}

}
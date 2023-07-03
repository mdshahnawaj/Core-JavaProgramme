package BasicProgramme;

/**
 * Class is used for abstraction.
 * @author MdShahnawaj
*/
public abstract class Employee {

	String employeeName;

	/**
	 * This is abstract method
	 * @param salary
	*/
	public abstract void employeeSalary(int salary);

	/**
	 * This is non abstract method
	 * @param employeeName 
	*/
	public void employee(String employeeName) {
		System.err.println("This is about employee");
		System.err.println("Employee name is : " + employeeName);
	}

}
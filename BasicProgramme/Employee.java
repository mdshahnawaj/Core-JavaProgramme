package BasicProgramme;

/**
 * @author MdShahnawaj
 * Class is used for abstraction.
*/
public abstract class Employee {

	String employeeName;

	/**
	 * This is abstract method
	*/
	public abstract void employeeSalary(int a);

	/**
	 * This is non abstract method
	*/
	public void employee(String employeeName) {
		System.err.println("This is about employee");
		System.err.println("Employee name is : " + employeeName);
	}

}
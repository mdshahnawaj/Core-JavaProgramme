package BasicProgramme;

/**
 * Class is used for getter & setter and achieve encapsulation
 * @author MdShahnawaj
*/
public class Student {

	private int studentRollNo;
	private String studentName;

	/**
	 * Method is used to get StudentRollNo
	 * @return studentRollNo
	*/
	public int getStudentRollNo() {
		return studentRollNo;
	}

	/**
	 * Method is used to set StudentRollNo
	 * @param studentRollNo
	*/
	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}

	/**
	 * Method is used to get StudentName
	 * @return studentName
	*/
	public String getStudentName() {
		return studentName;
	}

	/**
	 * Method is used to set StudentName
	 * @param studentName
	*/
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/**
	 * Method is used to display studentName and studentRollNo
	*/
	public void display() {
		System.out.println("Student name is :" + studentName);
		System.out.println("Student rollNo is :" + studentRollNo);
	}

}
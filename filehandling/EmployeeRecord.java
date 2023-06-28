package filehandling;

import java.io.File;
import java.io.FileWriter;

/**
 * @author MdShahnawaj
 * This class is used to store data in file
*/
class EmployeeRecord {

	public static void main(String args[]) {
		File file = new File("D:\\FileHandling\\Student.txt");
		try {
			if (file.createNewFile()) {
				//This is file writer class
				FileWriter fileWriter = new FileWriter(file);

				//Write data in file using write function
				fileWriter.write("Name : Shahnawaj \nCompany : QDev Technolab \nEmail : msd123@gmail.com");
				System.out.println("Information successfully added :");
				fileWriter.close();
			} else {
				System.out.println("File already exist:");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
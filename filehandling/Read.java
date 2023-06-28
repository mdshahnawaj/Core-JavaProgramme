package filehandling;

import java.io.FileReader;

/**
 * @author MdShahnawaj
 * Class is used to read data from file
*/
public class Read {

	public static void main(String[] args) {
		try {
			//This is FileReader class
			FileReader fileReader = new FileReader("D:\\FileHandling\\Student.txt");
			int data;
			System.out.println("Employee details :");

			//This loop is used to fetch data in a file
			while ((data = fileReader.read()) != -1) {
				System.out.print((char) data);
			}
			fileReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
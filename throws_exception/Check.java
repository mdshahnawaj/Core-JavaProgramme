package throws_exception;

import java.io.FileNotFoundException;

/** 
 * Class is used for handle exception
 * @author MdShahnawaj
*/
public class Check {

	public static void main(String[] args) {
		ReadFile read = new ReadFile();

		try {
			read.readFile();
			System.out.println("File is found");
		} catch (FileNotFoundException fn) {
			System.out.println("File is not found");
		}
	}

}
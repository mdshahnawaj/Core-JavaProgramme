package throws_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Class is used for throws keyword
 * @author MdShahnawaj
*/
public class ReadFile {

	/**
	 * Method is used to read file 
	 * @throws FileNotFoundException
	*/
	public void readFile() throws FileNotFoundException {
		FileInputStream fileInputStream = new FileInputStream("D:\\abc.txt");
	}

}
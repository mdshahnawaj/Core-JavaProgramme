package throw_exception;
 
/**
 * Class is used to print exception message
 * @author MdShahnawaj
*/
public class YongerAgeException extends RuntimeException {

	/**
	 * Method is used to print message
	 * @param massage
	*/
	YongerAgeException(String massage) {
		super(massage);
	}

}
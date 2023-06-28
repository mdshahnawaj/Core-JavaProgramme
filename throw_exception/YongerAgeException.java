package throw_exception;
 
/**
 * @author MdShahnawaj
 * Class is used to print exception message
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
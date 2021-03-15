package question1;

/**
 * "How do I convert a String to an int in Java?"
 * 
 * @author Armin Kerscher
 *
 */
public class Question1 {

	public static void main(String[] args) {
		
		try {
			int number1 = Integer.parseInt("-16");
		} catch (NumberFormatException e) {
			// Exception handling
			System.err.println(e);
		}
		
		
		try {
			Integer number2 = Integer.valueOf("-16");
		} catch (NumberFormatException e) {
			// Exception handling
		}
		
		
		// java.lang.NumberFormatException: For input string: "--16"
		try {
			Integer.valueOf("--16");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}

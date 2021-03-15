package question5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * "How to split a string in Java"
 * 
 * @author Armin Kerscher
 */
public class Question5 {

	public static void main(String[] args) {
		
		// source of regex: https://stackoverflow.com/questions/8204680/java-regex-email
		Pattern validMailAdressRegex = 
			    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		
		
		String s = "hans.mustermann@gmail.com";
		
		if (validMailAdressRegex.matcher(s).find()) {
			
			for (String part : s.split("[@]")) {
				System.out.println("-1-> " + part);
			}
			
			for (String part : s.split("[.@]")) {
				System.out.println("-2-> " + part);
			}
			
			for (String part : Pattern.compile("[@]").split(s)) {
				System.out.println("-3-> " + part);
			}
			
		} else {
			throw new IllegalArgumentException("Given string is not a valid mail adress");
		}
		// Output:
		// -1-> hans.mustermann
		// -1-> gmail.com
		// -2-> hans
		// -2-> mustermann
		// -2-> gmail
		// -2-> com
		// -3-> hans.mustermann
		// -3-> gmail.com
	}
}

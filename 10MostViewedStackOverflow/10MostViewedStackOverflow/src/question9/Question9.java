package question9;

/**
 * "What is a NullPointerException, and how do I fix it?"
 * 
 * @author Armin Kerscher
 */
public class Question9 {
	
	private static String convertToUpperstring(String s) {
		if (s == null) {
			throw new IllegalArgumentException("Argument may not be null");
		}
		return s.toUpperCase();
	}

	public static void main(String[] args) {
		
		Object o1 = new Object(); // Object 1
		Object o2 = o1;
		Object o3 = o1;
		Object o4  = null;

		System.out.println(o1.toString()); // java.lang.Object@6e8dacdf
		System.out.println(o2.toString()); // java.lang.Object@6e8dacdf
		System.out.println(o3.toString()); // java.lang.Object@6e8dacdf
		
		// Exception in thread "main" java.lang.NullPointerException
		System.out.println(o4.toString());
	}
}

package question4;

import java.util.Objects;

/**
 * "How do I compare strings in Java?"
 * 
 * @author Armin Kerscher
 */
public class Question4 {

	public static void main(String[] args) {
		
		String s1 = new String("hello world");
		String s2 = s1;
		
		boolean equals = s1.equals(s2); // true
		
		System.out.println("s1.equals(s2)? " + equals);

		
		s2 = new String("hello world");
		
		equals = s1.equals(s2); // true
		
		System.out.println("s1.equals(s2)? " + equals);
		
		
		
		// Achtung vor NullPointerExceptions
		
		String s3 = null;
		String s4 = null;
		
		System.out.println("s3 == s4? " + (s3 == s4)); // true
		
//		System.out.println("s3.equals(s4)? " + s3.equals(s4)); // NullPointerException
		
		System.out.println(Objects.equals(s3, s4)); // true
		
		
		
		// Stringpool
		
		String s5 = "hello world";
		String s6 = "hello world";
		String s7 = new String("hello world");
		
		System.out.println("s5 == s6? " + (s5 == s6)); // true
		System.out.println("s6 == s7? " + (s6 == s7)); // false
		
	}
}

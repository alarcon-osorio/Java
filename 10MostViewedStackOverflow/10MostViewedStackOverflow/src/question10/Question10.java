package question10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * "How does the Java 'for each' loop work?"
 * 
 * @author Armin Kerscher
 */
public class Question10 {

	private static class MyStringContainer implements Iterable<String> {
		
		private List<String> strings;
		
		public MyStringContainer() {
			strings = new ArrayList<>();
		}
		
		public void add(String s) {
			strings.add(s);
		}

		@Override
		public Iterator<String> iterator() {
			return strings.iterator();
		}
	}
	
	public static void main(String[] args) {
		
		MyStringContainer myStringContainer = new MyStringContainer();
		
		myStringContainer.add("hello");
		myStringContainer.add("world");
		
		for (String s : myStringContainer) {
			System.out.println("-> " + s);
		}
		// Output:
		// -> hello
		// -> world
		
		
		// instead of using the iterator explicitly:
		Iterator<String> iterator = myStringContainer.iterator();
		
		while (iterator.hasNext()) {
			System.out.println("---> " + iterator.next());
		}
		// Output:
		// ---> hello
		// ---> world
	}
}

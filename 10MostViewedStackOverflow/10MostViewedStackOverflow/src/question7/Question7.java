package question7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * "Initialization of an ArrayList in one line"
 * 
 * @author Armin Kerscher
 */
public class Question7 {

	public static void main(String[] args) {
		
		List<String> unmodifiableList = List.<String>of("hello", "world");
		// java.lang.UnsupportedOperationException
		//unmodifiableList.add("test");
		//java.lang.UnsupportedOperationException
		//unmodifiableList.remove(0);

		
		// one line creation and initialization
		ArrayList<String> arrayList = new ArrayList<>(List.of("hello", "world"));
		// ok
		arrayList.add("test");
		//ok
		arrayList.remove(0);
		
		
		List<String> fixedSizeList = Arrays.asList("hello", "world");
		// ok
		fixedSizeList.set(0, "new hello");
		// java.lang.UnsupportedOperationException
		// fixedSizeList.remove(0);
		
		// one line creation and initialization
		arrayList = new ArrayList<>(Arrays.asList("hello", "world"));
		// ok
		arrayList.add("test");
		//ok
		arrayList.remove(0);
	}
}

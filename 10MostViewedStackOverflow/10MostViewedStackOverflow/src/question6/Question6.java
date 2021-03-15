package question6;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * "Iterate through a HashMap"
 * 
 * @author Armin Kerscher
 */
public class Question6 {

	
	private static void iterateThroughMap(Map<?, ?> map) {
		
		for(Map.Entry<?, ?> entry : map.entrySet()) {
			System.out.println(String.format("Key=%s, value=%s", entry.getKey(), entry.getValue()));
		}
	}
	
	
	public static void main(String[] args) {
		
		Map<Integer, String> testMap = new HashMap<>();
		testMap.put(0, "zero");
		testMap.put(1, "one");
		testMap.put(10, "ten");
		testMap.put(100, "hundred");
		
		iterateThroughMap(testMap);
		
		System.out.println("------");
		
		Map<String, Object> testMap2 = new TreeMap<>();
		testMap2.put("one", new String("one"));
		testMap2.put("two", Integer.valueOf(2));
		testMap2.put("five", Integer.parseInt("5"));
		
		iterateThroughMap(testMap2);
		
		// Output:
		// Key=0, value=zero
		// Key=1, value=one
		// Key=100, value=hundred
		// Key=10, value=ten
		// ------
		// Key=five, value=5
		// Key=one, value=one
		// Key=two, value=2
	}
}

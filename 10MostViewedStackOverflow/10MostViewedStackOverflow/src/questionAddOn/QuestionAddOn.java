package questionAddOn;

/**
 * "Is Java “pass-by-reference” or “pass-by-value”?"
 * 
 * @author Armin Kerscher
 */
public class QuestionAddOn {

	private static void increment(int paramI) {
		paramI = paramI + 1;
	}
	
	private static void method(Object param) {
		Object o2 = new Object();
		System.out.println(o2); // java.lang.Object@65ae6ba4
		param = o2;
	}
	
	public static void main(String[] args) {
		
		int i = 0;
		increment(i);
		System.out.println(i); // 0
		
		
		Object o1 = new Object();
		System.out.println(o1); // java.lang.Object@4d591d15
		method(o1);
		System.out.println(o1); // java.lang.Object@4d591d15
	}
}

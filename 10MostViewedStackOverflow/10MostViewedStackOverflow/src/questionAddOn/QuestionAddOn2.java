package questionAddOn;

/**
 * "Is Java “pass-by-reference” or “pass-by-value”?"
 * 
 * @author Armin Kerscher
 */
public class QuestionAddOn2 {
	
	private static class Foo {
		private String str;
		
		public Foo(String str) {
			this.str = str;
		}
		
		public void setStr(String str) {
			this.str = str;
		}
		
		@Override
		public String toString() {
			return str;
		}
	}
	
	private static void method(Foo foo) {
		foo = new Foo("Foo2");
	}
	
	private static void method2(Foo foo) {
		foo.setStr("new string for foo");
	}
	
	public static void main(String[] args) {

		Foo foo1 = new Foo("foo1");
		method(foo1);
		System.out.println(foo1); // foo1
		
		// but:
		method2(foo1);
		System.out.println(foo1); // new string for foo
	}
}

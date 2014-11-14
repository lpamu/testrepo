package my.review;

public class test {
	public static void main(String args[]) {
		test t = new test();
		// To fix this error: No enclosing instance of type test is accessible. 
		//Must qualify the allocation with an enclosing instance of type test (e.g. x.new A() where x is an instance of test).
		myobj1 m = t.new myobj1(); 
		
	}
	class myobj1 {
		String s1;
		myobj1() {
			s1 = "I am S1";
		}
		myobj1(String s) {
			s1 = s;
		}

		public String toString() {
			return s1;
		}
	}
}

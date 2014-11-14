package my.test;

/**
 * @author lpamu
 *
 *         To change the template for this generated type comment go to
 *         Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class Test {

	public static void main(String[] args) {
		// test1();
		printFibonacci();
		fizzbuzz();
	}

	public static void test1() {
		String a = null;
		if (a != null && a.length() > 10) { // does not throw null pointer
											// exception, as the first is NOT
											// true, it does NOT execute the
											// second
			System.out.println("&&");
		}

		if (a == null && a.length() > 10) { // throw null pointer exception, as
											// the first is true, it does
											// execute the second
			System.out.println("&&");
		}

		if (a != null & a.length() > 1) { // throws null pointer exception as it
											// executes both statements
			System.out.println("&");
		}

		int bitmask = 0x000F;
		int val = 0x2222;
		// prints "2"
		System.out.println(val & bitmask);

	}

	public static void printFibonacci() {

		int k = 1;
		int m = 1;
		int j = 1;
		System.out.print(k + "," + m + ",");
		// 1, 2, 3, 5, 8, 13, 21

		for (int i = 0; i < 10; i++) {
			j = k + m;

			System.out.print(j + ",");
			k = m;
			m = j;
		}
	}

	public static void fizzbuzz() {

		for (int i = 1; i < 100; i++) {
			if (i % 15 == 0)
				System.out.println("i = " + i + " fizzbuzz   multiple of 15");
			else if (i % 5 == 0)
				System.out.println("i = " + i + " buzz   multiple of 5");
			else if (i % 3 == 0)
				System.out.println("i = " + i + " fizz   multiple of 3");

		}
	}
}

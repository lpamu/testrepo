package my.review3;

public class VariableArgumentTest {

	public static void main(String[] args) {

		addTest("Addition Ressult", 10, 20);
		addTest("Addition", new int[] { 10, 20 });

		addTest("Addition Ressult", 10, 20, 30);
		addTest("Addition", new int[] { 10, 20, 30 });

		addTest("Addition Ressult");
		addTest("Addition", new int[] {});

	}
	static void addTest(String message, int a, int b) {

		int result = a + b;

		System.out.println("addTest(String message, int a, int b) message = " + result);
	}
	
	static void addTest(String message, int a, int b, int c) {

		int result = a + b + c;

		System.out.println("addTest(String message, int a, int b, int c) message = "+ result);
		 
	}
	
	
	static void  addTest(String message, int... numbers) {

		int result = 0;

		for (int num : numbers) {

			result = result + num;

		}

		System.out.println("addTest(String message, int... numbers)  message = "+ result);

	}

	
	/*
	 * 
static void test(int... a, String... b) -> Invalid, more than one variable argument type.  
static void test(int... a, int... b)    -> Invalid, more than one variable argument type.  
static void test(int... a, int b, int c)-> Invalid, Variable argument type must be the last parameter.  
static void test(int a, int... b, int c)-> Invalid, Variable argument type must be the last parameter.  
static void test(int a, int... b)       -> This is legal.  
static void test(int... a)              -> This is also legal. 
	 */
}

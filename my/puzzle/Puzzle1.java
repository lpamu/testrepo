package my.puzzle;

public class Puzzle1 {
	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	public static void test1() {
			System.out.println("java");
			return;
			//If uncommented the below line, throws unreachable block error
			//System.out.println("papers");
		    }
	 public static void test2() {
			System.out.println("java");
			/*Only for ‘if’ construct the rule is different. The conditional expression is not evaluated and decided. */
			if(true)
				return;
			System.out.println("papers");
		    }
	 public static void test3() {
			System.out.println("java");
			while(true)
					return;
			//If uncommented the below line, throws unreachable block error
			//System.out.println("papers");
		    }
}

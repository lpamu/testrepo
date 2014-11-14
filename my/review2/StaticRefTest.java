/*
 * Created on Sep 20, 2010
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package my.review2;

/**
 * @author lpamu
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
class A {
	static String foo() {
		return "A";
	}
}
class B extends A {
	static String foo() {
		return "B";
	}
}
public class StaticRefTest {
	public static void main(String[] args) {
		test1();
		test2();	
	}
		
	public static void test1() {
		A a = new B();
		System.out.println("a.foo() = " + a.foo());
		System.out.println("((B) a).foo() = " + ((B) a).foo());
	}
	
	public static void test2() {
			System.out.println("A.foo() = " + A.foo());
			System.out.println("B.foo() = " + B.foo());
		}
	
	
}
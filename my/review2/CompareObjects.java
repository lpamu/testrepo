/*
 * Created on Sep 16, 2010
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
public class CompareObjects {
	String str1 = "Hello World";
	String str2 = "Hello World";

	String str3 = new String("Hello World");
	String str4 = str3;

	public static void main(String[] args) {
		CompareObjects o = new CompareObjects();
	}

	public CompareObjects() {
		if (str1 == str2)
			System.out.println("String1==String2");
			
		if (str1.equals(str2))
			System.out.println("String1.equals(String2)");

		if (str2 == str3)
			System.out.println("String2==String3");
		else
		  System.out.println("String2 is not == to String3");

		if (str3.equals(str4))
			System.out.println("String3.equals(String4)");

		if (str3 == str4)
			System.out.println("String3==String4");
	}
}

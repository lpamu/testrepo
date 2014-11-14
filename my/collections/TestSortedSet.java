/*
 * Created on Sep 20, 2010
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package my.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author lpamu
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class TestSortedSet {

	public static void main(String[] args) {
		testHashSet();

		doTreeSetExample();

		testTreeSet();
	}

	public static void testHashSet() {
		System.out.println("Begin testHashSet()");
		Set s = new HashSet();
		s.add(new myobj1());
		s.add(new myobj2());
		s.add(new myobj1("myobj1:s1"));
		s.add(new myobj2("myobj2:s2"));
		s.add("a");
		s.add("b");
		s.add("c");

		Iterator it = s.iterator();
		while (it.hasNext()) {
			Object obj2 = it.next();
			System.out.println("obj has " + obj2);
		}
		System.out.println("End testHashSet()\n");
	}

	public static void testTreeSet() {
		System.out.println("Begin testTreeSet()");
		TreeSet ts = new TreeSet();
		ts.add(new myobj1());

		/*
				 * since we have a Set collection of Integers, we cannot now attempt to add either 
				 * "Object" or "String" elements. Attempting to add any of the following
				 * elements will result in a "java.lang.ClassCastException" runtime exception:
				 *  ss.add((Object)"Melody");
				 *   ss.add("Jeff");
				 */

		//ts.add(new myobj1());
		ts.add(new myobj1("myobj1:s1"));
		//s.add(new myobj2("myobj2:s2"));
		Iterator it = ts.iterator();
		while (it.hasNext()) {
			Object obj2 = it.next();
			System.out.println("obj has " + obj2);
		}
		System.out.println("End testTreeSet()\n");
	}
	/**
	 * Provides an example of how to work with the TreeSet container.
	 */
	public static void doTreeSetExample() {

		final int MAX = 10;

		System.out.println("Create/Store objects in a TreeSet container.");
		System.out.println();

		Set ss = new TreeSet();

		for (int i = 0; i < MAX; i++) {
			System.out.println("  - Storing Integer(" + i + ")");
			ss.add(new Integer(i));
		}

		System.out.println();
		System.out.println(
			"Retrieve objects in a TreeSet container using an Iterator.");
		System.out.println();

		Iterator i = ss.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}
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

class myobj2 {
	String s2;
	myobj2() {
		s2 = "I am S2";
	}
	myobj2(String s) {
		s2 = s;
	}

	public String toString() {
		return s2;
	}
}

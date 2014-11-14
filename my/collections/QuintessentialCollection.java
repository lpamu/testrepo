/*
 * Created on Sep 20, 2010
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package my.collections;

import java.util.*;

/**
 * -----------------------------------------------------------------------------
 * Used to provide an example of printing a container.  Unlike arrays,
 * containers require no special formating help when being printed.
 *
 * @author Jeffrey M. Hunter  (jhunter@idevelopment.info)
 * @author http://www.idevelopment.info
 *         -----------------------------------------------------------------------------
 * @version 1.0
 */

public class QuintessentialCollection {


	/**
	 * An overloaded method from the Collection class.
	 */
	public static Collection fill(Collection c) {
		System.out.println("From Collection fill(Collection c)");
		c.add("Collection Enterprise Server");
		c.add("Collection Department Server");
		c.add("Collection Workstation");
		return c;
	}


	/**
	 * An overloaded method from the Map class.
	 */
	public static Map fill(Map m) {
		System.out.println("From Map fill(Map m)");
		System.out.println("+-------------+");
		m.put("Enterprise Server", "Sun Solaris");
		m.put("Enterprise Server", "HP-UX");
		m.put("Department Server", "Linux");
		m.put("Workstation", "MS Windows");
		m.put("Workstation", "Macintosh");
		return m;
	}


	/**
	 * Provides an example of the default printing behavior of the Collection
	 * and Map classes. This is provided by the various toString() methods of
	 * the containers.
	 */
	public static void doPrintContainer() {

		Collection p1;
		Map m1;

		List a1 = new ArrayList();
		p1 = fill(a1);
		System.out.println("\n");
		System.out.println("+-------------+");
		System.out.println("| ArrayList   |");
		System.out.println("+-------------+");
		System.out.println("  - Ordered group of elements");
		System.out.println("  - Duplicates allowed");
		System.out.println("================================");
		System.out.println("    " + p1 + "\n");


		List a2 = new LinkedList();
		p1 = fill(a2);
		System.out.println("+-------------+");
		System.out.println("| LinkedList  |");
		System.out.println("+-------------+");
		System.out.println("  - Ordered (by entry into the list) group of elements");
		System.out.println("  - Duplicates allowed");
		System.out.println("================================");
		System.out.println("    " + p1 + "\n");


		Set a3 = new HashSet();
		p1 = fill(a3);
		System.out.println("+-------------+");
		System.out.println("| HashSet     |");
		System.out.println("+-------------+");
		System.out.println("  - No ordering of elements");
		System.out.println("  - No duplicates are allowed");
		System.out.println("  - add, remove, and contains methods constant time");
		System.out.println("    complexity: O(c).");
		System.out.println("================================");
		System.out.println("    " + p1 + "\n");


		Set a4 = new TreeSet();
		p1 = fill(a4);
		System.out.println("+-------------+");
		System.out.println("| TreeSet     |");
		System.out.println("+-------------+");
		System.out.println("  - Ordered (by element ASCII value) group of elements");
		System.out.println("  - No duplicates are allowed");
		System.out.println("  - add, remove, and contains methods logarithmic");
		System.out.println("    time complexity: O(log(n)), where n is the number of");
		System.out.println("    elements in the group.");
		System.out.println("================================");
		System.out.println("    " + p1 + "\n");


		Map a5 = new HashMap();
		m1 = fill(a5);
		System.out.println("+-------------+");
		System.out.println("| HashMap     |");
		System.out.println("+-------------+");
		System.out.println("  - No ordering on (key, value) pairs.");
		System.out.println("  - A Map is an object that maps keys to values.");
		System.out.println("  - Also called an Associative Array or Dictionary.");
		System.out.println("================================");
		System.out.println("    " + m1 + "\n");


		Map a6 = new TreeMap();
		m1 = fill(a6);
		System.out.println("+-------------+");
		System.out.println("| TreeMap     |");
		System.out.println("+-------------+");
		System.out.println("  - (key, value) pairs are ordered on the key.");
		System.out.println("  - The implementation is based on red-black tree structure.");
		System.out.println("  - A Map is an object that maps keys to values.");
		System.out.println("  - Also called an Associative Array or Dictionary.");
		System.out.println("================================");
		System.out.println("    " + m1 + "\n");

	}


	/**
	 * Sole entry point to the class and application.
	 *
	 * @param args Array of String arguments.
	 */
	public static void main(String[] args) {
		doPrintContainer();
	}

}

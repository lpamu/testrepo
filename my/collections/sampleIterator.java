package my.collections;

import java.util.*;

public class sampleIterator {

	public static void main(String args[])

	{

		ArrayList Cities = new ArrayList(); // creating array list

		Cities.add("New York"); // adding elements to array list

		Cities.add("Washington");

		Cities.add("Beijing");

		Cities.add("Dubai");

		Cities.add("New Delhi");

		Cities.add("Singapore");

		System.out.println("Initial contents of Cities :"); // Displaying
															// original contents
															// of cities

		Iterator it = Cities.iterator();

		while (it.hasNext())

		{

			Object obj = it.next();

			System.out.print(obj + "   ");

		}

		System.out.println();

		ListIterator lit = Cities.listIterator();

		while (lit.hasNext()) // modifying objects

		{

			Object obj = lit.next();

			lit.set(obj + " City");

		}

		System.out.println("Modified Cities:"); // Displaying modified objects
												// using iterator

		it = Cities.iterator();

		while (it.hasNext()) {

			Object obj = it.next();

			System.out.println(obj + " ");

		}

		System.out.println();

	}
}

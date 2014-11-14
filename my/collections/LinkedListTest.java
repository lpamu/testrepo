package my.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args){
		List a1 = new ArrayList();
	      a1.add("Zara");
	      a1.add("Mahnaz");
	      a1.add("Ayan");
	      a1.add("Zara1");
	      a1.add("Mahnaz1");
	      a1.add("Ayan1");
	     System.out.println(" ArrayList Elements");
	      System.out.print("\t" + a1);
	      
	      List l1 = new LinkedList();
	      l1.add("Zara1");
	      l1.add("Mahnaz1");
	      l1.add("Ayan1");
	      l1.add("Zara2");
	      l1.add("Mahnaz2");
	      l1.add("Ayan2");
	      l1.add("Zara3");
	      l1.add("Mahnaz3");
	      l1.add("Ayan3");
	      l1.add("Ayan3");
	    System.out.println();
	      System.out.println(" LinkedList Elements");
	      System.out.println("\t" + l1);
	      
	      int len = l1.size();
	 	if(len%2 != 0){
	 		 System.out.println("MiddleElement " + l1.get(len/2))  ;
	 	}
	 	else{
	 		System.out.println("MiddleElements:  " + l1.get((len+1)/2) + "\t" + l1.get(((len+1)/2)-1) )  ;
	 	}
	}
}

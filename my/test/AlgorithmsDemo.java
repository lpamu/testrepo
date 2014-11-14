package my.test;

import java.util.*;

public class AlgorithmsDemo {

   public static void main(String args[]) {
      // Create and initialize linked list
      LinkedList ll = new LinkedList();
      ll.add(new Integer(-8));
      ll.add(new Integer(20));
      ll.add(new Integer(-18));
      ll.add(new Integer(120));
      ll.add(new Integer(-81));
      ll.add(new Integer(201));
      ll.add(new Integer(-20));
      ll.add(new Integer(8));
      
      // Create a reverse order comparator
      Comparator r = Collections.reverseOrder();
      // Sort list by using the comparator
      Collections.sort(ll, r);
      // Get iterator
      Iterator li = ll.iterator();
      System.out.print("List sorted in reverse: ");
      while(li.hasNext()){
         System.out.print(li.next() + " ");
      }
      System.out.println();
      Collections.shuffle(ll);
      // display randomized list
      System.out.print("List shuffled: ");
     for(Iterator i = ll.iterator(); i.hasNext();)
         System.out.print(i.next() + " ");
     
     Collections.sort(ll);
     
     System.out.print("\nList sorted: ");
     for(Iterator i = ll.iterator(); i.hasNext();)
         System.out.print(i.next() + " ");
     
      System.out.println(" ");
      System.out.println("Minimum: " + Collections.min(ll));
      System.out.println("Maximum: " + Collections.max(ll));
   }
}
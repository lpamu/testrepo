package my.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import java.util.List;

public class MyCollectionUtil {
	public static void main(String [] args){

		retainAll();
		testSet();
		//*************************************
		Set<String>  set  = new HashSet<String>();
		 List<String> list = new ArrayList<String>();

		 MyCollectionUtil.doSomething(set);
		 MyCollectionUtil.doSomething(list); 
		 
		 //*************************************
	String     anElement  = "an element";
	Collection<String> collection = new HashSet<String>();

	boolean didCollectionChange = collection.add(anElement);
	boolean wasElementRemoved   = collection.remove(anElement);  
	 //*************************************
	Set<String>  aSet  = getSet(); // get Set  with elements from somewhere
	List<String> aList = getList(); // get List with elements from somewhere

	collection.addAll(aSet);    //returns boolean too, but ignored here.
	collection.addAll(aList);   //returns boolean too, but ignored here.
	System.out.println("Size of the collection: "+ collection.size() +  " " + collection); 
	
	collection.removeAll(aList);   //returns boolean too...
	collection.retainAll(aSet);    //returns boolean too...
	System.out.println("Size of the collection: "+ collection.size() +  " " + collection); 
	
	 //*************************************
	boolean containsElement = collection.contains("an element");

	Collection<String> elements     = new HashSet<String>();
	boolean containsAll     = collection.containsAll(elements);
	System.out.println("Contains All: " + containsAll);
	
}
	
	public static void retainAll(){       
		HashSet<String> hs = new HashSet<String>();        
		//add elements to HashSet       
		hs.add("first");        
		hs.add("second");         
		hs.add("third");         
		hs.add("apple");         
		hs.add("rat");         
		System.out.println("first set contains " + hs);         
		
		HashSet<String> subSet = new HashSet<String>();        
		subSet.add("rat");      
		subSet.add("second");        
		subSet.add("first");   
		System.out.println("sub set contains " + subSet);         
		
		hs.retainAll(subSet);                  
		System.out.println("Final set contains " +hs);     }
	

    public static HashSet<String> getSet(){         
    	HashSet<String> hs = new HashSet<String>();         
    	//add elements to HashSet         
    	hs.add("first");         
    	hs.add("second");         
    	hs.add("third"); 
    	return hs;
    	}
    
    public static ArrayList<String> getList(){         
    	ArrayList<String> hs = new ArrayList<String>();         
    	//add elements to HashSet         
    	hs.add("one");         
    	hs.add("two");         
    	hs.add("three"); 
    	return hs;
    	}
    
    public static void testSet(){         
    	HashSet<String> hs = new HashSet<String>();         
    	//add elements to HashSet         
    	hs.add("first");         
    	hs.add("second");         
    	hs.add("third");         

    	System.out.println(hs);         
    	System.out.println("\nIs HashSet empty? "+hs.isEmpty());         
    	hs.remove("third");         
    	System.out.println(hs);        
    	System.out.println("Size of the HashSet: "+hs.size());         
    	System.out.println("Does HashSet contains first element? "+hs.contains("first")); 
    }
	
	 public static void doSomething(Collection<String> collection) {
		    
		    Iterator<String> iterator = collection.iterator();
		    while(iterator.hasNext()){
		      Object object = iterator.next();

		      //do something to object here...
		    }
		  }
	 
	 public static void test(){
	 //List  listA = new ArrayList(); // Below line fixes this problem-Type mismatch: cannot convert from Object to String
	 List<String> listA = new ArrayList<String>();

	 listA.add("element 0");
	 listA.add("element 1");
	 listA.add("element 2");

	 //access via index
	 String element0 = listA.get(0);
	 String element1 = listA.get(1);
	 String element3 = listA.get(2);

	 //access via Iterator
	 Iterator<String> iterator = listA.iterator();
	 while(iterator.hasNext()){
	   String element = (String) iterator.next();
	 }

	 //access via new for-loop
	 for(Object object : listA) {
	     String element = (String) object;
	 }

	 }
}
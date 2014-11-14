package my.collections;

import java.util.*;


public class ForLoopExample {
	
	// static List <String> ls = {"Lavanya","Raghu","Pranav", "Shiva" };
	

	// Assume we have an instance of StringBuffer "sb"
	public static void oldFor(Collection c) {
		StringBuffer sb = new StringBuffer();
		for(Iterator i = c.iterator(); i.hasNext(); ) {
			String str = (String) i.next();
			sb.append(str);
		}
		System.out.println("O/P of OldFor " + sb);	
	}
						
	//With the addition of generics, the above segment of code can be rewritten using the enhanced for statement as follows: 
	// Assume we have an instance of StringBuffer "sb"
	public static  void newFor(Collection<String> c) {
		StringBuffer sb = new StringBuffer();
		for(String str : c) {
			sb.append(str);
		}
		System.out.println("O/P of NewFor " + sb);		
	}
						
	//The enhanced for statement can be used to iterate over an array. Consider the following segment of code for a method that calculates the sum of the elements in an array: 

	public static int sumArray1(int array[]) {
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		System.out.println("O/P of sumArray1 " + sum);	
		return sum;
	}
						
	//Using the enhanced for statement, this can be rewritten as: 

	public static int sumArray2(int array[]) {
		int sum = 0;
		for(int i : array) {
			sum += i;
		}
		System.out.println("O/P of sumArray2 " + sum);	
		return sum;
	}
						
	
	public static void main(String[] args){
		int[] ageInfo = {12, 30, 45, 55};
		
		//oldFor();
		//newFor();
		sumArray1(ageInfo);
		sumArray2(ageInfo);
		
	//The for(:) loop is designed for iteration over collections and arrays. 

	//Iterating over arrays: 

	// for(;;) loop
	int sumAge1 = 0;
	for (int i = 0; i < ageInfo.length; i++) {
		sumAge1 += ageInfo[i];
	}	
	System.out.println("O/P of sumAge1 " + sumAge1);	
	
	// for(:) loop
	int sumAge2 = 0;
	for (int element : ageInfo) {
		sumAge2 += element;
	}	
	System.out.println("O/P of sumAge2 " + sumAge2);	
						
	//NOTE, that an array element of a primitive value CANNOT be modified in the for(:) loop. 
	//Iterating over non-generic Collection: 
	// for(;;) loop
	Collection nameList = new ArrayList();
	nameList.add("Mikalai");
	nameList.add("Michael");
	nameList.add("Craig");
	System.out.println("\nO/P of nameList --- Begin");
	for (Iterator it = nameList.iterator(); it.hasNext(); ) {
		Object element = it.next();
		if (element instanceof String) {
			String name = (String) element;
			System.out.println(name);	
		}
	}
	System.out.println("O/P of nameList --- End");
			

	// for(:) loop
	Collection nameList1 = new ArrayList();
	nameList1.add("Mikalai");
	nameList1.add("Michael");
	nameList1.add("Craig");
	System.out.println("\nO/P of nameList1 --- Begin");
	for (Object element : nameList1) {
		if (element instanceof String) {
			String name = (String) element;
			System.out.println(name);	
		}
	}					
	System.out.println("O/P of nameList1 --- End");
	
	//Iterating over generic Collection: 
	// for(;;) loop
	Collection<String> nameList2 = new ArrayList<String>();
	nameList2.add("Mikalai");
	nameList2.add("Michael");
	nameList2.add("Craig");
	System.out.println("\nO/P of nameList2 --- Begin");
	for (Iterator<String> it = nameList2.iterator(); it.hasNext();) {
		String name = it.next();
		System.out.println(name);	
	}
	System.out.println("O/P of nameList2 --- End");
						
	// for(:) loop
	Collection<String> nameList3 = new ArrayList<String>();
	nameList3.add("Mikalai");
	nameList3.add("Michael");
	nameList3.add("Craig");
	System.out.println("\nO/P of nameList3 --- Begin");
	for (String name : nameList3) {
		System.out.println(name);	
	}
	System.out.println("O/P of nameList3 --- End");
	}
}
package my.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class NumberTest {

	public static void main(String args[]) {
		/*test(22, 9);
		test(9, 22);
		listtest();
		oddeven(13);*/
		//findPalindrome(3435);
		System.out.println("Factorial " + getFactorial(6)); 
	}

	public static int getFactorial(int num) {
		int fact = 1;
		while(num > 1){
			fact = fact * (num);
			num--;
		}
		return fact;
	}
	
	/*public static int getFactorialR(int num) {
		int fact = 1;
		while(num > 1){
			fact =  ((num) * (getFactorialR(num-1)));
		}
		return fact;
	}
	*/
	public static void findPrime(int i){
		if ( (i % 2) == 0){
			System.out.print("even number: " +  i);
		}
		else{
			System.out.print("odd number: " + i);
		}
	}
	
	public static void findPalindrome(int inNum){
		int  number = inNum;
		int reverse = 0;
        int remainder = 0;
        do{
             remainder = number%10;
            reverse = reverse*10 + remainder;
             number = number/10;
          
        }while(number >0);
        
        if(inNum == reverse)
        	System.out.print("Palindrome : " + inNum);
        else
        	System.out.print("Not a Palindrome : " + inNum);	
      
	}
	public static void printFibonacci() {

		int k = 1;
		int m = 1;
		int j = 1;
		System.out.print(k + "," + m + ",");
		// 1, 2, 3, 5, 8, 13, 21

		for (int i = 0; i < 10; i++) {
			j = k + m;

			System.out.print(j + ",");
			k = m;
			m = j;
		}
	}
	

	
	public static void test(int a, int d) {

		int i = 0;
		int x = 0;
		StringBuffer buff = new StringBuffer();
		do {
			x = a - i * d;
			if (x > 0) {
				buff.append(x);
				buff.append(" "); //missed this line in the test, so numbers are printing without a space in between
			}
			i++; 
		} while (x > 0);
		System.out.println(buff );
	}
	
	public static void listtest() {
	
	       // Converting Integer array to Collection, List in Java
       //Integer[] scores = new Integer[]{101, 201, 201, 301, 301, 301, 401};
       //Integer[] scores = new Integer[]{101, 201, 201, 301, 301, 301, 401, 401, 401, 401};
        Integer[] scores = new Integer[]{101, 101, 201, 301, 301, 301, 401};
        System.out.println("Contents of Integer array : {}" +  Arrays.toString(scores));
       
           ArrayList<Integer> al = new ArrayList<Integer>();
        int times = scores.length -1;
        for (int i = 0; i < times; i++){
        	if(scores[i].equals(scores[i+1])){
        		
        	}else{
        		al.add(scores[i]);
        	}
        		
        	}
        al.add(scores[times]);
        System.out.println("Distinct List: " + al);
        }
   
		/*
		 *   // Creating Collection from Integer array in Java
        Collection<Integer> iCollection = Arrays.asList(scores);
        System.out.println("Java Collection created from Integer array: {}" +  iCollection);
       
        // Creating Collection from Integer array in Java
        List<Integer> iCollection1 = Arrays.asList(scores);
        System.out.println("Java Collection created from Integer array: {}" +  iCollection1);
		 */
	
	
	public static void oddeven(int i){
		if ( (i % 2) == 0){
			System.out.print("even number: " +  i);
		}else
		System.out.print("odd number: " + i);
		
	}
	
	
}
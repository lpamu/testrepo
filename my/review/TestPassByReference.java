/*
 * Created on Sep 16, 2010
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package my.review;

/**
 * @author lpamu
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class TestPassByReference { //http://www.javacertificate.net/passbyvalue.htm
	public static void main(String[] args) {
		// declare and initialize variables and objects
		int i = 25;
		String s = "Java is fun!";
		StringBuffer sb = new StringBuffer("Hello, world");

		// print variable i and objects s and sb
		System.out.println("In Main i= " + i); 
		iMethod(i);
		System.out.println("In Main i= " + i); 
		System.out.println();
		System.out.println("In Main s= " +s); 
		sMethod(s);
		System.out.println("In Main s= " +s); 
		System.out.println("\nPassed by Reference, hence the data is changed");
		System.out.println("In Main sb= " +sb); 
		sbMethod(sb);
		System.out.println("In Main sb= " +sb); 
		
		
		TestPassByReference t = new TestPassByReference();
		Dog aDog = t.new Dog("Max"); // creating the "Max" dog
		System.out.println("Dog befor method foo: " + aDog);
		// at this point, aDog points to the "Max" dog
		t.foo(aDog);  //Object references are passed by value, so if the refernce is changed the object did not change
		// aDog still points to the "Max" dog
		System.out.println("Dog after method foo: " + aDog);

	}

	public static void iMethod(int iTest) {
		iTest = 9; // change it
		System.out.println("in iMethod = " + iTest); // print it (4)
		return;
	}

	public static void sMethod(String sTest) {
		sTest = sTest.substring(8, 11); // change it
		System.out.println("in iMethod = " + sTest); // print it (5)
		return;
	}

	public static void sbMethod(StringBuffer sbTest) {
		sbTest = sbTest.insert(7, "Java "); // change it
		System.out.println("in iMethod = " + sbTest); // print it (6)
		return;
	}
	
	
	class Dog {
	String name;
	
	public Dog(){
		name="Dog";
	}
	public Dog(String s){
		name=s;
	}
	public String toString(){
		return "Dog=" + name;
	}
	}
	
	public void foo(Dog d) { //Object references are passed by value 
	    d = new Dog("Fifi"); // creating the "Fifi" dog
	    System.out.println("Dog in method foo: " + d);
	}

}

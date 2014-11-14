/*
 * Created on Sep 13, 2010
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
public class Person {
	private String name;
	private int age;
	
	public Person(String s, int i){
		name = s;
		age = i;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	
	/*public Object equals(Object o){
		return o;
	}*/
	
	public String toString(){
		return "Name= " + name + "Age = " + age;
	}

	public static void main(String[] args) {
		Person p = new Person("John Jacob", 10);
		System.out.println("Person = " + p);
	}
}

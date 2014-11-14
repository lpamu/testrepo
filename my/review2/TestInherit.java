/*
 * Created on Sep 16, 2010
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package my.review2;

/**
 * @author lpamu
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class TestInherit {

	public static void main(String[] args) {
		Parent P1 = new Parent();
		P1.method();
		Parent.stmethod();
		
		System.out.println();
		Parent P2 = new Child();
		P2.method();
		
		System.out.println();
		Child ch = new Child();
		ch.method();
			
		System.out.println();
		Parent.stmethod();
		Child.stmethod();
	}
}

class Parent{
	Parent(){
		System.out.println("Parent");
	}
	
	void method(){
		System.out.println("Parent.Method");
	}
	
	static void stmethod(){
		System.out.println("Parent.StMethod");
	}
}

class Child extends Parent{
	Child(){
		System.out.println("Child");
	}
	
	void method(){
			System.out.println("Child.Method");
	}
	
	static void stmethod(){
		System.out.println("Child.StMethod");
	}
}

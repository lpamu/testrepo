package my.test;

public class DoubleFloatTest {
	public static void main(String args[]) { 
		doubleTest();
		floatTest();
		
		}
	
	public static void doubleTest() { 
		double pi, r, a; 
	r = 10.8; // radius of circle 
	pi = 3.1416; // pi, approximately 
	a = pi * r * r; // compute area 
	System.out.println("Area of circle is " + a);
	
	 double d = 10.123456789011129314151617181920;
     System.out.println("Value of double variable d is :" + d);
	}
	
	public static void floatTest() { 

/*float is 32 bit single precision type and used when fractional precision calculation is required.Declare float 
 * variable as below float <variable name> = <default value>; here assigning default value is optional.*/

                float f = 10.4454654345f;
             System.out.println("Value of float variable f is :" + f);
 f = 10.56f;


   // Use Float constructor to convert float primitive type to a Float object.
Float fObj = new Float(f);
    System.out.println(fObj);
     
             

	}
	

}

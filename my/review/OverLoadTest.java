package my.review;

public class OverLoadTest {

	String str;
	int i;
	double d;
	
	//Overloading Constructors
	OverLoadTest(){
		str = "";
		i = 0;
		d = 0.0;
	}
	
	OverLoadTest(String str1){
		str = str1;
		i = 0;
		d = 0.0;
	}
	
	OverLoadTest(String str1, int i1){
		str = str1;
		i = i1;
		d = 0.0;
	}
	

	OverLoadTest(String str1, int i1, double d1){
		str = str1;
		i = i1;
		d = d1;
	}
	
	public String toString(){
		String s = "Str= " + str + " int i= " +  i + " double d= " + d;
		System.out.println(s);
		return s;
	}
	
	public static void main(String [] args){
		OverLoadTest t1 = new OverLoadTest(); 
		t1.toString();
		
		OverLoadTest t2 = new OverLoadTest("OnlyString"); 
		t2.toString();
		
		OverLoadTest t3 = new OverLoadTest("String And Int", 100); 
		t3.toString();
		
		OverLoadTest t4 = new OverLoadTest("String, Int, double", 10000,  999999); 
		t4.toString();
		
	}
	
	// Overloaded Main Method
	public static void main(String[] args, int i) {
		OverLoadTest t1 = new OverLoadTest(); 
		t1.toString();	
	}
}

package my.review;

public class OperatorTest {
	public static void main(String [] args){
	int a = 6; // 110
	int b = 4; // 100

	// Bitwise AND    

	int c = a & b;
	//   110
	// & 100
	// -----
	//   100

	// Bitwise OR

	int d = a | b;
	//   110
	// | 100
	// -----
	//   110

	System.out.println(c); // 4
	System.out.println(d); // 6
	
	OperatorTest ot = new OperatorTest();
	
	TestClass t = ot.new TestClass();
	
	if((t != null) && (t.something == 2)){
		System.out.println("(t != null) && (t.something == 3) is true");
	}
	if((t != null) & (t.something == 3)){
		System.out.println("(t != null) & (t.something == 3) is true");
	}
	}
	
	class TestClass{
		int something;
		TestClass(){
			something = 3;
		}
	}
}

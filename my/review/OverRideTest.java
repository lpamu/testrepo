package my.review;

public class OverRideTest {
	public static void main(String args[]) {
		TestA.mytest();
		TestB.mytest();
		
		TestA A = new TestA();
		TestB B = new TestB();
		A.whoAmI();
		B.whoAmI();
	}

}

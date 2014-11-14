package my.review3;

import static my.review3.StaticTest.StaticClass;
import static my.review3.StaticTest.getStaticObbject;
import static my.review3.StaticTest.STATIC_OBJECT;

public class StaticTestClient {

	public static void main(String[] args) {

		System.out.println("Usage of a static class");
		StaticClass staticClassObject = new StaticClass();

		System.out.println("Usage of a static method");
		Object fromAStaticMethod = getStaticObbject();

		System.out.println("Usage of a static object");
		Object someStaticObject = STATIC_OBJECT;

	}
}

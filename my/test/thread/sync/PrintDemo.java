package my.test.thread.sync;

public class PrintDemo {

	public void printCount(String name) {
		try {
			for (int i = 10; i > 0; i--)
				System.out.println(name + " Counter -------- " + i);
		} catch (Exception e) {
			System.out.println("Thread  interrupted.");
		}
	}
}

package my.test.thread.sync;

public class PrintThreadDemoTest {
	public static void main(String args[]) {
		//printInSequence();
		printInParallel();
	}

	public static void printInParallel() {
		System.out.println("printInParallel start");
		PrintDemo PD = new PrintDemo();

		PrintThreadDemo T1 = new PrintThreadDemo("Thread - 1 ", PD);
		PrintThreadDemo T2 = new PrintThreadDemo("Thread - 2 ", PD);

		T1.start();
		T2.start();

		// wait for threads to end
		try {
			T1.join();
			T2.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
		System.out.println("printInParallel end");
	}

	public static void printInSequence() {
		System.out.println("printInSequence start");
		PrintDemo PD = new PrintDemo();

		PrintThreadDemo T1 = new PrintThreadDemo("Thread - 1 ", PD);
		PrintThreadDemo T2 = new PrintThreadDemo("Thread - 2 ", PD);

		// wait for threads to end
		try {
			T1.start();
			T1.join();
			T2.start();

			T2.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
		System.out.println("printInSequence end");
	}

}
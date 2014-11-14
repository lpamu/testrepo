package my.test.thread;

public class ThreadTest {
	
	int globalVar = 0;

	public static void main(String[] args) {

		ThreadTest test = new ThreadTest();
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t3 = new Thread();
		//test.testJoin(t1, t2, t3);
		//test.testWait(t1, t2, t3);
		test.testSleep(t1, t2, t3);
	
	}
	
	public void testJoin(Thread t1, Thread t2, Thread t3) {
		try {
			System.out.println("Program Start");
			t1.start();
			System.out.println("t1 sleeping");
			t1.sleep(1000);
			t1.join(); // waiting until t is done
			t2.start();
			System.out.println("t2 sleeping");
			t2.sleep(2000);
			t2.join();
			t3.start();
			System.out.println("t3 sleeping");
			t3.sleep(3000);
			t3.join();
			System.out.println("Program end");
		} catch (InterruptedException e) {
		}
	}

	public void testWait(Thread t1, Thread t2, Thread t3) {

		try {
			System.out.println("Program Start");
			t1.start();
			System.out.println("t1 sleeping");
			t1.sleep(1000);
			t1.join(); // waiting until t is done
			t2.start();
			System.out.println("t2 sleeping");
			t2.sleep(2000);
			t2.join();
			t3.start();
			System.out.println("t3 sleeping");
			t3.sleep(3000);
			t3.join();
			System.out.println("Program end");
		} catch (InterruptedException e) {
		}
	}

	public void testSleep(Thread t1, Thread t2, Thread t3) {

		try {
			System.out.println("Program Start");
			t1.start();
			System.out.println("t1 sleeping");
			t1.sleep(1000);
			//t1.join(); // waiting until t is done
			t2.start();
			System.out.println("t2 sleeping");
			t2.sleep(2000);
			//t2.join();
			t3.start();
			System.out.println("t3 sleeping");
			t3.sleep(3000);
			//t3.join();
			System.out.println("Program end");
		} catch (InterruptedException e) {
		}
	}

}

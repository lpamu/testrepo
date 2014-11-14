package my.test.thread;

//File Name : GuessANumber.java
//Create a thread to extentd Thread
public class GuessANumber extends Thread {
	private int number;

	public GuessANumber(int number) {
		this.number = number;
	}

	public void run() {
		compute();
	}

	public synchronized void compute() {
		int counter = 0;
		int guess = 0;
		do {
			guess = (int) (Math.random() * 100 + 1);
			System.out.println(this.getName() + " guesses " + guess);
			counter++;
		} while (guess != number);
		System.out.println("** Correct! " + this.getName() + " in " + counter
				+ " guesses.**" + System.currentTimeMillis());
		notify();
	}
}
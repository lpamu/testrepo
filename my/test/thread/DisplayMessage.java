package my.test.thread;

//File Name : DisplayMessage.java
//Create a thread to implement Runnable
public class DisplayMessage implements Runnable {
	private String message;

	public DisplayMessage(String message) {
		this.message = message;
	}

	/*
	 * public void run() { while(true) { System.out.println(message);
	 * 
	 * } }
	 */

	public void run() {
		printMessage();		
	}
	
	public synchronized void printMessage(){
		System.out.println("Still guessing");try {
			wait();
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted.");
		}
		System.out.println("Guessing complete");
	}
}
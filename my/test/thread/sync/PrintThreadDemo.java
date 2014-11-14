package my.test.thread.sync;

public class PrintThreadDemo extends Thread {
	Thread t;
	String threadName;
	PrintDemo  PD;
	
	public PrintThreadDemo(String name, PrintDemo p){
		threadName=name;
		PD=p;
	}
	
	public void run(){
		 System.out.println("Thread " +  threadName + " starting.");
		synchronized(PD){
			PD.printCount(threadName);
		}
	     System.out.println("Thread " +  threadName + " exiting.");
	   }

	  public void start ()
	   {
	      System.out.println("Starting " +  threadName );
	      if (t == null)
	      {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }

}

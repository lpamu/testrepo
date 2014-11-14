package my.network.test;

import java.io.IOException;

public class GreetingTest {
	 public static void main(String [] args)
	   {
	      int port = Integer.parseInt(args[0]);
	      try
	      {
	         Thread t = new GreetingServer(port);
	         t.start();
	      }catch(IOException e)
	      {
	         e.printStackTrace();
	      }
	   }
}

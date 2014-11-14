/*
 * Created on Sep 16, 2010
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package my.review2;

/**
 * @author lpamu
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class TestThreadSafety {

		public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		for (int i = 0; i < 50; i++)
			System.out.println("i = " + i + ", i * i = " + i * i);
	}
}


class MyThread extends Thread {
	public void run() {

		for (int count = 1, row = 1; row < 20; row++, count++) {
			for (int i = 0; i < count; i++)
				System.out.print('*');
			System.out.print('\n');
		}
	}
}

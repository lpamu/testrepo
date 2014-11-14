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
public class TestInstanceCount {

	public static void main(String[] args) {
		InstanceCount Ic1 = new InstanceCount();
		System.out.println("Instance # " + InstanceCount.count);
		InstanceCount Ic2 = new InstanceCount(100);
		System.out.println("Instance # " + InstanceCount.count);
	}
}

class InstanceCount {
	static int count;
	
	InstanceCount(){
		count++;
		System.out.println("Instance # " + count);
	}
	
	InstanceCount(int i) {
		count = i;
		System.out.println("Instance # " + count);
	}
}
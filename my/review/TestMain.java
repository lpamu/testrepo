/*
 * Created on Sep 13, 2010
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package my.review;

/**
 * @author lpamu
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class TestMain {

	public static void main(String[] args) {
		ClassC c = new ClassC();
		System.out.println("return " + callfunction());
	}
	
	public static int callfunction(){
		try{
			return 1;
		}catch (Exception ex){
			return 2;
		}finally{
			return 3;
		}
		//return 4;
	}
	
	
}

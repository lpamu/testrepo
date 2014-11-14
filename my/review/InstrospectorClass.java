/*
 * Created on Sep 15, 2010
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package my.review;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

/**
 * @author lpamu
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class InstrospectorClass {

	public static void main(String[] args) throws IntrospectionException {
		main1();
		main2();
	}
	public static void main1() throws IntrospectionException {
		System.out.println("In Main1\n");
		BeanInfo info = Introspector.getBeanInfo(SimpleBean.class);
		PropertyDescriptor pd;
		PropertyDescriptor[] arr = info.getPropertyDescriptors();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName());
		}
	}

	public static void main2() throws IntrospectionException {
		System.out.println("\n\nIn Main2\n");
		BeanInfo info =
			Introspector.getBeanInfo(SimpleBean.class, Object.class);
		PropertyDescriptor pd;
		PropertyDescriptor[] arr = info.getPropertyDescriptors();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName());
		}
	}
}

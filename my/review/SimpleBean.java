/*
 * Created on Sep 15, 2010
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
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;

public class SimpleBean
{
	private final String name = "SimpleBean";
	private int size;

	public String getName()
	{
		return this.name;
	}

	public int getSize()
	{
		return this.size;
	}

	public void setSize( int size )
	{
		this.size = size;
	}

	
}

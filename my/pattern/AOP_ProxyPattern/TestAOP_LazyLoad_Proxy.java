package my.pattern.AOP_ProxyPattern;

import java.util.List;
import java.util.ListIterator;

public class TestAOP_LazyLoad_Proxy {
	
	public static void main(String args[]){
		PersonInt p = new PersonImpl();
		/*List<CustomerInt> l = p.getCustomers();
		
		ListIterator<CustomerInt> It = l.listIterator();
	
		while(It.hasNext()){
			CustomerInt c = It.next();
		System.out.println("Customer List: " + c.getFirstName() + " " + c.getLastName() );
		}*/
		
		CustomerInt c = p.getCustomer();
		System.out.println("Customer List: " + c.getFirstName() + " " + c.getLastName() );
		
		
	}
}

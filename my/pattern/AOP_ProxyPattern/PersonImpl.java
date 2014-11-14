package my.pattern.AOP_ProxyPattern;

import java.util.ArrayList;
import java.util.List;

public class PersonImpl implements PersonInt {

	public List<CustomerInt> getCustomers() {
		List<CustomerInt> list = new ArrayList<CustomerInt>();
		CustomerInt c1 = new CustomerImpl("steve", "John");
		list.add(c1);
		CustomerInt c2 = new CustomerImpl("Marc", "lamp");
		list.add(c2);
		// TODO Auto-generated method stub
		return list;
	}
	
	public CustomerInt getCustomer() {
		CustomerInt c1 = new CustomerImpl("steve", "Larry");
		CustomerInt cp = new CustomerProxy(c1);
		return cp;
		
		/*CustomerInt cp2 = new LazyCustomer();
		return cp2;*/
	}
	
}

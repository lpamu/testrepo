package my.pattern.AOP_ProxyPattern;
public class LazyCustomer implements CustomerInt {
	private CustomerInt cl;
	
	public LazyCustomer(){
		
	}
	
	private CustomerInt getCustomer(){
		if (cl == null)
			cl = new CustomerImpl("test", "test");
		return cl;
	
	}
	
	public String getFirstName(){
		System.out.println("In getFirstName Begin");
		try{
			return getCustomer().getFirstName();
		}finally{
			System.out.println("In getFirstName End");
		}
	}
	public String getLastName(){
		return getCustomer().getLastName();
	}
}
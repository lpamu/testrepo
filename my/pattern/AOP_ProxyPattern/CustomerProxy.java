package my.pattern.AOP_ProxyPattern;
public class CustomerProxy implements CustomerInt {
	private CustomerInt cl;
	
	public CustomerProxy(CustomerInt c){
		cl = c;
	}
	
	public String getFirstName(){
		System.out.println("In getFirstName Begin");
		try{
			return cl.getFirstName();
		}finally{
			System.out.println("In getFirstName End");
		}
	}
	public String getLastName(){
		return cl.getLastName();
	}
}


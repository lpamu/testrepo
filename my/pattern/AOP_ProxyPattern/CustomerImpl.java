package my.pattern.AOP_ProxyPattern;

//AOP Example 
//Lazy Loading / Proxy Implementation Example

public class CustomerImpl implements CustomerInt {
	private String firstName;
	private String lastName;
	
	public CustomerImpl(String f, String l){
		firstName=f;
		lastName=l;
	}
	
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
}

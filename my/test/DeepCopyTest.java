package my.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepCopyTest{
	
	public static void main(String[] args) {
		   try {
			   shallowCopyTest();
			   deepCopyTest();
		   }
		   catch(Exception e) {
               e.printStackTrace();
           }
	}

	/* Clone can be archived by object.clone() method. It gives the Shallow copy of the object. In this process a new object is created That have all the value and instance variable.
	 * And if main object has any references to other object then the references are copied in the shallow copy.

	Deep Copy of any object can be achieved by write the object into byte stream and again deserialize it. It gives the Deep Copy of the object. Deep copy is a totally duplicate copy of an object. 
	And if main object has any references to other object then the complete new copies of those objects will be available  in the Deep Copy.
*/
	public static void deepCopyTest() throws CloneNotSupportedException {
        try {
            A a = new A("Albar", new Integer(50));
            A deepCopy = null;
            ByteArrayOutputStream bos = new ByteArrayOutputStream();

            ObjectOutputStream out = new ObjectOutputStream(bos);

            out.writeObject(a);
            out.flush();
            out.close();

            ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
            Object obj = in.readObject();
            deepCopy = (A)obj;
            deepCopy.setIdNumber("33333"); //changing deep copy obj, does NOT change the original copy
            System.out.println("deepCopyTest : deepCopyObj : " + deepCopy.getPersonName() + " Id : " + deepCopy.getIdNumber());
            System.out.println("deepCopyTest : originalCopyObj : " + a.getPersonName() + " Id : " + a.getIdNumber());
            }
            catch(IOException e) {
                e.printStackTrace();
            }
            catch(ClassNotFoundException cnfe) {
                cnfe.printStackTrace();
            }
            } 
    
    public static void shallowCopyTest() throws CloneNotSupportedException {
        B b = new B("Albar", new Integer(50));
        B shallowCopy = (B)b.clone();
        shallowCopy.setIdNumber("44444");  //changing shallow copy obj, changes the original copy also 
        System.out.println("shallowCopyTest : shallowCopyObj : " + shallowCopy.getPersonName() + " Id : " + shallowCopy.getIdNumber());
        System.out.println("shallowCopyTest : originalCopyObj : " + b.getPersonName() + " Id : " + b.getIdNumber());
    }

} 

class A implements Serializable{
    
   private static final long serialVersionUID = 1L;
   C c;
   
	A(String personName, Integer age){
        this.personName=personName;
        this.age=age;
        c = new C("11111"); 
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    private String personName = null;
    private transient Integer age = null;
    
    public Integer getAge() {
        return age;
    }
    public String getPersonName() {
        return personName;
    }
    public String getIdNumber() {
        return c.getIdNumber();
    }
    public void setIdNumber(String Id) {
	       c.setIdNumber(Id);
	    }
}

class B implements Cloneable{
    
	   private static final long serialVersionUID = 1L;
	   C c;
	   
		B(String personName, Integer age){
	        this.personName=personName;
	        this.age=age;
	        c = new C("22222"); 
	    }
	    protected Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }
	    private String personName = null;
	    private transient Integer age = null;
	    
	    public Integer getAge() {
	        return age;
	    }
	    public String getPersonName() {
	        return personName;
	    }
	    public String getIdNumber() {
	        return c.getIdNumber();
	    }
	    public void setIdNumber(String Id) {
	       c.setIdNumber(Id);
	    }
	}

class C implements Serializable{
	String IdNumber = "00000";
	
	C(String id){
		IdNumber= id;
	}
	
	public String getIdNumber() {
        return IdNumber;
    }
	public void setIdNumber(String Id) {
        IdNumber = Id; 
    }
}

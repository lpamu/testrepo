package my.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * Java program to test Object sorting in Java. This Java program
 * test Comparable and Comparator implementation provided by Employee
 * class by sorting list of Employee object in ascending and descending order.
 * Both in natural order using Comparable and custom Employee using Comparator in Java
 *
 * @author http://java67.blogspot.com
 */
public class ComparatorExample {

    public static void main(String args[]) {
      
        //Creating Employee object to demonstrate Sorting of Object in Java
        Employee ord1 = new Employee(101, "Sony", "2000");
        Employee ord2 = new Employee(102, "Hitachi", "4000,");
        Employee ord3 = new Employee(103,"Philips", "6000");
      
        //putting Objects into Collection to sort
        List<Employee> orders = new ArrayList<Employee>();
        orders.add(ord3);
        orders.add(ord1);
        orders.add(ord2);
      
        //printing unsorted collection
        System.out.println("Unsorted Collection : " + orders);
      
        //Sorting Employee Object on natural order - ascending
        Collections.sort(orders);
      
        //printing sorted collection
        System.out.println("List of Employee object sorted by EmployeeId : " + orders);
      
        // Sorting object in descending order in Java
        //Collections.sort(orders, Collections.reverseEmployee());
        //System.out.println("List of object sorted in descending order : " + orders);
              
        //Sorting object using Comparator in Java
        Collections.sort(orders, new Employee.EmployeeByAge());
        System.out.println("List of Employee object sorted using Comparator - By Age : " + orders);
      
        // Comparator sorting Example - Sorting based on customer
        Collections.sort(orders, new Employee.EmployeeByName());
        System.out.println("Collection of Employees sorted using Comparator - by Name : " + orders);
    }
}

/*
 * Employee class is a domain object which implements
 * Comparable interface to provide sorting on natural order.
 * Employee also provides coule of custom Comparators to
 * sort object based uopn amount and customer
 */
class Employee implements Comparable<Employee> {

    public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	private int age;
    private String name;
    private String employeeId;

    /*
     * Comparator implementation to Sort Employee object based on Amount
     */
    public static class EmployeeByAge implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.age > o2.age ? 1 : (o1.age < o2.age ? -1 : 0);
        }
    }

    /*
     * Another implementation or Comparator interface to sort list of Employee object
     * based upon customer name.
     */
    public static class EmployeeByName implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.name.compareTo(o2.name);
        }
    }

    public Employee(int yrs, String nm, String eid) {
        this.age = yrs;
        this.name = nm;
        this.employeeId = eid;
    }


    /*
     * Sorting on employeeId is natural sorting for Employee.
     */
    @Override
    public int compareTo(Employee o) {
        return this.employeeId == o.employeeId ? 0 : 1 ;
    }
  
    /*
     * implementing toString method to print Employee
     */
    @Override
    public String toString(){
        return String.valueOf(name+" "+ age + " " + employeeId);
    }
}

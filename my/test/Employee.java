package my.test;

public class Employee implements Comparable<Employee> {

	 private int empId;
	 private String empName;

	Employee(int empId, String empName) {
	 this.empId = empId;
	 this.empName = empName;
	 }

	 @Override
	 public int compareTo(Employee emp) {
	  return (this.empId < emp.empId) ? -1 : (this.empId > emp.empId) ? 1 : 0;
	 }

	 public int getEmpId() {
	  return empId;
	 }

	public void setEmpId(int empId) {
	  this.empId = empId;
	 }

	 public String getEmpName() {
	  return empName;
	}

	 public void setEmpName(String empName) {
	  this.empName = empName;
	 }

	}
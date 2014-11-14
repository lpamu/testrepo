package my.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ComparableDemo{
 public static void main(String args[]) {

  Employee employee1 = new Employee(2, "Zinger");
  Employee employee2 = new Employee(4, "Jolly");
  Employee employee3 = new Employee(1, "Sanorita");
  Employee employee4 = new Employee(3, "Andrew");

  ArrayList<Employee> empList = new ArrayList<Employee>();
  empList.add(employee1);
  empList.add(employee2);
  empList.add(employee3);
  empList.add(employee4);

  System.out.println("EmpList elemnets befor sorting by id :");
  for (int i = 0; i < empList.size(); i++) {
   System.out.println("EmpId: " + empList.get(i).getEmpId()
     + " | EmpName: " + empList.get(i).getEmpName());
  }

  Collections.sort(empList);

  System.out.println("EmpList elemnets after sorting by id :");
  for (int i = 0; i < empList.size(); i++) {
   System.out.println("EmpId: " + empList.get(i).getEmpId()
     + " | EmpName: " + empList.get(i).getEmpName());
  }

 }

}

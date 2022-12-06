package collectionsFramework.listImplementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeImpl {
    public static void main(String[] args) {
        Employee employee1 = new Employee(3,"abc",5000);
        Employee employee2 = new Employee(1,"hij",2000);
        Employee employee3 = new Employee(5,"pqr",7000);
        Employee employee4 = new Employee(4,"klm",4000);
        Employee employee5 = new Employee(2,"def",1000);


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

      //  Comparator<Employee> comparator = (e1,e2)-> e2.id - e1.id; Descending Order
       // Comparator<Employee> comparator = (e1,e2)-> e1.id - e2.id; Ascending Order
       // Comparator<Employee> comparator = (e1,e2)-> e1.salary - e2.salary;
       // Collections.sort(employeeList,(p1,p2)-> p1.id- p2.id);
        //Collections.sort(employeeList,comparator);
      //  Collections.sort(employeeList, Comparator.comparingInt(p -> p.id));
        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.salary - o2.salary;
            }

        };
        Collections.sort(employeeList,comparator);

        System.out.println("employeeList :"+employeeList);


    }
}

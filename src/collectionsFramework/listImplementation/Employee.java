package collectionsFramework.listImplementation;

public class Employee //implements Comparable<Employee>
         {
    int id;
    String name;
    int salary;

    public Employee(){
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

   /* @Override
    public int compareTo(Employee emp) {
        return this.salary - emp.salary;
    }*/

    }
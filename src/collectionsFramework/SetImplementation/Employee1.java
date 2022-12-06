package collectionsFramework.SetImplementation;

public class Employee1 {

    int id;
    String name;
    int salary;

    public Employee1(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee1(){
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

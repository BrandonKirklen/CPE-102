package Employee;

/**
 * Created by Brandon Kirklen on 5/13/2015.
 * Top level type
 */
public class Employee {
    private String name;
    private float salary;

    public Employee(String name, float salary){
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return "Employee[name=" + name + ",salary=" + salary + "]";
    }
}

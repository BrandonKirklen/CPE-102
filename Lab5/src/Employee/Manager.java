package Employee;

/**
 * Created by Brandon Kirklen on 5/13/2015.
 * subclass of manager
 */
public class Manager extends Employee {
    private String department;

    public Manager(String name, float salary, String department){
        super(name, salary);
        this.department = department;
    }

    @Override
    public String toString(){
        return "Manager[" + "super=" + super.toString() + ",department=" + department + "]";
    }
}

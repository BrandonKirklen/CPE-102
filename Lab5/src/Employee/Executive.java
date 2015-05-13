package Employee;

/**
 * Created by Brandon Kirklen on 5/13/2015.
 * Subclass of employee
 */
public class Executive extends Manager {

    public Executive(String name, float salary, String department){
        super(name, salary, department);
    }

    @Override
    public String toString(){
        return "Executive[" + "super=" + super.toString()+ "]";
    }
}

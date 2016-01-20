package People;

/**
 * Created by Brandon Kirklen on 5/13/2015.
 * Subclass of Person
 */
public class Instructor extends Person {
    private float salary;
    public Instructor(String name, int birthYear, float salary){
        super(name, birthYear);
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Instructor[" + "super=" + super.toString() + ",salary=" + salary + "]";
    }
}

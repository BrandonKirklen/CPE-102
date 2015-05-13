package People;


/**
 * Created by Brandon Kirklen on 5/13/2015.
 * Sub class of people
 */
public class Student extends Person{
    private String major;

    public Student(String name, int birthYear, String major){
        super(name, birthYear);
        this.major = major;
    }

    @Override
    public String toString(){
        return "Student[" + "super=" + super.toString() + ",major=" + major + "]";
    }
}

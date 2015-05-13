package People;

/**
 * Created by Brandon Kirklen on 5/13/2015.
 * Main person class
 */
public class Person {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    public String toString(){
        return "Person[name=" + name + ",birthYear=" + birthYear + "]";
    }
}

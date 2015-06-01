package Person;

/**
 * Created by Brandon Kirklen on 5/27/2015.
 */
public class Person implements Comparable<Person> {
    private String name;
    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Person secondPerson) {
        int compare = name.compareTo(secondPerson.getName());
        return compare;
    }

    @Override
    public String toString(){
        return "Person[name=" + name + "]";
    }
}

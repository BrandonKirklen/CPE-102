package Person;

/**
 * Created by Brandon Kirklen on 5/27/2015.
 * This class tests the Person class.
 */

import java.util.*;

public class PersonDemo
{
    public static void main(String[] args)
    {
        int count = 0;
        Scanner in = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();
        boolean more = true;
        Person first = null;
        Person last = null;
        while (more)
        {
            System.out.println("Please enter the person's name or a blank line to quit");
            String name = in.nextLine();

            if (name.equals(""))
                more = false;
            else
            {
                Person p = new Person(name);
                people.add(p);
            }
        }
        Collections.sort(people);
        System.out.println("First: " + people.get(0));
        System.out.println("Last: " + people.get(people.size()-1));
    }
}
package Downsize;
/**
 * Created by Brandon Kirklen on 5/30/2015.
 * A test class for the downsize method.
 */
import java.util.LinkedList;

public class DownsizeTester
{
    public static void main(String[] args)
    {
        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("Dick");
        staff.addLast("Harry");
        staff.addLast("Romeo");
        staff.addLast("Tom");
        staff.addLast("Jim");

        //Business.downsize(staff);
        Business.remove(staff);

        System.out.println(staff);
        System.out.println("Expected: [Dick, Romeo]");
    }
}

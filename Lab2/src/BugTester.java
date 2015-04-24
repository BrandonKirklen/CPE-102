/**
 * Created by Brandon Kirklen on 4/9/2015.
 */
public class BugTester {
    public static void main(String[] args)
    {
        Bug lady = new Bug(10);
        lady.move();
        System.out.println(lady.getPosition());
        lady.move();
        System.out.println(lady.getPosition());
        lady.turn();
        System.out.println(lady.getPosition());
        lady.move();
        System.out.println(lady.getPosition());
        // make the bug move and turn a few times

        // print the actual and expected position
        System.out.println(lady.getPosition());
        System.out.println("Expected: 11");
    }
}

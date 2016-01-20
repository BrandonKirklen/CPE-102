package HollePrinter;

/**
 * Created by Brandon on 4/6/2015.
 */
public class HollePrinter {
    public static void  main(String[] args)
    {
        String original = "Hello, World!";
        System.out.println(original);
        original = original.replace("e","x");
        original = original.replace("o","e");
        original = original.replace("x","o");
        System.out.println(original);
    }
}

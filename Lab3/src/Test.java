/**
 * Created by Brandon Kirklen on 4/20/2015.
 */
import java.util.Scanner;
public class Test
    {
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int m = in.nextInt();
            System.out.print("Enter another integer: ");
            int n = in.nextInt();
            System.out.println(m + " " + n);
        }
    }
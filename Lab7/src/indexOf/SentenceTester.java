package indexOf;

/**
 * Created by Brandon Kirklen on 5/15/2015.
 * A tester class for Sentence.
 */

public class SentenceTester
{
    public static void main(String[] args)
    {
        Sentence s = new Sentence("Mississippi!");

        int n = s.find("sip");
        System.out.println(n);
        System.out.println("Expected: 6");

        n = s.find("tip");
        System.out.println(n);
        System.out.println("Expected: -1");
    }
}

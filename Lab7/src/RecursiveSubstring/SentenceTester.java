package RecursiveSubstring;

/**
 * Created by Brandon Kirklen on 5/15/2015.
 * A tester class for Sentence.
 */

public class SentenceTester
{
    public static void main(String[] args)
    {
        Sentence s = new Sentence("Mississippi!");
        boolean b = s.find("sip");
        System.out.println(b);
        System.out.println("Expected: true");
        b = s.find("tip");
        System.out.println(b);
        System.out.println("Expected: false");
    }
}

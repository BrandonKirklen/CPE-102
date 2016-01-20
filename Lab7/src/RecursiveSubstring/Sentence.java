package RecursiveSubstring;

/**
 * Created by Brandon Kirklen on 5/15/2015.
 * Recursive string finder
 */
public class Sentence {
    String original;
    String temp;
    String test;
    public Sentence(String original){
        this.original = original;
        this.temp = original;
    }

    public boolean find(String t) {
        boolean found;
        if ( t.length() < temp.length()) {
            test = temp.substring(0, t.length());
            if ( test.equals(t) ) {
                found = true;
                temp = original;
            }
            else {
                temp = temp.substring(1);
                found = find(t);
            }
        }
        else {
            found = false;
            temp = original;
        }

        return found;
    }
}

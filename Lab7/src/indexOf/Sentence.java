package indexOf;

/**
 * Created by Brandon Kirklen on 5/15/2015.
 * Returns index of where the given string matches
 */
public class Sentence {
    String original;
    String temp;
    String test;
    int index;

    public Sentence(String original){
        this.original = original;
        this.temp = original;
    }

    private void indexCount(){
        index++;
    }
    public int find(String t) {
        //boolean found;
        if ( t.length() < temp.length()) {
            test = temp.substring(0, t.length());
            if ( test.equals(t) ) {
                temp = original;
            }
            else {
                temp = temp.substring(1);
                indexCount();
                find(t);
            }
        }
        else {
            temp = original;
            index = -1;
        }

        return index;
    }
}

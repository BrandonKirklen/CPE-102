package RealWorldData;

/**
 * Created by Brandon Kirklen on 5/11/2015.
 */
public class RealDataSequence implements Sequence {
    private int[] prettyNumbers = { 190348, 1029380, 109283, 1095, 23850, 94235 };
    private static int count = 0;

    public boolean hasNext(){
        return (count < prettyNumbers.length );
    }

    public int next(){
        int returnCount = count;
        count++;
        return prettyNumbers[returnCount];
    }
}

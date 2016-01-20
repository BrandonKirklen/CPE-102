package LastDigitDistribution;

/**
 * Created by Brandon Kirklen on 5/11/2015.
 */
public class SquareSequence implements Sequence
{
    private int n;

    public int next()
    {
        n++;
        return n * n;
    }
}

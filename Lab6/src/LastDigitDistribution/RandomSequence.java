package LastDigitDistribution;

/**
 * Created by Brandon Kirklen on 5/11/2015.
 */
public class RandomSequence implements Sequence
{
    public int next()
    {
        return (int) (Integer.MAX_VALUE * Math.random());
    }
}
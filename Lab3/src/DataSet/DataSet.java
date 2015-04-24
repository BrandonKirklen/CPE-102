package DataSet;

/**
 * Created by Brandon Kirklen on 4/14/2015.
 */
public class DataSet
{
    int maxValue = Integer.MIN_VALUE;
    int minValue = Integer.MAX_VALUE;
    public void addValue(int x)
    {
        maxValue = Math.max(maxValue, x);
        minValue = Math.min(minValue, x);
    }

    public int getLargest()
    {
        return maxValue;
    }

    public int getSmallest(){
        return minValue;
    }
}

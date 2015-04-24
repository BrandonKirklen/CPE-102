package DataSet;

/**
 * Created by Brandon Kirklen on 4/14/2015.
 */
public class DataSetTester {
    public static void main(String[] args)
    {
        DataSet test = new DataSet();
        test.addValue(5);
        test.addValue(3);
        test.addValue(7);
        test.addValue(2);
        System.out.println("Actual:   " + "Max=" + test.getLargest() + ", " + "Min=" + test.getSmallest());
        System.out.println("Expected: Max=7, Min=2");
    }
}

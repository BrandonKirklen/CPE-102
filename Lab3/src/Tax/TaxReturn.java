package Tax;

/**
 * Created by Brandon Kirklen on 4/19/2015.
 */
public class TaxReturn
{
    public static int SINGLE = 5;
    public static int MARRIED = 10;
    double tax=0;

    public TaxReturn(double income, int status)
    {
        tax = income * status/100;
    }

    public double getTax()
    {
        return tax;
    }
}

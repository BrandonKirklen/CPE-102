package StampMachine;

/**
 * Created by Brandon Kirklen on 4/12/2015.
 */

public class StampMachine
{
    final int FIRST_CLASS_STAMP = 44;
    int billValue;

    public StampMachine()
    {
        billValue=0;
    }
    public void insert(int b)
    {
        billValue = b*100;
    }
    public int giveFirstClassStamps()
    {
        int firstClassStamps =  billValue / FIRST_CLASS_STAMP;
        billValue = billValue % FIRST_CLASS_STAMP;
        return firstClassStamps;
    }

    public int givePennyStamps()
    {
        int pennyStamps = billValue;
        return pennyStamps;
    }
}

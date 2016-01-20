package Year;

/**
 * Created by Brandon Kirklen on 4/19/2015.
 */
public class Year {
    private int currentYear;

    public Year(int inputYear )
    {
        currentYear = inputYear;
    }

    public boolean isLeapYear()
    {
        if ( currentYear % 400 == 0 )
        {
            return true;
        }
        else if ( ( currentYear % 4 == 0 ) && (( currentYear % 100 != 0 ) || currentYear <= 1582 ))
        {
            return true;
        }
        else return false;
    }
}

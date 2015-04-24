package TimeInterval;


/**
 * Created by Brandon Kirklen on 4/18/2015.
 */
public class TimeInterval
{
    private int startHour, endHour;
    private int startMinute, endMinute;

    public TimeInterval(int startTime, int endTime)
    {
        startHour = startTime / 100;
        endHour = (endTime / 100) + ((startTime > endTime) ? 24 : 0 );
        startMinute = startTime % 100;
        endMinute = endTime % 100;
    }

    public int hours()
    {
        //This line subtracts one if there is rollover in the minutes due to base 60 numbers.
        return (endHour - startHour) - ((startMinute > endMinute) ? 1 : 0);
    }

    public int minutes()
    {
        int result = endMinute - startMinute;
        if (result < 0) result += 60;
        return result;
    }
}


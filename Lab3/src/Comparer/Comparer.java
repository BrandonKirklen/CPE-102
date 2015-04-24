package Comparer;

/**
 * Created by Brandon Kirklen on 4/19/2015.
 * This class is used to test whether two floating-point numbers are the same.
 */
public class Comparer
{
    int sigFigs;

    /**
     Creates a Comparer object to determine if two floating-point numbers
     are approximately the same.
     @param d the number of significant digits in the comparison
     */
    public Comparer(int d)
    {
        sigFigs = d;
    }

    /**
     Tests whether two numbers are close to each other.
     @param x1 the first number
     @param x2 the second number
     @return true if the two numbers differ by less than the number of
     significant digits
     */
    public boolean areClose(double x1, double x2)
    {
        return (Math.abs((x1-x2)) < Math.pow(10, -sigFigs));
    }

    /**
     Tests whether two numbers round to the same value.
     @param x1 the first number
     @param x2 the second number
     @return true if the two numbers, when rounded to the number of
     significant digits, yield the same value
     */
    public boolean roundToSame(double x1, double x2)
    {
        x1 = Math.pow(10, sigFigs) * x1;
        x2 = Math.pow(10, sigFigs) * x2;

        return ( Math.round(x1) == Math.round(x2) );
    }
}

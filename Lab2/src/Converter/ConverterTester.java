package Converter;

/**
 * Created by Brandon Kirklen on 4/13/2015.
 */
public class ConverterTester
{
    public static void main(String[] args)
    {
        final double MILE_TO_KM = 1.609;

        Converter milesToMeters = new Converter(1000 * MILE_TO_KM);

        System.out.println("100 miles in m: " + milesToMeters.convertTo(100));
        System.out.println("Expected: 160900");
        System.out.println("100 m in miles: " + milesToMeters.convertFrom(100));
        System.out.println("Expected: 0.06215");
    }
}
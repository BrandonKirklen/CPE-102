package Converter;

/**
 * Created by Brandon Kirklen on 4/13/2015.
 */
import java.util.Scanner;

public class ConverterRunner
{
    public static void main(String[] args)
    {
        final double MILE_TO_KM = 1.609344;
        final double MILE_TO_FEET = 5280;
        final double FEET_TO_INCHES = 12;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a distance in meters: ");
        double meters = in.nextDouble();

        Converter milesToMeters = new Converter(1000 * MILE_TO_KM);
        Converter milesToFeet = new Converter(MILE_TO_FEET);
        Converter feetToInches = new Converter(FEET_TO_INCHES);

        System.out.println("miles: " + milesToMeters.convertFrom(meters));
        System.out.println("feet: " + milesToFeet.convertTo(milesToMeters.convertFrom(meters)));
        System.out.println("inches: " + feetToInches.convertTo(milesToFeet.convertTo(milesToMeters.convertFrom(meters))));
    }
}
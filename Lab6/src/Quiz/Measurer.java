package Quiz;

/**
 * Created by Brandon Kirklen on 5/11/2015.
 */
public interface Measurer {
    /**
     Computes the measure of an object.
     @param anObject the object to be measured
     @return the measure
     */
    public static double average(Measurable[] objects)
    {
        double sum = 0;
        for (Measurable obj : objects)
        {
            sum = sum + obj.getMeasure();
        }
        if (objects.length > 0) { return sum / objects.length; }
        else { return 0; }
    }


    double measure(Object anObject);
}

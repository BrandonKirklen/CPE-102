package LastDigitDistribution;

/**
 * Created by Brandon Kirklen on 5/11/2015.
 */
public class LastDigitDistribution
{
    private int[] counters;

    /**
     Constructs a distribution whose counters are set to zero.
     */
    public LastDigitDistribution()
    {
        counters = new int[10];
    }

    /**
     Processes values from this sequence.
     @param seq the sequence from which to obtain the values
     @param valuesToProcess the number of values to process
     */
    public void process(Sequence seq, int valuesToProcess)
    {
        for (int i = 1; i <= valuesToProcess; i++)
        {
            int value = seq.next();
            int lastDigit = value % 10;
            counters[lastDigit]++;
        }
    }

    /**
     Displays the counter values of this distribution.
     */
    public void display()
    {
        double scale = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        int maxLine = 40;
        // calculate scale factor
        for ( int i = 0; i < counters.length; i++ ){
            if (counters[i] > max) max = counters[i];
        }
        scale = (double) maxLine/max;
        //System.out.println(scale);
        for (int i = 0; i < counters.length; i++) {
            System.out.print(i + ": " + counters[i] + " ");
            for (int j = 0; j < counters[i]*scale ; j++){
                System.out.print('*');
            }
            System.out.println("");
        }
    }
}

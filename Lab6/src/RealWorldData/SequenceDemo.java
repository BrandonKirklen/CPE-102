package RealWorldData;

/**
 * Created by Brandon Kirklen on 5/11/2015.
 */
public class SequenceDemo
{
    public static void main(String[] args)
    {
        LastDigitDistribution dist1 = new LastDigitDistribution();
        dist1.process(new RealDataSequence());
        dist1.display();
        System.out.println();
    }
}

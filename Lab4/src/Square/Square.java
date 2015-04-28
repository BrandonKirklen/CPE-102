package Square;

import java.util.ArrayList;

/**
 * Created by Brandon Kirklen on 4/27/2015.
 * Magic Square Checker
 */
public class Square {
    ArrayList<Integer> magicNumbers = new ArrayList<>();
    public void add(int i)
    {
        magicNumbers.add(i);
    }
    private boolean checkFrequency()
    {
        boolean noRepeats = true;
        int[] freq = new int[magicNumbers.size()];
        for (int i = 0; i < magicNumbers.size(); i++)
        {
            freq[magicNumbers.get(i)] += 1;
        }

        for (int i = 0; i < freq.length; i++)
        {
            if(freq[i] != 1)
            {
                noRepeats = false;
            }
        }
        return noRepeats;
    }
    private boolean checkSum()
    {
        boolean goodSum = true;
        int size = (int)Math.sqrt( (double)magicNumbers.size());
        for (int i = 0; i < size; i++)
        {
            for (int j = i*size; j < (i+1)*size; j++)
            {
                int sum=0;
                sum += magicNumbers.get(j);
            }
        }
        return false;
    }
    public boolean isMagic()
    {
        if (checkFrequency())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

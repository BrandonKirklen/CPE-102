package Square;

/**
 * Created by Brandon Kirklen on 4/27/2015.
 * This class tests whether a sequence of inputs forms a magic square.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class MagicSquareChecker
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Square sq = new Square();

        System.out.println("Enter a sequence of integers, followed by Q: ");
        while (in.hasNextInt())
        {
            sq.add(in.nextInt());
        }

        if(sq.isMagic())
            System.out.println("It is a magic square.");
        else
            System.out.println("It is not a magic square.");
    }
}

package Coin;

/**
 * Created by Brandon Kirklen on 5/11/2015.
 * Reads in a list of coins from a file.
 */
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class CoinReader
{
    public static void main(String[] args)
    {
        boolean done = false;
        Scanner in = new Scanner(System.in);

        ArrayList<Coin> list = null;

        while (!done)
        {
            System.out.print("Filename: ");
            String filename = in.next();

            try
            {
                list = Coin.readFile(filename);
                done = true;
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

        double total = 0;
        for(Coin c : list)
            total = total + c.getValue();

        System.out.println("Total=" + total);
    }
}

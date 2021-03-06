package Coin;

/**
 * Created by Brandon Kirklen on 5/11/2015
 *  This program tests the use of the Comparable interface in the coin class.
 */

public class CoinTester
{
    public static void main(String[] args)
    {
        Coin c1 = new Coin(0.05, "nickel");
        Coin c2 = new Coin(0.01, "penny");

        int b = c1.compareTo(c2);
        System.out.println(b);

        if (b < 0)
            System.out.println("less");
        else if (b > 0)
            System.out.println("more");
        else
            System.out.println("equal");
        System.out.println("Expected: more");
    }
}

package Purse2;

/**
 * Created by Brandon Kirklen on 4/20/2015.
 */
import java.util.ArrayList;

/**
 A purse holds a collection of coins.
 */
public class Purse
{
    private ArrayList<String> coins;

    /**
     Constructs an empty purse.
     */
    public Purse()
    {
        coins = new ArrayList<String>();
    }

    /**
     Add a coin to the purse.
     @param coinName the coin to add
     */
    public void addCoin(String coinName)
    {
        coins.add(coinName);
    }

    /**
     Returns a string describing the object.
     @return a string in the format "Purse[coinName1,coinName2,...]"
     */
    public String toString()
    {
        String purse = "Purse[";
        boolean firstElement = true;
        for (String name : coins)
        {
            if(firstElement)
            {
                purse += name;
                firstElement = false;
            }
            else
            {
                purse += "," + name;
            }
        }
        purse += "]";
        return purse;
    }

    /**
     Determines if a purse has the same coins in the same or different
     order as another purse.
     @param other the other purse
     @return true if the two purses have the same coins in the
     same or different order, false otherwise
     */
    public boolean sameCoins(Purse other)
    {
        ArrayList<String> tempOutsideCoins = new ArrayList<String>(other.coins);

        for (String coinInInside : this.coins)
        {
           tempOutsideCoins.remove(coinInInside);
        }
        if ( tempOutsideCoins.isEmpty() )
        {
            return true;
        }
        else return false;
    }
}
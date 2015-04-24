package Purse1;

/**
 * Created by Brandon Kirklen on 4/20/2015.
 */
import java.util.ArrayList;
import java.util.stream.Collectors;

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
     Transfer the coins from one purse to another.
     @param other the other purse
     */
    public void transfer(Purse other)
    {
        this.coins.addAll(other.coins);
        other.coins.clear();
    }
}

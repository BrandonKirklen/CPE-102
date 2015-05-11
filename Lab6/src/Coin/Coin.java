package Coin;

/**
 * Created by Brandon Kirklen on 5/11/2015.
 */
public class Coin {
    double value;
    String name;
    public Coin( double value, String name){
        this.value = value;
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public int compareTo (Coin otherCoin){
        int temp;
        if ( (otherCoin.getValue() - this.value) < 0) temp = 1;
        else temp = -1;
        return temp;
    }
}

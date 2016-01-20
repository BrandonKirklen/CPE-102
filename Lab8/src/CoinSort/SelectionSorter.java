package CoinSort;

/**
 * Created by Brandon Kirklen on 5/26/2015.
 */
public class SelectionSorter {
    private Coin[] coins;
    public SelectionSorter(Coin[] coins){
        this.coins = coins;
    }

    public void sort(){
        for (int i=0; i < coins.length; i++){
            int minimum = i;
            for( int j=i; j < coins.length; j++) {
                if (coins[minimum].getValue() > coins[j].getValue()) {
                    minimum = j;
                }
            }
            Coin hold = coins[i];
            coins[i] = coins[minimum];
            coins[minimum] = hold;
        }
    }
}

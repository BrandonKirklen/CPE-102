package CashRegister;

/**
 * Created by Brandon Kirklen on 5/2/2015.
 * Class which takes in the money type and number of that given currency and returns the amount
 */
public class MonetaryUnit {
    public static final double penny=0.01;
    public static final double nickel=0.05;
    public static final double dime=0.10;
    public static final double quarter=0.25;
    public static final double halfDollar=.50;
    public static final double dollar=1.00;

    private int quantity;
    private String munz;

    public MonetaryUnit(String munz, int quantity) {
        this.quantity=quantity;
        this.munz=munz;
    }

    public double getTotal() {
        double currencyValue = 0;
        switch ( munz ){
            case "penny" : currencyValue = penny; break;
            case "nickel" :  currencyValue = nickel; break;
            case "dime" : currencyValue = dime; break;
            case "quarter" : currencyValue = quarter; break;
            case "halfDollar" :  currencyValue = halfDollar; break;
            case "dollar" : currencyValue = dollar; break;
        }
        return currencyValue * quantity;
    }
}

package CashRegister3;

/**
 * Created by Brandon Kirklen on 4/12/2015.
 */
public class CashRegister
{
    public static final double QUARTER_VALUE = 0.25;
    public static final double DIME_VALUE = 0.1;
    public static final double NICKEL_VALUE = 0.05;
    public static final double PENNY_VALUE = 0.01;

    private double purchase;
    private double payment;

    /**
     Constructs a cash register with no money in it.
     */
    public CashRegister()
    {
        purchase = 0;
        payment = 0;
    }

    /**
     Records the sale of an item.
     @param amount the price of the item
     */
    public void recordPurchase(double amount)
    {
        double newTotal = purchase + amount;
        purchase = newTotal;
    }

    /**
     Computes the change due and resets the machine for the next customer.
     @return the change due to the customer
     */
    public double giveChange()
    {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return roundPrecision(change, 2);
    }

    static double roundPrecision(double number, int precision)
    {
        double shiftingValue = Math.pow(10, precision);
        return Math.round(number * shiftingValue) / shiftingValue;
    }

    public void enterDollars(int dollars)
    {
        payment += dollars;
    }

    public void enterQuarters(int quarters)
    {
        payment += quarters * QUARTER_VALUE;
    }

    public void enterDimes(int dimes)
    {
        payment += dimes * DIME_VALUE;
    }

    public void enterNickels(int nickels)
    {
        payment += nickels * NICKEL_VALUE;
    }

    public void enterPennies(int pennies)
    {
        payment += pennies * PENNY_VALUE;
    }
}

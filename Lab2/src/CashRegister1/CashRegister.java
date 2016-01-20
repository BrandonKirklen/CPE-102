package CashRegister1;

/**
 * Created by Brandon on 4/9/2015.
 */
public class CashRegister {
    private double purchase;
    private double payment;
    private double totalTax;
    private double taxRate;
    /**
     Constructs a cash register with no money in it.
     */
    public CashRegister(double rate)
    {
        purchase=0;
        payment=0;
        totalTax=0;
        taxRate=rate;
    }
    /**
     Records the sale of an item.
     @param amount the price of the item
     */
    public void recordPurchase(double amount)
    {
        purchase = purchase + amount;
    }
    /**
     Records the sale of a taxable item and compute the total tax.
     @param amount the price of the item
     */
    public void recordTaxablePurchase(double amount)
    {
        purchase = purchase + amount + amount*(taxRate/100);
        totalTax = totalTax + amount*(taxRate/100);
    }
    /**
     Enters the payment received from the customer.
     @param amount the amount of the payment
     */
    public void enterPayment(double amount)
    {
        payment=amount;
    }
    /**
     Returns the total tax due
     @return the totalTax
     */
    public double getTotalTax()
    {
        return  totalTax;
    }
    /**
     Computes the change due and resets the machine for the next customer.
     @return the change due to the customer
     */

    static double roundPrecision(double number, int precision)
    {
        double shiftingValue = Math.pow(10, precision);
        return Math.round(number * shiftingValue) / shiftingValue;
    }

    public double giveChange()
    {
        double change = payment - purchase;
        change = roundPrecision(change, 2);
        purchase = 0;
        payment = 0;
        totalTax = 0;
        return change;
    }
}

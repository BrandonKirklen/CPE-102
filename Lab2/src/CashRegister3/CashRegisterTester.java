package CashRegister3;

/**
 * Created by Brandon Kirklen on 4/12/2015.
 */

public class CashRegisterTester
{
    public static void main (String[] args)
    {
        CashRegister register = new CashRegister();
        register.recordPurchase(20.37);
        register.enterDollars(20);
        register.enterQuarters(2);
        System.out.println("Change: " + register.giveChange());
        System.out.println("Expected: 0.13");
    }
}
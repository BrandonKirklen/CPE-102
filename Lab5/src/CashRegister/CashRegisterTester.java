package CashRegister;

/**
 * Created by Brandon Kirklen on 5/2/2015.
 */
public class CashRegisterTester {
    public static void main(String[] args) {
        CashRegister currentDrawer = new CashRegister();
        System.out.println("Current total: " + currentDrawer.getTotal());
        System.out.println("Expected: 0");

        MonetaryUnit penny = new MonetaryUnit("penny", 20);
        MonetaryUnit nickel = new MonetaryUnit("nickel", 10);
        MonetaryUnit dime = new MonetaryUnit("dime", 2);
        MonetaryUnit quarter = new MonetaryUnit("quarter", 1);
        MonetaryUnit halfDollar = new MonetaryUnit("halfDollar", 30);
        MonetaryUnit dollar = new MonetaryUnit("dollar", 50);

        currentDrawer.enterCredit(penny);
        currentDrawer.enterCredit(nickel);
        currentDrawer.enterCredit(dime);
        currentDrawer.enterCredit(quarter);
        currentDrawer.enterCredit(halfDollar);
        currentDrawer.enterCredit(dollar);

        System.out.println("Current total: " + currentDrawer.getTotal());
        System.out.println("Expected: 66.15");

        System.out.println("$40 of stuff bought");
        currentDrawer.enterDebit(10);
        currentDrawer.enterDebit(30);

        System.out.println("Change:");
        System.out.printf("%10.2f", currentDrawer.completePurchase());
        System.out.println("\nExpected: 26.15");
    }
}

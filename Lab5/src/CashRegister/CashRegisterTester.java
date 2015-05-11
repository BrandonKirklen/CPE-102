package CashRegister;

/**
 * Created by Brandon Kirklen on 5/2/2015.
 */
public class CashRegisterTester {
    public static void main(String[] args)
    {
        CashRegister currentDrawer = new CashRegister();
        System.out.println("Current total: " + currentDrawer.getTotal());
        System.out.println("Expected: 0");
    }
}

package CashRegister2;

import CashRegister2.*;

/**
 * Created by Brandon on 4/9/2015.
 */
public class CashRegisterTester {
        public static void main(String[] args)
        {
            // tax rate of 5%
            CashRegister2.CashRegister register = new CashRegister();
            register.recordPurchase(10.20);
            register.recordPurchase(143.29);

            register.enterPayment(200, 1, 1, 1, 1);

            double change = register.giveChange();

            System.out.println(change);
            System.out.println("Expected: 46.92");

            System.out.println(register.getItemCount());
            System.out.println("Expected: 2");
        }
}

package CashRegister;

import java.util.ArrayList;

/**
 * Created by Brandon Kirklen on 5/2/2015.
 */
public class CashRegister {
    private double debit = 0;
    private double credit = 0;
    private ArrayList<MonetaryUnit> typesOfCurrency;

    public CashRegister(){
        typesOfCurrency = new ArrayList<>();
    }

    public double getTotal() {
        double total = 0;
        for (MonetaryUnit coin : typesOfCurrency ) {
            total += coin.getTotal();
        }
        return total;
    }

    public void enterCredit(MonetaryUnit coin){
        typesOfCurrency.add(coin);
        credit = getTotal();
    }

    public void enterDebit( double price){
        debit += price;
    }

    public double completePurchase(){
        double difference = credit - debit;
        debit = 0;
        credit = 0;
        return difference;
    }
}

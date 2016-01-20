package BankAccount;

import java.util.Formatter;
import java.util.Formattable;
import java.lang.Appendable;
import java.io.IOException;

/**
 * Created by Brandon Kirklen on 5/11/2015.
 */
public class BankAccount implements Formattable {
    private double balance;

    /*  Constructs a bank account with a zero balance  */
    public BankAccount()
    {
        balance = 0;
    }

    /*  Constructs a bank account with a given balance @param initialBalance the initial balance  */
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }

    /*  Deposits money into the bank account. @param amount the amount to deposit */
    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    /*  Withdraws money from the bank account. @param amount the amount to withdraw */
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }

    /*  Gets the current balance of the bank account. @return the current balance */
    public double getBalance()
    {
        return balance;
    }

    public void addInterest(double rate)
    {
        balance = balance*(1+(rate/100));
    }

    public void formatTo(Formatter formatter, int flags, int width, int precision){
        Appendable string = formatter.out();
        String balanceString = "" + balance;

        while (balanceString.length() < width ){
            balanceString = " " + balanceString;
        }

        try {
            string.append(balanceString);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

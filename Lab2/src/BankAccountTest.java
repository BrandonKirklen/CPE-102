/**
 * Created by Brandon on 4/6/2015.
 */
public class BankAccountTest
{
    public static void main(String[] args)
    {
        BankAccount momsSavings = new BankAccount(1000);
        momsSavings.withdraw(500);
        momsSavings.deposit(500);
        momsSavings.addInterest(10);
        System.out.println("Balance: ");
        System.out.println(momsSavings.getBalance());
        System.out.println("");
    }
}

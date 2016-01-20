package Card;

/**
 * Created by Brandon Kirklen on 4/18/2015.
 */
import java.util.Scanner;

/**
 This is a test for the Card class, which outputs the full
 description of a deck of cards.
 */
public class CardPrinter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Card notation:");
        String input = in.nextLine();
        Card card = new Card(input);
        System.out.println(card.getDescription());
    }
}

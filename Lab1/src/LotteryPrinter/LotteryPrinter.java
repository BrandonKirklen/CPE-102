package LotteryPrinter;
import java.util.Random;
/**
 * Created by Brandon on 4/6/2015.
 */
public class LotteryPrinter {
    public static void  main(String[] args)
    {
        Random newRandomNumber= new Random();
        System.out.println("Play this combination--it'll make you rich!");
        for (int i=1; i<=6; i++) {
            System.out.println(newRandomNumber.nextInt(48) + 1);
        }
    }
}

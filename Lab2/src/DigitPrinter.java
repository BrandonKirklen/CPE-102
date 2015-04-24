import java.util.Scanner;

/**
 * Created by Brandon Kirklen on 4/12/2015.
 */
public class DigitPrinter {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a 5 digit integer: ");
        int n1 = input.nextInt();
        digitPrintHelper(n1);
    }

    public static void digitPrintHelper(int n)
    {
        DigitExtractor myExtractor = new DigitExtractor(n);
        int length = (int)(Math.log10(n)+1);
        while(length>0) {
            System.out.println(myExtractor.nextDigit());
            length--;
        }
    }
}

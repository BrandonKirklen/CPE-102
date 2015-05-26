package Fibonacci;

/**
 * Created by Brandon Kirklen on 5/25/2015.
 * Fib tester
 */
public class FastFibComputerTester
{
    public static void main(String[] args)
    {
        FastFibComputer ffc = new FastFibComputer();
        System.out.printf("          %d %n", ffc.fib(50));
        System.out.println("Expected: 12586269025");
        System.out.printf("          %d %n", ffc.fib(90));
        System.out.println("Expected: 2880067194370816120");
        System.out.println(ffc.fib(400));
    }
}

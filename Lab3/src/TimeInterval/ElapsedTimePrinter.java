package TimeInterval;

import java.util.Scanner;

/**
 * Created by Brandon Kirklen on 4/18/2015.
 */
public class ElapsedTimePrinter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first time: ");
        int firstTime = sc.nextInt();
        System.out.println("Please enter the second time: ");
        int secondTime = sc.nextInt();
        TimeInterval timeInterval = new TimeInterval(firstTime, secondTime);
        System.out.println(timeInterval.hours() + " hours " + timeInterval.minutes() + " minutes");
    }
}
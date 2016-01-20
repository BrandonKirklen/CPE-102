package InsertionSorter;

/**
 * Created by Brandon Kirklen on 5/27/2015.
 *  This program tests the insertion sort algorithm by
 sorting an array that is filled with random numbers.
 */

import org.apache.commons.lang.time.*;

import java.util.*;
import java.util.Scanner;

public class InsertionSorterTimer
{
    public static int[] randomIntArray(int length, int size) {
        Random r = new Random();
        int[] numbers = new int[length];
        for(int i = 0; i < length; i++) {
            numbers[i] = r.nextInt(size+1);
        }
        return numbers;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = in.nextInt();

        // Construct random array

        int[] a = randomIntArray(n, 100);
        int[] b = {5,4,3,2,1,3};
        InsertionSorter sorter = new InsertionSorter(a);

        // Use stopwatch to time insertion sort

        StopWatch timer = new StopWatch();

        timer.start();
        sorter.sort();
        timer.stop();
        for ( int i=0; i < a.length; i++){
            System.out.print(a[i] + ",");
        }


        System.out.println("Elapsed time: "
                + timer.getTime() + " milliseconds");
    }
}

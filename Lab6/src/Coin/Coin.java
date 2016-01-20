package Coin;

/**
 * Created by Brandon Kirklen on 5/11/2015.
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.ArrayList;

public class Coin {
    double value;
    String name;

    public Coin()
    {
        value = 0;
        name = "";
    }

    public Coin( double value, String name){
        this.value = value;
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public int compareTo (Coin otherCoin){
        int temp;
        if ( (otherCoin.getValue() - this.value) < 0) temp = 1;
        else temp = -1;
        return temp;
    }

    public void read(Scanner in) throws IOException
    {
        try{
            this.name = in.next();
            this.value = in.nextDouble();
        } catch ( InputMismatchException e ) {
            System.out.println("java.io.IOException: Coin value must be of type double.");
        }
    }

    /**
     Reads a file with coin values.
     @param filename the file name
     @return an array of coins in the file
     */
    public static ArrayList<Coin> readFile(String filename) throws IOException
    {
        ArrayList<Coin> coins = new ArrayList<>();
        Scanner input;

        try{
            input = new Scanner(new File(filename));
        } catch (IOException e){
            System.out.println("Bad input, try another filename.");
            Scanner in = new Scanner(System.in);
            filename = in.next();
            input = new Scanner(new File(filename));
        }

        while ( input.hasNext() ) {
            Coin c = new Coin();
            c.read(input);
            coins.add(c);
        }
        return coins;

    }
}

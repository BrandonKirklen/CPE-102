package Fibonacci;

import java.util.ArrayList;

/**
 * Created by Brandon Kirklen on 5/25/2015.
 * Compute and Store Fibonacci Numbers
 */
public class FastFibComputer {
    ArrayList<Long> fibonacci = new ArrayList<>();
    public FastFibComputer(){
        fibonacci.add(1L);
        fibonacci.add(1L);
    }

    public long fib(int index){
        return fibRecurse(index);
    }

    private long fibRecurse(int index){
        int maxComputed = fibonacci.size()-1;
        if( maxComputed == index) return fibonacci.get(index-1);
        else{
            fibonacci.add( fibonacci.get(maxComputed-1) + fibonacci.get(maxComputed));
        }
        return fibRecurse(index);
    }
}

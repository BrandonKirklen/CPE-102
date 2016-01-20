package Downsize;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by Brandon Kirklen on 5/31/2015.
 * Business Class
 */

public class Business {
    public static void downsize(LinkedList<String> list){
        for( int i = list.size() - ( list.size() % 2 == 0 ? 1 : 2); i >= 0; i = i - 2){
            list.remove(i);
        }
    }

    public static void remove(LinkedList<String> list){
        for( int i = list.size()-1; i >= 0; i--){
            if ( list.get(i).length() < 4 ){
                list.remove(i);
            }
        }
    }
    public static void printSecond(LinkedList<String> words){
        ListIterator<String> iterator = words.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            if ( iterator.hasNext() ){
                iterator.next();
            }
        }
    }

}

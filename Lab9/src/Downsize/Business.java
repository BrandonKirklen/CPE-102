package Downsize;

import java.util.LinkedList;
/**
 * Created by Brandon Kirklen on 5/31/2015.
 */

public class Business {
    public static void downsize(LinkedList<String> list){
        for( int i = list.size() - ( list.size() % 2 == 0 ? 1 : 2); i >= 0; i = i - 2){
            list.remove(i);
        }
    }
}

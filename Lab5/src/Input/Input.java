package Input;

import java.util.Scanner;

/**
 * Created by Brandon Kirklen on 5/12/2015.
 */
public class Input {
    public static int readInt(Scanner in, String prompt, String error, int min, int max){
        while ( true ){
            System.out.println(prompt);
            int anInt = in.nextInt();
            if ( anInt > min && anInt < max ){
                return anInt;
            }
            else{
                System.out.println(error);
            }
        }
    }
}

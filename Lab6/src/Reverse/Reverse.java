package Reverse;

import java.io.*;
import java.util.*;

/**
 * Created by Brandon Kirklen on 5/11/2015.
 */
public class Reverse {
    public static void main(String args[]) throws IOException{
        String currentLine;
        ArrayList<String> fullFile = new ArrayList<>();
        Scanner in = new Scanner(new File(args[0]));
        BufferedWriter bufferedWriter = new BufferedWriter(new PrintWriter(args[0]));
        while ( in.hasNextLine() ){
            currentLine = in.nextLine();
            fullFile.add(currentLine);
        }
        for (String Line: fullFile) {
            StringBuffer chugchug = new StringBuffer(Line);
            bufferedWriter.write(chugchug.reverse().toString(), 0, Line.length());
            bufferedWriter.newLine();
        }
        in.close();
        bufferedWriter.close();
    }
}

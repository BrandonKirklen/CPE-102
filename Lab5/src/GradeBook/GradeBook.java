package GradeBook;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Brandon Kirklen on 5/10/2015.
 * Class which takes a list of student names, then their grades and prints their average score
 */
public class GradeBook {
    public static void main(String[] args) {
        String lineSeparator = System.getProperty("line.separator");
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        //input.useDelimiter("\\s");
        while ( true ){
            System.out.println("Enter a student name, Q to quit:");
            String name = input.nextLine();
            if ( name.equals("Q") || name.equals("q") ) break;
            studentList.add(new Student(name));
        }
        for ( Student studentName : studentList ) {
            System.out.println("Enter scores for " + studentName + ", Q to quit:");
            boolean loop = true;
            do {
                String scores = input.nextLine();
                String[] scoreSplit = scores.split(" ");
                for (String score : scoreSplit) {
                    if ( score.equals("q") || score.equals("Q")) {
                        loop = false;
                    }
                    else {
                        studentName.putGrade( Double.parseDouble(score) );
                    }
                }
            }
            while ( loop == true );
        }

        for ( Student studentName : studentList ){
            System.out.print(studentName + ": ");
            System.out.printf("%.2f", studentName.getFinalGrade());
            System.out.println();
        }
    }
}

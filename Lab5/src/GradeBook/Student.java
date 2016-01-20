package GradeBook;

import java.util.ArrayList;

/**
 * Created by Brandon Kirklen on 5/10/2015.
 * Holds Student Name, and an arraylist of grades
 */
public class Student {
    ArrayList<Double> grades = new ArrayList<>();
    String name;

    @Override
    public String toString()
    {
        return this.name;
    }
    public Student(String name){
        this.name = name;
    }

    public void putGrade( double grade){
        grades.add(grade);
    }

    public double getFinalGrade()
    {
        if( grades.size() == 0 ) return 0;
        double sum = 0;
        double lowest = Integer.MAX_VALUE;
        for( Double currentValue : grades) {
            sum += currentValue;
            if (currentValue < lowest) lowest = currentValue;
        }
        return sum-lowest;
    }
}

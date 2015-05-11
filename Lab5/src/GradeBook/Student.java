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

    public double getAverage()
    {
        double sum = 0;
        for( Double currentValue : grades){
            sum += currentValue;
        }
        return sum/grades.size();
    }
}

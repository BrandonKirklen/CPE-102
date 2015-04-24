/**
 * Created by Brandon on 4/9/2015.
 */
public class Employee {
    private String name;
    private double salary;

    /**
     Constructs an employee.
     @param employeeName the employee name
     @param currentSalary the employee salary
     */
    public Employee(String employeeName, double currentSalary)
    {
        name = employeeName;
        salary = currentSalary;
    }

    /**
     Gets the employee name.
     @return the name
     */
    public String getName()
    {
        return  name;
    }

    /**
     Gets the employee salary.
     @return the salary/home/cay/books/bigj3/solutions/Ch03/ExP3_4/
     */
    public double getSalary()
    {
        return salary;
    }

    /**
     Raises the salary by a given percentage.
     @param percent the percentage of the raise
     */
    public void raiseSalary(double percent)
    {
        salary = salary + (salary * percent/100);
    }
}

package Polygon;

/**
 * Created by Brandon Kirklen on 4/25/2015.
 *  A polygon is a closed curve made up from line segments
 that join the corner points.
 */
import java.util.ArrayList;

public class Polygon
{
    private double X, Y;
    ArrayList<Polygon.Coordinate<X,Y>> cordinateList = new ArrayList<Polygon.Coordinate<X,Y>>();
    /**
     Constructs a polygon with no corner points.
     */
    public Polygon()
    {

    }

    /**
     Adds a corner point to the polygon.
     @param x the x-coordinate of the point
     @param y the y-coordinate of the point
     */
    public void add(double x, double y)
    {

    }

    /**
     Calculates the perimeter of a polygon.
     @return the perimeter of this polygon
     */
    public double perimeter()
    {
        return 0;
    }

    /**
     Calculates the area of a polygon.
     @return the area of this polygon
     */
    public double area()
    {
        return 0;
    }
}

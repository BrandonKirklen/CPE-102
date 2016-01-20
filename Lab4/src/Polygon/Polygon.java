package Polygon;

/**
 * Created by Brandon Kirklen on 4/25/2015.
 *  A polygon is a closed curve made up from line segments
 that join the corner points.
 */
import java.util.ArrayList;

public class Polygon
{
    private class Coordinate<X,Y> {
        private double x;
        private double y;
        public Coordinate(double x, double y){
            this.x = x;
            this.y = y;
        }
        public double getX()
        {
            return x;
        }
        public double getY()
        {
            return y;
        }
        public void setX(double x)
        {
            this.x = x;
        }
        public void setY(double y)
        {
            this.y = y;
        }
    }

    ArrayList<Coordinate> coordinateArrayList = new ArrayList<>();

    /**
     Constructs a polygon with no corner points.
     */

    static double roundPrecision(double number, int precision)
    {
        double shiftingValue = Math.pow(10, precision);
        return Math.round(number * shiftingValue) / shiftingValue;
    }

    public Polygon(){}

    /**
     Adds a corner point to the polygon.
     @param x the x-coordinate of the point
     @param y the y-coordinate of the point
     */
    public void add(double x, double y)
    {
        Coordinate cord = new Coordinate(x,y);
        coordinateArrayList.add(cord);
    }

    /**
     Calculates the perimeter of a polygon.
     @return the perimeter of this polygon
     */
    public double perimeter()
    {
        double perimeter=0;
        for ( int i=0; i < coordinateArrayList.size()-1; i++ )
        {
            perimeter += Math.sqrt(
                    Math.pow(coordinateArrayList.get(i+1).getX() - coordinateArrayList.get(i).getX(),2) +
                    Math.pow(coordinateArrayList.get(i+1).getY() - coordinateArrayList.get(i).getY(),2));
        }
        //
        perimeter += Math.sqrt(
                Math.pow(coordinateArrayList.get(coordinateArrayList.size()-1).getX()
                        - coordinateArrayList.get(0).getX(),2) +
                Math.pow(coordinateArrayList.get(coordinateArrayList.size()-1).getY()
                        - coordinateArrayList.get(0).getY(),2));
        return roundPrecision(perimeter, 2);
    }

    /**
     Calculates the area of a polygon.
     @return the area of this polygon
     */
    public double area()
    {
        double area=0;
        for ( int i=0; i < coordinateArrayList.size()-1; i++ )
        {
            area += (coordinateArrayList.get(i).getX() * coordinateArrayList.get(i+1).getY())
                    - (coordinateArrayList.get(i+1).getX() * coordinateArrayList.get(i).getY());
        }
        area += (coordinateArrayList.get(coordinateArrayList.size()-1).getX()
                * coordinateArrayList.get(0).getY())
                - (coordinateArrayList.get(0).getX()
                * coordinateArrayList.get(coordinateArrayList.size()-1).getY());
        area = 0.5 * Math.abs(area);
        return roundPrecision(area, 2);
    }
}

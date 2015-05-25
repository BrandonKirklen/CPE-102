package PolygonArea;

/**
 * Created by Brandon Kirklen on 5/15/2015.
 * Main Polygon Class
 */
import java.awt.geom.Point2D;
import java.util.ArrayList;

/**
 A polygon with a number of Point2D.Double corners
 */
public class Polygon
{
    private ArrayList<Point2D.Double> corners;

    /**
     Constructs a Polygon object with no corners
     */
    public Polygon()
    {
        corners = new ArrayList<Point2D.Double>();
    }

    /**
     Adds a point to the list.
     @param p the point to add
     */
    public void add(Point2D.Double p)
    {
        corners.add(p);
    }

    /**
     Computes the area of a polygon.
     @return area of a polygon
     */
    public double getArea()
    {
        double area=0;
        if( corners.size() < 3 ){
            return area;
        }
        else {
            area += Math.abs(
                    corners.get(0).getX() * corners.get(1).getY() + corners.get(1).getX() * corners.get(2).getY() +
                    corners.get(2).getX() * corners.get(0).getY() - corners.get(0).getY() * corners.get(1).getX() -
                    corners.get(1).getY() * corners.get(2).getX() - corners.get(2).getY() * corners.get(0).getX()) / 2;
            //corners.remove(2);
            corners.remove(1);
            //corners.remove(0);
            area += getArea();
        }
        return area;
    }
}

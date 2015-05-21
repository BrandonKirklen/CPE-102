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

    }
}

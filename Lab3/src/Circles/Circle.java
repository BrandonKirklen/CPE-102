package Circles;

/**
 * Created by Brandon Kirklen on 4/19/2015.
 */
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

/**
 This class implements a Circle. It includes a method to test whether
 two circles intersect.
 */
public class Circle
{
    private double xCenter;
    private double yCenter;
    private double radius;
    private Color color;

    /**
     Constructs a black circle.
     @param x the x-coordinate of the center
     @param y the y-coordinate of the center
     @param r the radius
     */
    public Circle(double x, double y, double r)
    {
        xCenter = x;
        yCenter = y;
        radius = r;
        color = Color.BLACK;
    }

    /**
     Sets the color of this circle.
     @param aColor the color
     */
    public void setColor(Color aColor)
    {
        color = aColor;
    }

    /**
     Draws the circles.
     @param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        if (radius < 0)
            return;

        g2.setColor(color);
        // draw the circle
        Ellipse2D.Double circle
                = new Ellipse2D.Double(xCenter - radius, yCenter - radius,
                2 * radius, 2 * radius);
        g2.draw(circle);
    }

    /**
     Tests whether or not the two circles intersect with each other.
     @param other the other circle
     @return true the two circles intersect
     */
    public boolean intersects(Circle other)
    {
        double distanceBetweenCircleCenters;
        distanceBetweenCircleCenters = Math.sqrt(
                Math.pow((this.xCenter - other.xCenter), 2) +
                        Math.pow((this.yCenter - other.yCenter), 2));
        return ((this.radius - other.radius) <= distanceBetweenCircleCenters) &&
                (distanceBetweenCircleCenters <= (this.radius + other.radius));
    }
}

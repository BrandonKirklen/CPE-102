package Cloud;

/**
 * Created by Brandon Kirklen on 4/26/2015.
 */

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;


public class Cloud {
    ArrayList<Point2D.Double> pointCollection = new ArrayList<>();
    public void add(Point2D.Double aPoint)
    {
        pointCollection.add(aPoint);
    }
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.black);

        for (int i=0; i < pointCollection.size()-1; i++) {
            Ellipse2D.Double circle
                    = new Ellipse2D.Double(
                    pointCollection.get(i).getX(), pointCollection.get(i).getY(),10,10);
            g2.draw(circle);
        }
    }
}

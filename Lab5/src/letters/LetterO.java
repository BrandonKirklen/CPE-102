package letters;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * Created by Brandon Kirklen on 5/12/2015.
 */
public class LetterO {
    private double x, y;
    private final int height = 50;
    private final int width = 40;
    public LetterO(Point2D.Double p){
        x=p.getX();
        y=p.getY();
    }
    public void draw(Graphics2D g2){
        Ellipse2D.Double o = new Ellipse2D.Double(x,y,width,height);
        g2.draw(o);
    }
}

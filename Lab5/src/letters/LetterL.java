package letters;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * Created by Brandon Kirklen on 5/12/2015.
 */
public class LetterL {
    private double x, y;
    private final int height = 50;
    private final int width = 40;
    public LetterL(Point2D.Double p){
        x=p.getX();
        y=p.getY();
    }
    public void draw(Graphics2D g2){
        Line2D.Double vertical = new Line2D.Double(x,y,x,height);
        g2.draw(vertical);
        Line2D.Double bottom = new Line2D.Double(x,y,width,y);
        g2.draw(bottom);
    }
}

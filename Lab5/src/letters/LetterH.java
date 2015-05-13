package letters;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * Created by Brandon Kirklen on 5/12/2015.
 * Make a letter H
 */
public class LetterH {
    private double x, y;
    private final int height = 50;
    private final int width = 40;
    public LetterH(Point2D.Double p){
        x=p.getX();
        y=p.getY();
    }
    public void draw(Graphics2D g2){
        Line2D.Double vertical1 = new Line2D.Double(x, y, x, y + height);
        g2.draw(vertical1);
        Line2D.Double vertical2 = new Line2D.Double(x + width, y, x + width, y + height);
        g2.draw(vertical2);
        Line2D.Double midline = new Line2D.Double(x,y +  height/2, x + width,y + height/2);
        g2.draw(midline);
    }
}

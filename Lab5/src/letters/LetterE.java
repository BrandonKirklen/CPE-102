package letters;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * Created by Brandon Kirklen on 5/12/2015.
 * Makes a letter E
 */
public class LetterE {
    private double x, y;
    private final int height = 50;
    private final int width = 40;
    public LetterE(Point2D.Double p){
        x=p.getX();
        y=p.getY();
    }
    public void draw(Graphics2D g2){
        Line2D.Double vertical = new Line2D.Double(x,y,x,y + height);
        g2.draw(vertical);
        Line2D.Double bottom = new Line2D.Double(x,y,x + width,y);
        g2.draw(bottom);
        Line2D.Double middle = new Line2D.Double(x, y + height/2, x + width, y + height/2);
        g2.draw(middle);
        Line2D.Double top = new Line2D.Double(x, y + height, x + width, y + height);
        g2.draw(top);
    }
}

package BullsEye; /**
 * Created by Brandon Kirklen on 4/9/2015.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;


public class BullsEye{
    double radius, xCenter, yCenter, diameter, rings;

    public BullsEye(double r, double x, double y) {
        radius = r;
        xCenter = x - r;
        yCenter = y - r;
        diameter = r*2;
        rings = 5;
    }

    /**
     * Draws the bull's eye.
     *
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2) {
        int circleNumber=0;
        while(circleNumber<rings) {
            double currentDiameter, currentCenter;
            currentDiameter = diameter - (diameter * (circleNumber/(double)(rings)));
            currentCenter = xCenter + (radius * (circleNumber/(double)(rings)));
            Ellipse2D.Double circle = new Ellipse2D.Double(currentCenter, currentCenter, currentDiameter, currentDiameter);
            switch (circleNumber % 2) {
                case 0:
                    g2.setColor(Color.black);
                    break;
                case 1:
                    g2.setColor(Color.white);
                    break;
                default:
                    g2.setColor(Color.GREEN);
                    break;
            }
            g2.fill(circle);
            circleNumber++;
        }
        return;
    }
}

class BullsEyeComponent extends JComponent
    {
        public void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            int radius = 100;
            int xCenter = 100;
            int yCenter = 100;
            BullsEye be = new BullsEye(radius, xCenter, yCenter);
            be.draw(g2);
        }
    }

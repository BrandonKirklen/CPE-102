package Cloud;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Random;

/**
 * Created by Brandon Kirklen on 4/27/2015.
 */
public class CloudComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        Cloud c = new Cloud();
        Random generator = new Random();
        double x = 0;
        double y = 0;

        for (int i = 0; i < 100; i++)
        {
            x = getWidth() * generator.nextDouble();
            y = getHeight() * generator.nextDouble();
            c.add(new Point2D.Double(x, y));
        }

        c.draw(g2);
    }
}
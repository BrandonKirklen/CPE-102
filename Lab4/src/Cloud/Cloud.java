package Cloud;

/**
 * Created by Brandon Kirklen on 4/26/2015.
 */
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.util.Random;

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

public class Cloud {
    public void add(Point2D.Double aPoint)
    {

    }
    public void draw(Graphics2D g2)
    {

    }
}

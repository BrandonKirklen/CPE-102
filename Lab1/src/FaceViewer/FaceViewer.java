package FaceViewer;

/**
 * Created by Brandon on 4/6/2015.
 */

import javax.swing.JFrame;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class FaceViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setSize(300, 400);
        frame.setTitle("FaceViewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FaceComponent component = new FaceComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}




/**
 Draws a face.
 */
class FaceComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D.Double head = new Ellipse2D.Double(5, 10, 100, 110);
        g2.draw(head);
        Ellipse2D.Double eye1 = new Ellipse2D.Double(25, 40, 10, 10);
        g2.draw(eye1);
        Ellipse2D.Double eye2 = new Ellipse2D.Double(75, 40, 10, 10);
        g2.draw(eye2);
        Line2D.Double mouth = new Line2D.Double(25, 85, 85, 85);
        g2.draw(mouth);
    }
}
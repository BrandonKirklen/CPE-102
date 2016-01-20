package letters;

import javafx.scene.shape.Circle;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;

/**
 * Created by Brandon Kirklen on 5/12/2015.
 * Prints letters
 */
public class LettersComponent extends JComponent {
    private LetterH h1, h2;
    private LetterE e1, e2;
    private LetterL l1, l2, l3;
    private LetterO o1, o2;
    private int WIDTH = 200;
    private int HEIGHT = 150;
    private int CHARPERLINE = 4;
    private int LINEPER = 2;
    private int SPACING = 5;

    private void cornerMoveX ( Point2D.Double p ){
        p.setLocation(p.getX() + WIDTH/CHARPERLINE, p.getY());
    }

    private void cornerMoveY ( Point2D.Double p ){
        p.setLocation( 0, p.getY() + HEIGHT/LINEPER);
    }

    public LettersComponent(){
        Point2D.Double corner = new Point2D.Double(0,0);
        h1 = new LetterH(corner);
        cornerMoveX(corner);
        e1 = new LetterE(corner);
        cornerMoveX(corner);
        l1 = new LetterL(corner);
        cornerMoveX(corner);
        l2 = new LetterL(corner);
        cornerMoveX(corner);
        o1 = new LetterO(corner);
        cornerMoveY(corner);
        h2 = new LetterH(corner);
        cornerMoveX(corner);
        o2 = new LetterO(corner);
        cornerMoveX(corner);
        l3 = new LetterL(corner);
        cornerMoveX(corner);
        e2 = new LetterE(corner);
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        h1.draw(g2);
        e1.draw(g2);
        l1.draw(g2);
        l2.draw(g2);
        o1.draw(g2);
        h2.draw(g2);
        o2.draw(g2);
        l3.draw(g2);
        e2.draw(g2);
    }
}

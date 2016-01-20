package GrowSquarePrinter;
import java.awt.Rectangle;

/**
 * Created by Brandon on 4/6/2015.
 */

/**
 Prints a rectangle, then translates it, and grows it so that
 the new square is twice the size of the original and has the
 same top-left corner.
 */
public class growSquarePrinter {
    public static void main(String[] args) {
        /*
         Rectangles are created with x, y, width, height where x and y are the upper left corner of the object.
         We want the center of the square at 100, 100 and the sides to be 50. The upper left corner coordinate will
         be at 75, 75 for the center to be at 100, 100.
      */
        Rectangle square = new Rectangle(75, 75, 50, 50);
        System.out.println(square);
        square.grow(25,25);
        square.translate(25,25);
        System.out.println(square);
    }
}


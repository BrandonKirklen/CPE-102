package AreaTester;

/**
 * Created by Brandon on 4/6/2015.
 */

import java.awt.Rectangle;
public class AreaTester {
    public static void main(String[] args)
    {
        double area,width,height;
        Rectangle box = new Rectangle(0, 0, 10, 20);
        width=box.getWidth();
        height=box.getHeight();
        area = width * height;
        System.out.println("The area of the rectangle is: "+ area);
        System.out.println("Expected: 200.0");
    }
}

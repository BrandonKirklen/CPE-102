package Geometry;

import java.awt.geom.*;

/**
 * Created by Brandon Kirklen on 5/12/2015.
 */
public class Geometry {
    public static boolean isInside(Point2D.Double p, Ellipse2D.Double e) {
        double centerX, centerY;
        centerX = e.getX() + e.getWidth()/2;
        centerY = e.getY() - e.getHeight()/2;
        if (e.isEmpty()){
            return false;
        }
        else if ( Math.abs( p.getX() - e.getX() ) > e.getWidth() || Math.abs( p.getY() - e.getY() ) > e.getHeight() ){
            return false;
        }
        else if ( (Math.pow(p.getX() - centerX, 2) / Math.pow(e.getWidth()/2, 2)) +
                Math.pow(p.getY() - centerY, 2) / Math.pow(e.getHeight()/2, 2) <= 1 ){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean isOnBoundary(Point2D.Double p, Ellipse2D.Double e) {
        double centerX, centerY;
        centerX = e.getX() + e.getWidth()/2;
        centerY = e.getY() - e.getHeight()/2;
        if (e.isEmpty()){
            return false;
        }
        else if ( Math.abs( p.getX() - e.getX() ) > e.getWidth() || Math.abs( p.getY() - e.getY() ) > e.getHeight() ){
            return false;
        }
        else if ( (Math.pow(p.getX() - centerX, 2) / Math.pow(e.getWidth()/2, 2)) +
                Math.pow(p.getY() - centerY, 2) / Math.pow(e.getHeight()/2, 2) == 1 ){
            return true;
        }
        else {
            return false;
        }
    }
}

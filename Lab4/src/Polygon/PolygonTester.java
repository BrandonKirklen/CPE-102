package Polygon;

/**
 * Created by Brandon Kirklen on 4/25/2015.
 This is a tester class for Polygon.
 */
public class PolygonTester
{
    public static void main(String[] args)
    {
        Polygon square = new Polygon();

        square.add(100, 100);
        square.add(100, 150);
        square.add(150, 150);
        square.add(150, 100);

        Polygon hexagon = new Polygon();

        hexagon.add(600, 463);
        hexagon.add(500, 463);
        hexagon.add(450, 550);
        hexagon.add(500, 637);
        hexagon.add(600, 637);
        hexagon.add(650, 550);

        double squarePerimeter = square.perimeter();
        System.out.println("Square perimeter: " + squarePerimeter);
        System.out.println("Expected: 200.00");

        double squareArea = square.area();
        System.out.println("Square area: " + squareArea);
        System.out.println("Expected: 2500.00");

        double hexagonPerimeter = hexagon.perimeter();
        System.out.println("Hexagon perimeter: " + hexagonPerimeter);
        System.out.println("Expected: 601.38");

        double hexagonArea = hexagon.area();
        System.out.println("Hexagon area: " + hexagonArea);
        System.out.println("Expected: 26100.00");
    }
}
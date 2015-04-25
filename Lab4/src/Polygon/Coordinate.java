package Polygon;

/**
 * Created by Brandon Kirklen on 4/25/2015.
 */
public class Coordinate<X,Y> {
    private X x;
    private Y y;
    public Coordinate(X x, Y y){
        this.x = x;
        this.y = y;
    }
    public X getX()
    {
        return x;
    }
    public Y getY()
    {
        return y;
    }
    public void setX(X x)
    {
        this.x = x;
    }
    public void setR(Y y)
    {
        this.y = y;
    }
}
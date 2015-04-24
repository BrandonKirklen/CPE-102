package Line;

/**
 * Created by Brandon Kirklen on 4/19/2015.
 */
public class Line {
    public double slope;
    public double yIntercept;
    public double xIntercept;

    public Line(double xIntercept) //Vertical
    {
        this.xIntercept = xIntercept;
    }

    public Line(double slope, double yIntercept) //Equation in form y=mx+b
    {
        this.slope = slope;
        this.yIntercept = yIntercept;
    }

    public Line(double xPoint, double yPoint, double slope) //Point Slope Form
    {
        this.slope = slope;
        this.yIntercept = yPoint - slope*xPoint;
    }

    public Line(double xPoint1, double yPoint1, double xPoint2, double yPoint2) //Two points form
    {
        if(xPoint1 == xPoint1)
        {
            xIntercept = xPoint1;
        }
        else
        {
            this.slope = (yPoint1 - yPoint2) / (xPoint1 - xPoint2);
            this.yIntercept = yPoint1 - slope * xPoint1;
        }
    }

    boolean intersects(Line other)
    {
        if (this.isParallel(other) && this.equals(other) == false) {
            return false;
        }
        else
            return true;
    }
    boolean equals(Line other)
    {
        return (this.slope == other.slope && this.yIntercept == other.yIntercept && this.xIntercept == other.xIntercept);
    }
    boolean isParallel(Line other)
    {
        return ( this.slope == other.slope );
    }
}

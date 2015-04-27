package PieChart;

import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;

/**
 * Created by Brandon Kirklen on 4/27/2015.
 * PieChart
 */
public class PieChart {
    ArrayList<Double> valuesCollection = new ArrayList<>();
    int width, height;
    public PieChart(int width, int height)
    {
        this.width=width;
        this.height=height;
    }
    public void add(double value)
    {
        valuesCollection.add(value);
    }
    public void draw(Graphics2D g2)
    {
        g2.drawOval(0, 0, width, height);
        double sum = 0;
        for(double d : valuesCollection)
        {
            sum += d;
        }
        for (int i=0; i < valuesCollection.size()-1; i++)
        {
            Line2D.Double line = new Line2D.Double(width/2, height/2,
                    width/2 + width/2*Math.cos((valuesCollection.get(i)/sum)*100*2*Math.PI),
                    height/2 + height/2*Math.sin((valuesCollection.get(i)/sum)*100*2*Math.PI));
            g2.draw(line);
        }

    }
}

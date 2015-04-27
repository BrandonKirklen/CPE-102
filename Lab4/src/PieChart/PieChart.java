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
        double runningPercent=0;
        for (Double aValuesCollection : valuesCollection)
        {
            double currentPercent = aValuesCollection / sum;
            runningPercent += currentPercent;
            double angle = (2.0 * Math.PI) * (runningPercent);
            Line2D.Double line = new Line2D.Double(width / 2, height / 2,
                    width / 2.0 * (1.0 + Math.cos(angle)),
                    height / 2.0 * (1.0 + Math.sin(angle)));
            g2.draw(line);
        }

    }
}

package PieChart;

/**
 * Created by Brandon Kirklen on 4/27/2015.
 * Displays a pie chart.
 */
import javax.swing.JFrame;

public class ChartViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        final int FRAME_WIDTH = 300;
        final int FRAME_HEIGHT = 300;

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("ChartViewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PieChartComponent component = new PieChartComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}

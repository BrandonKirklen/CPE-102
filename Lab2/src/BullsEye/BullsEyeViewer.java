package BullsEye;

/**
 * Created by Brandon Kirklen on 4/9/2015.
 */


import javax.swing.JFrame;

public class BullsEyeViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setSize(220, 240);
        frame.setTitle("BullsEye");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BullsEyeComponent component = new BullsEyeComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}

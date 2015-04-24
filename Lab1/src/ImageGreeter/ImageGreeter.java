package ImageGreeter;

/**
 * Created by Brandon on 4/6/2015.
 */
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ImageGreeter
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL(
                "http://thumbs.dreamstime.com/x/astronaut-vector-4033793.jpg");
        JOptionPane.showMessageDialog(null, "Why, hello there", "Title",
                JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
        System.exit(0);
    }
}
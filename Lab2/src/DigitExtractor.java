/**
 * Created by Brandon Kirklen on 4/12/2015.
 */
public class DigitExtractor
{
        int leftover, poppedOff;

        public DigitExtractor(int anInteger) {
            leftover = anInteger;
        }

        public int nextDigit() {
            poppedOff = leftover%10;
            leftover /= 10;
            return poppedOff;
        }
}

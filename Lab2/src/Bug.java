/**
 * Created by Brandon Kirklen on 4/9/2015.
 */
public class Bug {
    int position;
    int direction=1;
    /**
     Constructs a bug with a given position, facing right.
     @param initialPosition the initial position
     */
    public Bug(int initialPosition)
    {
        position = initialPosition;
    }

    /**
     Moves the bug by one unit in the current direction.
     */
    public void move()
    {
        position = position + direction;
    }

    /**
     Flips the direction of this bug.
     */
    public void turn()
    {
        direction = -direction;
    }

    /**
     Gets the current position of this bug.
     @return the position
     */
    public int getPosition()
    {
        return position;
    }
}

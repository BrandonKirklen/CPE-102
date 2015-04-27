package MagicSquares;

/**
 * Created by Brandon Kirklen on 4/27/2015.
 * Magic Square
 */
public class MagicSquare {
    int size;
    int[][] square;
    String eol = System.getProperty("line.separator");

    MagicSquare (int size)
    {
        this.square = new int[size][size];
        this.size=size;
        int x = size - 1;
        int y = size / 2;
        for (int i=0; i < (size * size); i++)
        {
            square[x][y] = i + 1;
            if ( square[(x+1) % size][(y+1) % size] != 0)
            {
                x -= 1;
            }
            else
            {
                x += 1;
                y += 1;
            }
            x = Math.abs(x % size);
            y = Math.abs(y % size);
        }
    }
    public String toString()
    {
        String output="";
        for (int i=0; i < size; i++)
        {
            for (int j=0; j < size; j++)
            {
                if( square[i][j]/10 == 0 )
                {
                    output += "  " + square[i][j];
                }
                else
                {
                    output += " " + square[i][j];
                }
            }
            output += eol;
        }
        return output;
    }
}


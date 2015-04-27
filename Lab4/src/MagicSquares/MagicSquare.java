package MagicSquares;

/**
 * Created by Brandon Kirklen on 4/27/2015.
 */
public class MagicSquare {
    int size;
    int[][] square;
    String eol = System.getProperty("line.separator");

    MagicSquare (int size)
    {
        this.square = new int[size][size];
        this.size=size;
        square[size-1][size/2]=1;
        for (int i=0; i < size * size; i++)
        {
            if(i+1 % 5 == 0)
            {
                square[(size+i) % size][((size/2)+i) % size]=i+1;
            }
            else
            {
                square[(size + i) % size][((size / 2) + i) % size] = i + 1;
            }
        }
    }
    public String toString()
    {
        String output="";
        for (int i=0; i < size; i++)
        {
            for (int j=0; j < size; j++)
            {
                output += square[i][j]+ " ";
            }
            output += eol;
        }
        return output;
    }
}


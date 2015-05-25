package Maze;

/**
 * Created by Brandon Kirklen on 5/24/2015.
 * Holds a maze with lines of all equal length and uses * as the edges
 */
public class Maze {
    private char[][] layout;
    public Maze(char[][] layout){
        this.layout=layout;
    }

    public boolean escape(int y, int x){
        boolean[][] visited = new boolean[layout.length][layout[0].length];
        return escapeRecurse( y, x, visited);
    }

    private boolean escapeRecurse(int y, int x, boolean[][] visited){
        if ( outOfBounds(y,x) ) return false;
        if ( isEscape(y,x) ) return true;
        if ( isWall(y,x) ) return false;
        if ( visited[y][x] ) return false;
        visited[y][x] = true;

        return escapeRecurse( y+1, x, visited) || escapeRecurse( y, x+1, visited)
                || escapeRecurse( y-1, x, visited) || escapeRecurse( y, x-1, visited);
    }

    public boolean outOfBounds( int y, int x){
        return ( y >= layout.length || y < 0 || x < 0 || x >= layout[0].length );
    }

    public boolean isWall( int y, int x){
        return layout[y][x] == '*';
    }

    public boolean isEdge( int y, int x){
        return ( y == layout.length-1 || y == 0 ) || ( x == 0 || x == layout[0].length-1 );
    }

    public boolean isEscape( int y, int x){
        return isEdge(y,x) && !isWall(y,x);
    }

    public void print()
    {
        for(int i = 0; i < layout.length; i++)
        {
            for(int j = 0; j < layout[i].length; j++)
            {
                System.out.printf("%c ", layout[i][j]);
            }
            System.out.println();
        }
    }
}

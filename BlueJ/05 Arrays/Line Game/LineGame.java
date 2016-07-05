import java.util.Scanner;

public class LineGame
{
    private char[] symbols;
    private Scanner input = new Scanner(System.in);
    
    private char player = '☹';
    private int playerPos = 0;
    
    public LineGame()
    {
        symbols = new char[25];
        
        for ( int i = 0; i < symbols.length; i++ )
        {
            symbols[i] = '-';
        }
        
        main();
    }
    
    public void main()
    {
        boolean done = false;
        while ( !done )
        {
            draw();
            System.out.println( "\nPlayer position: " + playerPos );
            System.out.println( "LEFT or RIGHT?" );
            String choice = input.nextLine();
            
             if ( choice.equals( "L" ) )
            {
                playerPos--;
            }
            else if ( choice.equals( "R" ) )
            {
                playerPos++;
            }
        }
    }
    
    public void draw()
    {
        System.out.println("\f");
        for ( int i = 0; i < symbols.length; i++ )
        {
            if ( i == playerPos )
            {
                System.out.print( player );
            }
            else
            {
                System.out.print( symbols[i] );
            }
        }
    }
}

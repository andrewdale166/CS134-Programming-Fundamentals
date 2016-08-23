
public class SimpleLoops
{
    public static void main()
    {
        System.out.print( "\n Simple for loop, ++ \n\t" );
        
        for ( int i = 0; i <= 10; i++ )
        {
            System.out.print( i + " " );
        }
        
        System.out.print( "\n Simple for loop, -- \n\t" );
        
        for ( int i = 10; i >= 0; i-- )
        {
            System.out.print( i + " " );
        }
        
        System.out.print( "\n Simple for loop, += 2 \n\t" );
        
        for ( int i = 0; i < 10; i += 2 )
        {
            System.out.print( i + " " );
        }
        
        System.out.print( "\n Simple for loop, -= 3 \n\t" );
        
        for ( int i = 10; i >= 0; i -= 3 )
        {
            System.out.print( i + " " );
        }
    }
}

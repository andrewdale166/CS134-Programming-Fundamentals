import java.util.Scanner;

public class StringLooper
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print( "Enter a string: " );
        String text = input.nextLine();
        
        System.out.println( "Letters:" );
        for ( int i = 0; i < text.length(); i++ )
        {
            System.out.println( "Letter " + i + ": " 
                + text.charAt( i ) );
        }
    }
}

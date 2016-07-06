import java.util.Scanner;

public class MadLib
{
    private Scanner input = new Scanner(System.in);
    private String[] nouns;
    private String[] adjectives;
    private String[] verbs;
    
    public MadLib()
    {
        nouns = new String[3];
        adjectives = new String[2];
        verbs = new String[4];
        
        GetWords();
        PrintStory();
    }
    
    public void GetWords()
    {
        for ( int n = 0; n < 3; n++ )
        {
            nouns[n] = new String();
            System.out.print( "Enter noun " + n + ": " );
            nouns[n] = input.nextLine();
        }
        
        for ( int a = 0; a < 2; a++ )
        {
            adjectives[a] = new String();
            System.out.print( "Enter adjective " + a + ": " );
            adjectives[a] = input.nextLine();
        }
        
        for ( int v = 0; v < 4; v++ )
        {
            verbs[v] = new String();
            if ( v == 0 )
            {
                System.out.print( "Enter verb " + v + ": " );
            }
            else
            {
                System.out.print( "Enter past-tense verb " + v + ": " );
            }
            verbs[v] = input.nextLine();
        }
    }
    
    public void PrintStory()
    {
        System.out.println( "Once upon a time there was a "
            + adjectives[0] + " " + nouns[0] + " who wanted to "
            + verbs[0] + " like a " + nouns[1] + "." );
         
        System.out.println( "Unfortunately, " + nouns[2]
            + " always got in the way by being too " + adjectives[1] + "." );
           
        System.out.println( "To fix this, the " + nouns[0]
            + " decided to " + verbs[1] + " and " + verbs[2]
            + " until finally they were able to " + verbs[0] + "." );
        
        System.out.println( "When the " + nouns[2] + " found out, it "
            + verbs[3] + "." );
        
        System.out.println( "\nThe End\n" );
    }
}

import java.util.Random;

public class Program
{    
    static Random generator = new Random();
    
    public static String getNoun()
    {
        int rand = generator.nextInt( 5 );
        
        if ( rand == 0 )
        {
            return "Julie";
        }
        else if ( rand == 1 )
        {
            return "racetrack";
        }
        else if ( rand == 2 )
        {
            return "Babylonean garden";
        }
        else if ( rand == 3 )
        {
            return "Chick Fil A";
        }
        else
        {
            return "detention";
        }
    }
    
    public static String getAdjective()
    {
        int rand = generator.nextInt( 5 );
        
        if ( rand == 0 )
        {
            return "fuzzy";
        }
        else if ( rand == 1 )
        {
            return "blue";
        }
        else if ( rand == 2 )
        {
            return "moist";
        }
        else if ( rand == 3 )
        {
            return "beautiful";
        }
        else
        {
            return "annoying";
        }
    }
    
    public static String getVerb()
    {
        int rand = generator.nextInt( 5 );
        
        if ( rand == 0 )
        {
            return "jumps";
        }
        else if ( rand == 1 )
        {
            return "runs";
        }
        else if ( rand == 2 )
        {
            return "dances";
        }
        else if ( rand == 3 )
        {
            return "sits";
        }
        else
        {
            return "programs";
        }
    }
    
    public static void main()
    {
        String poem = "";
        
        poem += "The " + getAdjective() + " "
            + getNoun() + " " + getVerb() + "\n";
        poem += "The " + getAdjective() + " "
            + getNoun() + " " + getVerb() + "\n";
        poem += "The " + getAdjective() + " "
            + getNoun() + " " + getVerb() + "\n";
            
        System.out.println( poem );
    }
}




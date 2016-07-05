import java.util.Scanner;

public class Twitter
{
    Scanner input = new Scanner( System.in );
    Tweet latest = new Tweet();
    
    public Twitter()
    {
        mainMenu();
    }
    
    public void mainMenu()
    {
        boolean done = false;
        
        while ( !done )
        {
            System.out.println( "" );
            System.out.println( "1. View latest tweet" );
            System.out.println( "2. Like latest tweet" );
            System.out.println( "3. Write new tweet" );
            System.out.println( "4. Quit" );
            
            int choice = input.nextInt();
            
            if ( choice == 1 )
            {
                latest.display();
            }
            else if ( choice == 2 )
            {
                latest.like();
            }
            else if ( choice == 3 )
            {
                latest.writeTweet();
            }
            else if ( choice == 4 )
            {
                done = true;
            }
        }
    }
}

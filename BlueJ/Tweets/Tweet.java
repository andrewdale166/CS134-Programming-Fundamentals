import java.util.Scanner;

public class Tweet
{
    Scanner input = new Scanner( System.in );
    
    String author;
    int likeCount;
    String postText;
    
    public void writeTweet()
    {
        System.out.print( "What is your username? " );
        author = input.nextLine();
        
        System.out.print( "Post: " );
        postText = input.nextLine();
        
        while ( postText.length() > 150 )
        {
            System.out.println( "Too long! Try again" );
            
            System.out.print( "Post: " );
            postText = input.nextLine();
        }
        
        likeCount = 0;
    }
    
    public void display()
    {
        System.out.println( postText + "\n" + author );
        System.out.println( "Likes: " + likeCount );
    }
    
    public void like()
    {
        likeCount++;
    }
}

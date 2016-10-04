import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class EndWorld extends World
{
 
    public EndWorld( boolean youWon )
    {    
        super(600, 600, 1); 
        
        if ( youWon )
        {
            setBackground( "youwin.png" );
        }
        else
        {
            setBackground( "youlose.png" );
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Character
{
    public Player()
    {
        super( "girl" );
    }
    
    public void act() 
    {
        super.act();
        
        if ( Greenfoot.isKeyDown( "down" ) )
        {
            move( "south" );
        }
        else if ( Greenfoot.isKeyDown( "up" ) )
        {
            move( "north" );
        }
        
        if ( Greenfoot.isKeyDown( "left" ) )
        {
            move( "west" );
        }
        else if ( Greenfoot.isKeyDown( "right" ) )
        {
            move( "east" );
        }
        
    }    
}

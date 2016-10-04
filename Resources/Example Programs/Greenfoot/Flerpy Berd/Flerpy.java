import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Flerpy extends Actor
{
    int gravity;
    int upward;
    
    public Flerpy()
    {
        gravity = 5;
        upward = 5;
    }
    
    public void act() 
    {
        physics();
        
        if ( isTouching( Cat.class ) )
        {
            getWorld().showText( "Game Over", 200, 300 );
            Greenfoot.playSound( "ded.wav" );
            Greenfoot.stop();
        }
    }
    
    public void physics()
    {
        int x = getX();
        int y = getY();
        
        if ( Greenfoot.isKeyDown( "up" ) )
        {
            y -= upward;
            setRotation( -25 );
        }
        else
        {
        
        y += gravity;
        setRotation( 25 );
        }
        
        setLocation( x, y );
    }
}

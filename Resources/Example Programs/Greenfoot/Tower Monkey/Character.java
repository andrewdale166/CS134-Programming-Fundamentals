import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Character extends Actor
{
    int speed;
    
    public Character()
    {
        speed = 1;
    }
    
    public void act() 
    {
    }    
    
    public void move( String direction )
    {
        int x = getX();
        int y = getY();
        
        if ( direction.equals( "left" ) )
        {
            x -= speed;
        }
        else if ( direction.equals( "right" ) )
        {
            x += speed;
        }
        
        if ( direction.equals( "up" ) )
        {
            y -= speed;
        }
        else if ( direction.equals( "down" ) )
        {
            y += speed;
        }
        
        setLocation( x, y );
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Movable extends Actor
{
    public void act() 
    {
        fixCoordinates();
    }    
    
    public void fixCoordinates()
    {
        int x = getX();
        int y = getY();
        
        if ( x < 155 ) { x = 155; }
        if ( x > 445 ) { x = 445; }
        if ( y < 255 ) { y = 255; }
        if ( y > 445 ) { y = 445; }
        
        setLocation( x, y );
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Cat extends Actor
{
    int speed = 5;
    
    public Cat()
    {
    }
    
    public void act() 
    {
        int x = getX();
        int y = getY();
        
        x -= speed;
        
        if ( isAtEdge() && x < 100 )
        {
            getWorld().removeObject( this );
            return;
        }
        
        setLocation( x, y );
    }    
}

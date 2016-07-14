import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Paddle extends MovableObject
{
    public Paddle()
    {
        super();
        xVelocity = 0;
        yVelocity = 0;
    }
    
    public void act() 
    {
        if ( Greenfoot.isKeyDown( "left" ) )
        {
            xVelocity -= 1;
        }
        else if ( Greenfoot.isKeyDown( "right" ) )
        {
            xVelocity += 1;
        }
        else
        {
            deaccelerateX();
        }
        
        move();
    }
}

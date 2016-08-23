import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerCharacter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerCharacter extends Actor
{
    /**
     * Act - do whatever the PlayerCharacter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKeypress();
    }
    
    public void checkKeypress() 
    {
        int x = getX();
        int y = getY();
        int speed = 2;
        
        if ( Greenfoot.isKeyDown( "left" ) )
        {
            x -= speed;
        }
        else if ( Greenfoot.isKeyDown( "right" ) )
        {
            x += speed;
        }
        if ( Greenfoot.isKeyDown( "up" ) )
        {
            y -= speed;
        }
        else if ( Greenfoot.isKeyDown( "down" ) )
        {
            y += speed;
        }
        
        setLocation( x, y );
    }    
}

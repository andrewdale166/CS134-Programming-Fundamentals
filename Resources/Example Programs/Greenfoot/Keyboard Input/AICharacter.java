import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AICharacter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AICharacter extends Actor
{
    /**
     * Act - do whatever the AICharacter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Get elephant coordinates
        MyWorld theWorld = (MyWorld)getWorld();
        
        int goalX = theWorld.getPlayer().getX();
        int goalY = theWorld.getPlayer().getY();
        
        int x = getX();
        int y = getY();
        int speed = 1;
        
        if ( x < goalX )
        {
            x += speed;
        }
        else if ( x > goalX )
        {
            x -= speed;
        }
        if ( y < goalY )
        {
            y += speed;
        }
        else if ( y > goalY )
        {
            y -= speed;
        }
        
        setLocation( x, y );
    }    
}

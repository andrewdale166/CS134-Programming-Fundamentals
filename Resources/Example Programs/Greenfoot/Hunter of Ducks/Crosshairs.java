import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crosshairs extends Actor
{
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        if ( mouse == null ) { return; }
        
        setLocation( mouse.getX(), mouse.getY() );
    }    
}

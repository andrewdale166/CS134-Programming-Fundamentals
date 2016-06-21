import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TurnAroundCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TurnAroundCar extends Actor
{
    /**
     * Act - do whatever the TurnAroundCar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(10);
        
        if (getX() > 500)
        {
            turn(180);
        }
        if (getX() < 100)
        {
            turn(180);
        }
    }    
}

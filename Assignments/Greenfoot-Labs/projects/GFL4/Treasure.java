import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Treasure extends Actor
{
    int points;
    
    public Treasure( int pointCount )
    {
        points = pointCount;
    }
    
    public int getPoints()
    {
        return points;
    }
    
    public void act() 
    {
    }    
    
    public void randomlyPlace()
    {
        MyWorld world = (MyWorld)getWorld();
        int x = Greenfoot.getRandomNumber( world.getScreenWidth() );
        int y = Greenfoot.getRandomNumber( world.getScreenHeight() );
        setLocation( x, y );
    }
}

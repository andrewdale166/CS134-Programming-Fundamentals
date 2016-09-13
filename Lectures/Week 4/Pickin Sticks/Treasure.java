import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Treasure extends Actor
{
    int points;
    
    public Treasure()
    {
    }
    
    public void setPoints( int pointCount )
    {
        points = pointCount;
        if ( points == 0 )
        {
            setImage( "flower.png" );
            points = 2;
        }
        else if ( points == 10 )
        {
            setImage( "candy.png" );
        }
        else if ( points == 20 )
        {
            setImage( "gold.png" );
        }
        else
        {
            setImage( "gem.png" );
        }
    }
    
    public int getPoints()
    {
        return points;
    }
    
    public void act() 
    {
    }    
    
    public void generateTreasure()
    {
        MyWorld world = (MyWorld)getWorld();
        int x = Greenfoot.getRandomNumber( 600 );
        int y = Greenfoot.getRandomNumber( 400 );
        setLocation( x, y );
        
        int points = Greenfoot.getRandomNumber( 4 ) * 10;
        setPoints( points );
    }
}

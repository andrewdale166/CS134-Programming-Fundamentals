import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ant extends Actor
{
    int speed;
    int score;
    
    Ant followme;
    
    public Ant()
    {
        speed = 5;
        score = 0;
        followme = null;
    }
    
    public void setFollow(Ant leader)
    {
        followme = leader;
        speed = 2;
    }
    
    public void act() 
    {
        if ( followme == null )
        {
            moveLeader();
        }
        else
        {
            moveFollower();
        }
        
        if ( isTouching( Food.class ) )
        {
            score += 1;
            MyWorld w = (MyWorld)getWorld();
            w.moveFood();
            w.addFollower(this);
        }
    } 
    
    public void moveLeader()
    {
        if ( Greenfoot.isKeyDown( "down" ) )
        {
            setRotation( 90 );
        }
        else if ( Greenfoot.isKeyDown( "up" ) )
        {
            setRotation( -90 );
        }
        else if ( Greenfoot.isKeyDown( "right" ) )
        {
            setRotation( 0 );
        }
        else if ( Greenfoot.isKeyDown( "left" ) )
        {
            setRotation( 180 );
        }
        
        move( speed );
        
        getWorld().showText( "Score: " + score, 50, 20 );
    }
    
    public void moveFollower()
    {
        turnTowards( followme.getX(), followme.getY() );
        move(speed);
    }
}

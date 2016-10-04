import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Duck extends Actor
{
    int destinationX;
    int destinationY;
    int speed;
    
    public Duck()
    {
        Greenfoot.playSound( "FlyUp.wav" );
        destinationY = 0;
        destinationX = Greenfoot.getRandomNumber( 256 * 2 );
        speed = Greenfoot.getRandomNumber( 7 ) + 1;
    }
    
    public void act() 
    {
        turnTowards( destinationX, destinationY );
        move( speed );
        
        if ( getY() <= 10 )
        {
            Greenfoot.playSound( "Caw.wav" );
            MyWorld world = (MyWorld)getWorld();
            world.AddToMissed();
            world.removeObject( this );
            return;
        }
        
        if ( Greenfoot.mouseClicked( this ) )
        {
            Greenfoot.playSound( "Shoot.wav" );
            MyWorld world = (MyWorld)getWorld();
            world.AddToScore();
            world.removeObject( this );
            return;            
        }
    }    
}

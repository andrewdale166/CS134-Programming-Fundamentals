import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Monster extends MovableObject
{
    int direction;
    int moveCountdown;
    
    public Monster()
    {
        moveCountdown = 0;
        speed = 1;
    }
    
    public void act() 
    {        
        if ( moveCountdown == 0 )
        {
            // Decide new direction
            direction = Greenfoot.getRandomNumber( 4 );
            moveCountdown = 100;
        }
        
        if ( direction == 0 )
        {
            move( "north" );
        }
        else if ( direction == 1 )
        {
            move( "south" );
        }
        else if ( direction == 2 )
        {
            move( "west" );
        }
        else if ( direction == 3 )
        {
            move( "east" );
        }
        
        moveCountdown--;
    }    
}

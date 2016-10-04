import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Pizza extends Character
{
    String direction;
    boolean touchingGround;
    
    public Pizza()
    {
        direction = "right";
        speed = 2;
        touchingGround = true;
    }
    
    public void act() 
    {
        int y = getY();
        
        if ( y >= 490 )
        {
            MyWorld world = (MyWorld)getWorld();
            world.addToScore();
            getWorld().removeObject( this );
            return;
        }
        
        if ( y <= 100 )
        {
            direction = "left";
        }
        else if ( y <= 200 )
        {
            direction = "right";
        }
        else if ( y <= 300 )
        {
            direction = "left";
        }
        else if ( y <= 400 )
        {
            direction = "right";
        }
        else
        {
            direction = "left";
        }
        
        if ( !isTouching( Tile.class ) )
        {
            // Gravity
            move( "down" );
            touchingGround = false;
        }
        else
        {            
            if ( touchingGround == false )
            {
                touchingGround = true;
                //Greenfoot.playSound( "land.wav" );
            }
            
            
            move( direction );
            
            if ( direction.equals( "left" ) )
                turn( -5 );
            else
                turn( 5 );
        }
    }    
}

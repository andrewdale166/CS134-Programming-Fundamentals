import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ball extends MovableObject
{
    int startX, startY;
    
    public Ball( int x, int y )
    {
        super();
        startX = x;
        startY = y;
        reset();
    }
    
    public void act() 
    {
        move();
        
        if ( checkCollisionWithPaddle() ) { return; }
        if ( checkCollisionWithBrick() ) { return; }
    }
    
    public void reset()
    {
        faceDown();
        xVelocity = 0;
        yVelocity = 2;
        setLocation( startX, startY );
    }
    
    public boolean checkCollisionWithPaddle()
    {
        Paddle collidePaddle = (Paddle)getOneIntersectingObject( Paddle.class );
        
        if ( collidePaddle != null )
        {
            yVelocity = -yVelocity;
            if ( xVelocity < 1.0 && xVelocity > -1.0 )
            {
                xVelocity = collidePaddle.getXVelocity();
            }
            accelerateY();

            Greenfoot.playSound( "Pickup_Coin11.wav" );
            return true;
        }
        return false;
    }
    
    public boolean checkCollisionWithBrick()
    {
        Brick collideBrick = (Brick)getOneIntersectingObject( Brick.class );
        
        if ( collideBrick != null )
        {
            yVelocity = -yVelocity;
            accelerateY();
           
            if ( getX() < collideBrick.getX() )
            {
                xVelocity -= 0.5;
            }
            else if ( getX() > collideBrick.getX() )
            {
                xVelocity += 0.5;
            }
            
            getWorld().removeObject( collideBrick );
            
            Greenfoot.playSound( "Hit_Hurt16.wav" );
            return true;
        }
        return false;
    }
}

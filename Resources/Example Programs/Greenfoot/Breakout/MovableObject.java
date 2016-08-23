import greenfoot.*;

public class MovableObject extends Actor
{
    protected double xVelocity;
    protected double yVelocity;
    
    public double getXVelocity() { return xVelocity; }
    
    protected boolean active;
    
    public MovableObject() { active = true; }
    public void deactivate() { active = false; }    
    public void faceUp() { setRotation( -90 ); }    
    public void faceDown() { setRotation( 90 ); }
    public void faceLeft() { setRotation( 180 ); }
    public void faceRight() { setRotation( 0 ); }
    
    public void move()
    {
        if ( active == false ) { return; }
        
        int x = getX();
        int y = getY();
        
        x += xVelocity;
        y += yVelocity;
        
        if ( x <= 0 || x >= getWorld().getWidth() )
        {
            xVelocity = -xVelocity;
        }
        if ( y <= 0 || y >= getWorld().getHeight() )
        {
            yVelocity = -yVelocity;
        }
        
        setLocation( x, y );
    }
    
    public void deaccelerateX()
    {
        if ( xVelocity > 0.5 )
        {
            xVelocity -= 0.5;
        }
        else if ( xVelocity < -0.5 )
        {
            xVelocity += 0.5;
        }
        else
        {
            xVelocity = 0;
        }
    }
    
    public void accelerateX()
    {
        if ( xVelocity > 0.5 )
        {
            xVelocity += 0.5;
        }
        else if ( xVelocity < -0.5 )
        {
            xVelocity -= 0.5;
        }        
    }
    
    public void accelerateY()
    {
        if ( yVelocity > 0.5 )
        {
            yVelocity += 0.5;
        }
        else if ( yVelocity < -0.5 )
        {
            yVelocity -= 0.5;
        }        
    }
}

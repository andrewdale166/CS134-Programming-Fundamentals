import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BulletB extends Bullet
{
    int moveTimer;
    int rotationAngle;
    
    public BulletB()
    {
        moveTimer = 0;
        rotationAngle = 45;
    }
    
    public void act() 
    {
        super.act();
        
        moveTimer++;
        
        int x = getX();
        int y = getY();
        
        setLocation( x, y );
        
        rotationAngle--;
        if ( rotationAngle < 10 )
        {
            rotationAngle = 10;
        }
        
        if ( moveTimer > 50 )
        {
            setRotation( 90 );
            move( 5 );
        }
        else
        {
            turn( rotationAngle );
            move( 5 );
        }
        
        if ( y >= 440 )
        {
            getWorld().removeObject( this );
            return;
        }
    }    
}

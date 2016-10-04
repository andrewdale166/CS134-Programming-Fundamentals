import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BulletA extends Bullet
{
    int jiggleTimer;
    
    public BulletA()
    {
        jiggleTimer = 0;
    }
    
    public void act() 
    {
        super.act();
        
        jiggleTimer++;
        
        int x = getX();
        int y = getY();
        
        if ( jiggleTimer < 10 )
        {
            x++;
        }
        else if ( jiggleTimer < 20 )
        {
            x--;
        }
        else
        {
            jiggleTimer = 0;
        }
        
        y++;
        
        setLocation( x, y );
        
        if ( y >= 440 )
        {
            getWorld().removeObject( this );
            return;
        }
    }    
}

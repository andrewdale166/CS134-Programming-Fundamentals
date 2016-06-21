import greenfoot.*;

public class Player extends Actor
{

    public void act() 
    {
        MyWorld w = (MyWorld)getWorld();
        
        if ( w.gameOver == false )
        {
            int x = getX();
            int y = getY();
            int speed = 5;
            
            if ( Greenfoot.isKeyDown( "left" ) )
            {
                x -= speed;
            }
            else if ( Greenfoot.isKeyDown( "right" ) )
            {
                x += speed;
            }
            
            if ( Greenfoot.isKeyDown( "up" ) )
            {
                y -= speed;
            }
            else if ( Greenfoot.isKeyDown( "down" ) )
            {
                y += speed;
            }
            
            setLocation( x, y );
        }
    }    
}

import greenfoot.*;


public class Enemy extends Actor
{

    public void act() 
    {
        MyWorld w = (MyWorld)getWorld();
        int playerX = w.player.getX();
        int playerY = w.player.getY();
        
        int x = getX();
        int y = getY();
        int speed = 3;
        
        if ( playerX < x )
        {
            x -= speed;
        }
        else if ( playerX > x )
        {
            x += speed;
        }
        if ( playerY < y )
        {
            y -= speed;
        }
        else if ( playerY > y )
        {
            y += speed;
        }
        
        setLocation( x, y );
    }    
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class MovableObject extends Actor
{
    int speed;
    
    public void act() 
    {
    }    
    
    public void move( String direction )
    {
        int x = getX();
        int y = getY();
        if ( direction.equals("north" ) )
        {
            setLocation( getX(), getY() - speed );
        }
        else if ( direction.equals( "south" ) )
        {
            setLocation( getX(), getY() + speed );
        }
        else if ( direction.equals( "east" ) )
        {
            setLocation( getX() + speed, getY() );
        }
        else if ( direction.equals( "west" ) )
        {
            setLocation( getX() - speed, getY() );
        }
        
        // Check collision
        boolean isCollision = false;
        List<Tile> collisions = getIntersectingObjects( Tile.class );
        
        for ( int i = 0; i < collisions.size(); i++ )
        {
            if ( collisions.get(i).getIsSolid() )
            {
                isCollision = true;
                break;
            }
        }
        
        if ( isCollision )
        {
            setLocation( x, y );
        }
    }
}

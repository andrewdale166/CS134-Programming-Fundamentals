import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bullet extends MovableObject
{
    public Bullet()
    {
        speed = 10;
    }
    
    public void act() 
    {
        moveUp();
        
        if ( isAtEdge() || handleCollision() )
        {
            getWorld().removeObject( this );
            return;
        }
    } 
    
    public boolean handleCollision()
    {
        Invader collided = (Invader)getOneIntersectingObject( Invader.class );
        MyWorld world = (MyWorld)getWorld();
        
        if ( collided != null )
        {
            world.removeEnemy( collided );
            return true;
        }
        return false;
    }
}

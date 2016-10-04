import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BulletC extends Bullet
{
    int lifeTimer;
    
    public BulletC()
    {
        lifeTimer = 150;
    }
    
    public void act() 
    {
        super.act();
        
        MyWorld world = (MyWorld)getWorld();
        Player player = world.getPlayer();
        
        turnTowards( player.getX(), player.getY() );
        move(2);
        
        lifeTimer--;
        
        if ( lifeTimer == 0 )
        {
            world.removeObject( this );
            return;
        }
    }    
}

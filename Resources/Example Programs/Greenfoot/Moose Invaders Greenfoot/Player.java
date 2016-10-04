import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends MovableObject
{
    private int m_bulletCooldown;
    
    public Player()
    {
        speed = 3;
        m_bulletCooldown = 0;
    }
    
    public void act() 
    {
        checkInput();
        
        if ( m_bulletCooldown > 0 )
        {
            m_bulletCooldown--;
        }
    }    
    
    public void checkInput()
    {
        if ( Greenfoot.isKeyDown( "left" ) )
        {
            moveLeft();
        }
        else if ( Greenfoot.isKeyDown( "right" ) )
        {
            moveRight();
        }
        
        if ( Greenfoot.isKeyDown( "space" ) && m_bulletCooldown == 0 )
        {
            Greenfoot.playSound( "Laser.wav" );
            shoot();
        }
    }
    
    public void shoot()
    {
        MyWorld world = (MyWorld)getWorld();
        world.addBullet( getX(), getY() );
        m_bulletCooldown = 20;
    }
}

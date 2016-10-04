import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Invader extends MovableObject
{
    private boolean m_isMovingRight;
    private String[] m_frames;
    private double m_currentFrame;
    
    public Invader()
    {
        speed = 1;
        m_isMovingRight = true;
        m_currentFrame = 0.0;
        m_frames = new String[2];
        m_frames[0] = "invader1.png";
        m_frames[1] = "invader1b.png";
    }
    
    public void act() 
    {
        if ( m_isMovingRight )
        {
            moveRight();
        }
        else
        {
            moveLeft();
        }
        
        if ( isAtEdge() )
        {
            m_isMovingRight = !m_isMovingRight;
            int x = getX();
            int y = getY() + getImage().getHeight();
            setLocation( x, y );
        }
        
        checkCollisionWithPlayer();
        
        updateAnimation();        
    } 
    
    public void checkCollisionWithPlayer()
    {
        Player collided = (Player)getOneIntersectingObject( Player.class );
        MyWorld world = (MyWorld)getWorld();
        
        if ( collided != null )
        {
            world.gotoYouLose();
        }
    }
    
    public void updateAnimation()
    {
        m_currentFrame += 0.05;
        if ( m_currentFrame >= 2.0 )
        {
            m_currentFrame = 0.0;
        }
        setImage( m_frames[ (int)m_currentFrame ] );
    }
}

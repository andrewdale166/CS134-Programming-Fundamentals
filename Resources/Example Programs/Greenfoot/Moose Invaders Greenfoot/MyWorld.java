import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    private Invader[] m_invaders;
    private Player m_player;
    private int m_score;
    
    public MyWorld()
    {    
        super(600, 600, 1); 
        
        m_player = new Player();
        addObject( m_player, getWidth()/2, getHeight() - 64 );
        
        m_score = 0;
        
        m_invaders = new Invader[21];
        
        for ( int i = 0; i < m_invaders.length; i++ )
        {
            m_invaders[i] = new Invader();
        }
        
        setupInvaders();
    }
    
    public void gotoYouWin()
    {
        EndWorld nextState = new EndWorld( true );
        Greenfoot.setWorld( nextState );
    }
    
    public void gotoYouLose()
    {
        EndWorld nextState = new EndWorld( false );
        Greenfoot.setWorld( nextState );
    }
    
    public void act()
    {
        showText( "Score: " + m_score, 60, getHeight() - 20 );
        
        int invaderCount = getObjects( Invader.class ).size();
        if ( invaderCount == 0 )
        {
            gotoYouWin();
        }
    }
    
    public void setupInvaders()
    {
        int index = 0;
        int w = m_invaders[0].getImage().getWidth() + 10;
        int h = m_invaders[0].getImage().getHeight() * 2;
        
        for ( int y = 0; y < 3; y++ )
        {
            for ( int x = 0; x < 7; x++ )
            {
                addObject( m_invaders[index], x * w + 64, y * h + 64 );
                index++;
            }
        }
    }
    
    public void addBullet( int x, int y )
    {
        addObject( new Bullet(), x, y );
    }
    
    public void removeEnemy( Invader invader )
    {
        Greenfoot.playSound( "Explosion.wav" );
        m_score += 10;
        removeObject( invader );
    }
}

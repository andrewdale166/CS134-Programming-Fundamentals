import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    BattleBorder border;
    Player player;
    int bulletTimer;
    int rounds;
    
    public MyWorld()
    {    
        super(600, 500, 1); 
        
        border = new BattleBorder();
        player = new Player();
        bulletTimer = 0;
        rounds = 1;
        
        addObject( border, 300, 350 );
        addObject( player, 300, 350 );
    }
    
    public Player getPlayer()
    {
        return player;
    }
    
    public void act()
    {
        bulletTimer++;
        
        if ( bulletTimer == 100 )
        {
            bulletFormation1();
        }
        else if ( bulletTimer == 200 )
        {
            bulletFormation2();
        }
        else if ( bulletTimer == 300 )
        {
            bulletFormation3();
        }
        else if ( bulletTimer >= 300 )
        {
            bulletTimer = 0;
            rounds++;
        }
        
        showText( "Round " + rounds, 200, 470 );
        
        if ( rounds == 5 )
        {
            showText( "You win!", 300, 300);
            Greenfoot.stop();
        }
    }
    
    public void bulletFormation1()
    {
        Greenfoot.playSound( "Powerup6.wav" );
        addObject( new BulletA(), 160, 250 );
        addObject( new BulletA(), 250, 250 );
        addObject( new BulletA(), 350, 250 );
        addObject( new BulletA(), 440, 250 );
    }
    
    public void bulletFormation2()
    {
        Greenfoot.playSound( "Powerup5.wav" );
        addObject( new BulletB(), 200, 350 );
        addObject( new BulletB(), 400, 350 );
    }
    
    public void bulletFormation3()
    {
        Greenfoot.playSound( "Powerup4.wav" );
        addObject( new BulletC(), 160, 260 );
        addObject( new BulletC(), 160, 360 );
        addObject( new BulletC(), 440, 260 );
        addObject( new BulletC(), 440, 360 );
    }
}

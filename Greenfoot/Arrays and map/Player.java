import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends MovableObject
{
    boolean isAlive;
    
    public Player()
    {
        speed = 2;
        isAlive = true;
    }
    
    public void act() 
    {
        if ( isAlive == false ) { return; }
        handleKeyboard();
        checkGemCollision();
        checkMonsterCollision();
    }    
    
    public void checkGemCollision()
    {
        Gem collide = (Gem)getOneIntersectingObject( Gem.class );
        if ( collide != null )
        {
            MyWorld world = (MyWorld)getWorld();
            world.collectGem();
        }
    }
    
    public void checkMonsterCollision()
    {
        Monster collide = (Monster)getOneIntersectingObject( Monster.class );
        if ( collide != null )
        {
            isAlive = false;
            Greenfoot.playSound( "explode.wav" );
            gotoGameOver();
        }
    }
    
    public void gotoGameOver()
    {
        GameOverWorld nextState = new GameOverWorld();
        Greenfoot.setWorld( nextState );
    }
    
    public void handleKeyboard()
    {
        if ( Greenfoot.isKeyDown( "up" ) ) { 
            move( "north" ); 
            setImage( "girl-up.png" );
        }
            
        if ( Greenfoot.isKeyDown( "down" ) ) { 
            move( "south" ); 
            setImage( "girl-down.png" );
        }
            
        if ( Greenfoot.isKeyDown( "left" ) ) { 
            move( "west" ); 
            setImage( "girl-left.png" );
        }
            
        if ( Greenfoot.isKeyDown( "right" ) ) { 
            move( "east" ); 
            setImage( "girl-right.png" );
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Character
{
    int jumpTimer;
    boolean hasHitGround;
    
    public Player()
    {
        speed = 2;
        jumpTimer = 0;
        hasHitGround = true;
    }
    
    public void act() 
    {
        handleKeyboard();
        
        if ( jumpTimer > 0 )
        {
            move( "up" );
            jumpTimer--;
        }
        else
        {
            if ( !isTouching( Ladder.class ) && !isTouching( Tile.class ) )
            {
                // Gravity
                move( "down" );
            }
            else if ( isTouching( Tile.class ) )
            {
                if ( hasHitGround == false )
                {
                }
                hasHitGround = true;
            }
        }
   
        MyWorld world = (MyWorld)getWorld();
        
        if ( isTouching( Pizza.class ) || getY() >= 490 )
        {
            setRotation( -90 );
            Greenfoot.playSound( "die.wav" );
            world.gameOver();
        }
        
        if ( isTouching( Princess.class ) )
        {
            world.youWin();
        }
    }    
    
    public void handleKeyboard()
    {
        if ( Greenfoot.isKeyDown( "left" ) )
        {
            move( "left" );
            setImage( "lilguy-left.png" );
        }
        
        else if ( Greenfoot.isKeyDown( "right" ) )
        {
            move( "right" );
            setImage( "lilguy.png" );
        }
        
        if ( Greenfoot.isKeyDown( "up" ) && isTouching( Ladder.class ) )
        {
            move( "up" );
        }
        else if ( Greenfoot.isKeyDown( "up" ) && jumpTimer == 0 && hasHitGround )
        {
            // Jump
            jumpTimer = 20;
            hasHitGround = false;
            Greenfoot.playSound( "jump.wav" );
        }
        
        if ( Greenfoot.isKeyDown( "down" ) && isTouching( Ladder.class ) )
        {
            move( "down" );
        }
    }
}

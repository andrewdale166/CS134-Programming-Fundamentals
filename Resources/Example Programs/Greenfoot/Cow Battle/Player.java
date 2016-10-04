import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Movable
{
    int speed;
    int hp;
    int hurtCooldown;
    
    public Player()
    {
        speed = 2;
        hp = 20;
        hurtCooldown = 0;
    }
    
    public void act() 
    {
        super.act();
        handleKeyboard();
        getWorld().showText( hp + "/20", 400, 470 );
        
        if ( isTouching( BulletA.class ) && hurtCooldown == 0 )
        {
            hp -= 1;
            hurtCooldown = 20;
            Greenfoot.playSound( "hurt.wav" );
        }
        else if ( isTouching( BulletB.class ) && hurtCooldown == 0 )
        {
            hp -= 2;
            hurtCooldown = 20;
            Greenfoot.playSound( "hurt.wav" );
        }
        else if ( isTouching( BulletC.class ) && hurtCooldown == 0 )
        {
            hp -= 3;
            hurtCooldown = 20;
            Greenfoot.playSound( "hurt.wav" );
        }
        
        if ( hurtCooldown > 0 )
        {
            hurtCooldown -= 1;
        }
        
        if ( hp <= 0 )
        {
            getWorld().showText( "You lose!", 300, 300);
            Greenfoot.stop();
        }
    }    
    
    public void handleKeyboard()
    {
        int x = getX();
        int y = getY();
        
        if ( Greenfoot.isKeyDown( "up" ) )
        {
            y -= speed;
        }
        else if ( Greenfoot.isKeyDown( "down" ) )
        {
            y += speed;
        }
        
        if ( Greenfoot.isKeyDown( "left" ) )
        {
            x -= speed;
        }
        else if ( Greenfoot.isKeyDown( "right" ) )
        {
            x += speed;
        }
        
        setLocation( x, y );
    }
}

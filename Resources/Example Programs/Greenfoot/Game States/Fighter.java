import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Fighter extends Actor
{
    int playerNumber;
    int speed;
    int attackCooldown;
    int hurtCooldown;
    int hp;
    String name;
    
    public Fighter( int player )
    {
        playerNumber = player;
        speed = 2;
        attackCooldown = 0;
        hurtCooldown = 0;
        hp = 100;
        
        if ( playerNumber == 1 ) { 
            name = "bunny"; 
        }
        else { 
            name = "cat"; 
        }
        
    }
    
    public boolean isAttacking()
    {
        return ( attackCooldown > 0 );
    }
    
    public void hurt( int amount )
    {
        if ( hurtCooldown > 0 ) { return; }
        hp -= amount;
        hurtCooldown = 50;
    }
    
    public int getHP()
    {
        return hp;
    }
    
    public void act() 
    {
        if ( hp <= 0 ) { die(); return; }
        
        handleInput();
        checkCollision();
        
        if ( attackCooldown > 0 )
        {
            attackCooldown--;
            if ( attackCooldown == 0 )
            {
                setImage( name + "_idle.png" );
            }
        }
        
        if ( hurtCooldown > 0 )
        {
            hurtCooldown--;
        }
        
        showStats();
    }    
    
    public void showStats()
    {
        if ( playerNumber == 1 ) { 
            getWorld().showText( "Bunny", 100, 25 );
            getWorld().showText( hp + "%", 100, 50 );
        }
        else { 
            getWorld().showText( "Cat", 500, 25 );
            getWorld().showText( hp + "%", 500, 50 );
        }
    }
    
    public void die()
    {
        setImage( name + "_dead.png" );
    }
    
    public void checkCollision()
    {
        Fighter collide = (Fighter)getOneIntersectingObject( Fighter.class );
        
        if ( collide != null )
        {
            if ( collide.isAttacking() )
            {
                hurt( Greenfoot.getRandomNumber( 10 ) );
                
                // push back
                if ( getX() < collide.getX() )
                {
                    setLocation( getX() - 10, getY() );
                }
                else if ( getX() > collide.getX() )
                {
                    setLocation( getX() + 10, getY() );
                }
            }
            
            if ( isAttacking() )
            {
                collide.hurt( Greenfoot.getRandomNumber( 10 ) );
            }
        }
    }
    
    public void handleInput()
    {
        int x = getX();
        int y = getY();
        
        if ( playerNumber == 1 )
        {
            if ( Greenfoot.isKeyDown( "a" ) )
            {
                x -= speed;
            }
            
            else if ( Greenfoot.isKeyDown( "d" ) )
            {
                x += speed;
            }
            
            if ( Greenfoot.isKeyDown( "w" ) )
            {
                punch();
            }
            
            if ( Greenfoot.isKeyDown( "s" ) )
            {
                kick();
            }
        }
        else if ( playerNumber == 2 )
        {
            if ( Greenfoot.isKeyDown( "left" ) )
            {
                x -= speed;
            }
            
            else if ( Greenfoot.isKeyDown( "right" ) )
            {
                x += speed;
            }
            
            if ( Greenfoot.isKeyDown( "up" ) )
            {
                punch();
            }
            
            if ( Greenfoot.isKeyDown( "down" ) )
            {
                kick();
            }
        }
        
        setLocation( x, y );
    }
    
    public void punch()
    {
        if ( attackCooldown <= 0 )
        {
            setImage( name + "_punch.png" );
            attackCooldown = 50;
        }
    }
    
    public void kick()
    {
        if ( attackCooldown <= 0 )
        {
            setImage( name + "_kick.png" );
            attackCooldown = 50;
        }
    }
}

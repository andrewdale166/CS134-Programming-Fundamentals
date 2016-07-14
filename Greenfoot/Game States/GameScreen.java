import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameScreen extends World
{
    Fighter[] fighters;
    int gameoverCooldown;
    
    public GameScreen()
    {    
        super(600, 400, 1); 
        fighters = new Fighter[2];
        
        fighters[0] = new Fighter( 1 );
        fighters[0].setImage( "bunny_idle.png" );
        addObject( fighters[0], 100, 300 );
        
        fighters[1] = new Fighter( 2 );      
        fighters[1].setImage( "cat_idle.png" );  
        addObject( fighters[1], 500, 300 );
        
        gameoverCooldown = 0;
    }
    
    public void act()
    {
        if ( gameoverCooldown > 0 )
        {
            gameoverCooldown--;
            
            if ( gameoverCooldown == 0 )
            {
                gotoMainMenu();
            }
        }
        
        else if ( fighters[0].getHP() <= 0 || fighters[1].getHP() <= 0 )
        {
            showText( "Game Over", getWidth()/2, getHeight()/2 );
            gameoverCooldown = 100;
        }
    }
    
    public void gotoMainMenu()
    {
        TitleScreen nextState = new TitleScreen();
        Greenfoot.setWorld( nextState );
    }
}

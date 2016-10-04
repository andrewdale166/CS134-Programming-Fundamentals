import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class CharacterSelectScreen extends World
{
    Button player1Button;
    Button player2Button;
    Button startButton;
    
    public CharacterSelectScreen()
    {    
        super(600, 400, 1); 
        showText( "Choose your character", getWidth()/2, 20 );
        
        player1Button = new Button();
        player1Button.setImage( "bunny_idle.png" );
        addObject( player1Button, 100, 150 );
        showText( "Bunny", 100, 275 );
        showText( "WASD", 100, 300 );
        
        player2Button = new Button();
        player2Button.setImage( "cat_idle.png" );
        addObject( player2Button, 500, 150 );
        showText( "Cat", 500, 275 );
        showText( "ARROWS", 500, 300 );
        
        startButton = new Button();
        startButton.setImage( "buttonbg.png" );
        addObject( startButton, getWidth()/2, 300 );
        showText( "START", getWidth()/2, 300 );
    }
    
    public void act()
    {
        if ( Greenfoot.mouseClicked( startButton ) )
        {
            gotoGame();
        }
    }
    
    public void gotoGame()
    {
        GameScreen nextState = new GameScreen();
        Greenfoot.setWorld( nextState );
    }
}

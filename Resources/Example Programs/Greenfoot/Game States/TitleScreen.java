import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class TitleScreen extends World
{
    public TitleScreen()
    {    
        super(600, 400, 1); 
        showText( "Press [ENTER] to begin", getWidth()/2, 300 );
    }
    
    public void act()
    {
        if ( Greenfoot.isKeyDown( "enter" ) )
        {
            gotoCharacterSelect();
        }
    }
    
    public void gotoCharacterSelect()
    {
        CharacterSelectScreen nextState = new CharacterSelectScreen();
        Greenfoot.setWorld( nextState );
    }
    
    public void gotoGame()
    {
        GameScreen nextState = new GameScreen();
        Greenfoot.setWorld( nextState );
    }
}

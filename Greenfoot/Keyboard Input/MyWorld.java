import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public PlayerCharacter player = new PlayerCharacter();
    public AICharacter enemy = new AICharacter();
    
    public PlayerCharacter getPlayer()
    {
        return player;
    }
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject( player, 100, 100 );
        addObject( enemy, 300, 300 );
    }
}

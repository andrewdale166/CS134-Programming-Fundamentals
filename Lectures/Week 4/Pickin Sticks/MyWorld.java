import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    Player player;
    NPC enemy;
    Treasure treasure;
    
    public MyWorld()
    {    
        super(600, 400, 1); 

        player = new Player();
        enemy = new NPC();
        treasure = new Treasure();
        treasure.generateTreasure();
        
        addObject( player, 300, 200 );
        addObject( enemy, 500, 300 );
        addObject( treasure, 50, 50 );
    }
    
    Treasure getTreasure()
    {
        return treasure;
    }
    
    public void act()
    {
        if ( player.getScore() >= 100 )
        {
            showText( "Girl wins!", 300, 200 );
            Greenfoot.stop();
        }
        else if ( enemy.getScore() >= 100 )
        {
            showText( "Bunny wins!", 300, 200 );
            Greenfoot.stop();
        }
    }
}

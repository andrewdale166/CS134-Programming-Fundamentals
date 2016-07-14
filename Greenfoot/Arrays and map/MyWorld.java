import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    Tile[] tiles;
    Monster[] monsters;
    Player player;
    Gem gem;
    int score;
    
    public MyWorld()
    {    
        super(640, 480, 1); 
        score = 0;
        setupLevel();
        setupMonsters();
        
        player = new Player();
        addObject( player, getWidth()/2, getHeight()/2 );
        
        gem = new Gem();
        addObject( gem, 0, 0 );
        randomlyPlaceGem();
    }
    
    public void act()
    {
        showText( "Score: " + score, getWidth()/2, getHeight() - 20 );
    }
    
    public Tile[] getTiles()
    {
        return tiles;
    }
    
    public void randomlyPlaceGem()
    {
        gem.setLocation( 
            Greenfoot.getRandomNumber( getWidth() - 100 ) + 50,
            Greenfoot.getRandomNumber( getHeight() - 100 ) + 50
            );
    }
    
    public void collectGem()
    {
        score += 10;
        randomlyPlaceGem();
        Greenfoot.playSound( "coin.wav" );
    }
    
    public void setupLevel()
    {
        int tilesWide = 21;
        int tilesHigh = 16;
        int tileWH = 32;
        
        tiles = new Tile[ tilesWide * tilesHigh ];
        
        int index = 0;
        for ( int y = 0; y < tilesHigh; y++ )
        {
            for ( int x = 0; x < tilesWide; x++ )
            {
                if ( x <= 1 || y <= 1 || x >= tilesWide-2 || y >= tilesHigh-2 )
                {
                    tiles[index] = new Tile( "brick" );
                }
                else 
                {
                    tiles[index] = new Tile( "grass" );
                }
                addObject( tiles[index], x*tileWH, y*tileWH );
            }
        }
    }
    
    public void setupMonsters()
    {
        monsters = new Monster[5];
        for ( int i = 0; i < monsters.length; i++ )
        {
            monsters[i] = new Monster();
            int x = Greenfoot.getRandomNumber( getWidth() - 100 ) + 50;
            int y = Greenfoot.getRandomNumber( getHeight() - 100 ) + 50;
            addObject( monsters[i], x, y );
        }
    }
}

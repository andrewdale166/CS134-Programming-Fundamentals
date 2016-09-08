import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    MapTile[][] mapTiles;
    int mapWidth, mapHeight;
    int screenWidth, screenHeight;
    
    Girl player;
    Bunny enemy;
    
    public MyWorld()
    {    
        super(640, 480, 1); 
        screenWidth = 640;
        screenHeight = 480;
        buildMap();
        
        player = new Girl();
        enemy = new Bunny();
        
        addTreasure( new Gem( 1 ) );
        
        addObject( player, screenWidth/2, screenHeight/2 );
        addObject( enemy, 50, 50 );
    }
    
    public void addTreasure( Treasure obj )
    {
        addObject( obj, 0, 0 );
    }

    private void buildMap()
    {
        mapWidth = 640/32 + 1;
        mapHeight = 480/32 + 1;
        mapTiles = new MapTile[mapWidth][mapHeight];
        
        for ( int y = 0; y < mapHeight; y++ )
        {
            for ( int x = 0; x < mapWidth; x++ )
            {
                MapTile t = new MapTile();
                t.setImage( "grass.png" );
                addObject( t, x * 32, y * 32 );
            }
        }
        
        // Add objects
        for ( int i = 0; i < 5; i++ )
        {
            MapTile t = new MapTile();
            t.setType( "obstacle" );
            t.setImage( "rock.png" );
            int x = Greenfoot.getRandomNumber( screenWidth );
            int y = Greenfoot.getRandomNumber( screenHeight );
            addObject( t, x, y );
        }
        for ( int i = 0; i < 5; i++ )
        {
            MapTile t = new MapTile();
            t.setType( "obstacle" );
            t.setImage( "tree.png" );
            int x = Greenfoot.getRandomNumber( screenWidth );
            int y = Greenfoot.getRandomNumber( screenHeight );
            addObject( t, x, y );
        }
    }
    
    public void act()
    {
        if ( player.getScore() == 5 )
        {
            showText( "Girl wins!", screenWidth / 2, screenHeight / 2 );
            Greenfoot.stop();
        }
        else if ( enemy.getScore() == 5 )
        {
            showText( "Bunny wins!", screenWidth / 2, screenHeight / 2 );
            Greenfoot.stop();
        }
    }
    
    public int getScreenWidth()
    {
        return screenWidth;
    }
    
    public int getScreenHeight()
    {
        return screenHeight;
    }
}

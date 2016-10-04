import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    Player player;
    
    int pizzaTimer;
    int score;
    
    public MyWorld()
    {    
        super(600, 500, 1); 
        BuildMap();
        
        player = new Player();
        addObject( player, 50, 460 );
        score = 0;
        
        pizzaTimer = 0;
    }
    
    public void gameOver()
    {
        showText( "Game Over", 300, 250 );
        Greenfoot.stop();
    }
    
    public void youWin()
    {
        showText( "You Win!", 300, 250 );
        Greenfoot.stop();
    }
    
    public void addToScore()
    {
        score++;
    }
    
    public void act()
    {
        if ( pizzaTimer == 0 )
        {
            MakeNewPizza();
            pizzaTimer = Greenfoot.getRandomNumber( 200 ) + 100;
        }
        pizzaTimer--;
        
        showText( "Score: " + score, 50, 20 );
    }
    
    public void MakeNewPizza()
    {
        Greenfoot.playSound( "pizza.wav" );
        addObject( new Pizza(), 500, 40 );
    }
    
    public void BuildMap()
    {
        int width = 600/20 + 1;
        
        int x = 0, y;
        y = 480;
        for ( int i = 0; i < width; i++ )
        {
            x = i * 20 + 50;
            Tile t = new Tile();
            t.setImage( "girter.png" );
            addObject( t, x, y );
        }
        
        y -= 100;
        for ( int i = 0; i < width - 10; i++ )
        {
            x = i * 20 + 50;
            Tile t = new Tile();
            t.setImage( "girter.png" );
            addObject( t, x, y );
        }
        
        addObject( new Ladder(), 450, y );
        addObject( new Ladder(), 450, y+20 );
        addObject( new Ladder(), 450, y+40 );
        addObject( new Ladder(), 450, y+60 );
        addObject( new Ladder(), 450, y+80 );
        
        y -= 100;
        for ( int i = 0; i < width - 10; i++ )
        {
            x = i * 20 + 150;
            Tile t = new Tile();
            t.setImage( "girter.png" );
            addObject( t, x, y );
        }
        
        addObject( new Ladder(), 150, y );
        addObject( new Ladder(), 150, y+20 );
        addObject( new Ladder(), 150, y+40 );
        addObject( new Ladder(), 150, y+60 );
        addObject( new Ladder(), 150, y+80 );
        
        y -= 100;
        for ( int i = 0; i < width - 10; i++ )
        {
            x = i * 20 + 50;
            Tile t = new Tile();
            t.setImage( "girter.png" );
            addObject( t, x, y );
        }
        
        addObject( new Ladder(), 450, y );
        addObject( new Ladder(), 450, y+20 );
        addObject( new Ladder(), 450, y+40 );
        addObject( new Ladder(), 450, y+60 );
        addObject( new Ladder(), 450, y+80 );
        
        y -= 100;
        for ( int i = 0; i < width - 10; i++ )
        {
            x = i * 20 + 150;
            Tile t = new Tile();
            t.setImage( "girter.png" );
            addObject( t, x, y );
        }
        
        addObject( new Ladder(), 150, y );
        addObject( new Ladder(), 150, y+20 );
        addObject( new Ladder(), 150, y+40 );
        addObject( new Ladder(), 150, y+60 );
        addObject( new Ladder(), 150, y+80 );
        
        x = 500;
        y = 40;
        addObject( new Monkey(), x, y );
        
        x = 450;
        addObject( new Princess(), x, y );
    }
}

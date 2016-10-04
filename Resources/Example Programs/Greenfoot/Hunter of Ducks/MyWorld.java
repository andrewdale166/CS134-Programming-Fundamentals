import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    int duckTimer;
    int score;
    int missed;
    
    Facade facade;
    
    public MyWorld()
    {    
        super(256*2, 240*2, 1); 
        
        facade = new Facade();
        
        addObject( facade, 256, 240 );
        addObject( new Crosshairs(), 0, 0 );
        
        score = 0;
        missed = 0;
        
        duckTimer = 50;
    }
    
    public void AddToScore()
    {
        score += 1;
    }
    
    public void AddToMissed()
    {
        missed += 1;
    }
    
    public void act()
    {
        showText( "Hit:  " + score, 50, 20 );
        showText( "Miss: " + missed, 150, 20 );
        duckTimer -= 1;
        
        if ( duckTimer == 0 )
        {
            SpawnNewDuck();
        }
        
        if ( missed == 10 )
        {
            showText( "You let too many birds get away!", 256, 220 );
            showText( "You lose!", 256, 260 );
            Greenfoot.stop();
        }
        else if ( score == 10 )
        {
            showText( "You have shot 10 birds!", 256, 220 );
            showText( "You win(?)", 256, 260 );
            Greenfoot.stop();
        }
    }
    
    public void SpawnNewDuck()
    {
        int x;
        if ( Greenfoot.getRandomNumber( 2 ) == 0 )
        {
            x = 0;
        }
        else
        {
            x = 256*2;
        }
        int y = 350;
        duckTimer = Greenfoot.getRandomNumber( 100 ) + 50;
        
        addObject( new Duck(), x, y );
        
        //setPaintOrder(Facade.class);
        //setPaintOrder(Crosshairs.class);
    }
}

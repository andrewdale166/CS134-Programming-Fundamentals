import greenfoot.*;

public class MyWorld extends World
{
    public Player player = new Player();
    public Tux tux = new Tux();
    public Enemy enemy = new Enemy();
    
    public boolean gameOver = false;
    
    int score = 0;
    
    public void act()
    {
        if ( isPlayerHittingTux() )
        {
            score += 1;
            showText( "Score: " + score, 70, 15 );
            randomlyPlaceTux();
        }
        
        if ( isEnemyHittingPlayer() )
        {
            showText( "GAME OVER", 70, 15 );
            gameOver = true;
        }
    }
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        addObject( player, 10, getHeight() / 2 );
        addObject( enemy, getWidth() - 10, getHeight() / 2 );
        addObject( tux, 0, 0 );
        randomlyPlaceTux();
        score = 0;
        
        showText( "Score: " + score, 70, 15 );
    }
    
    public void randomlyPlaceTux()
    {
        int x = Greenfoot.getRandomNumber( getWidth() );
        int y = Greenfoot.getRandomNumber( getHeight() );
        tux.setLocation( x, y );
    }
    
    public boolean isPlayerHittingTux()
    {
        double distance = getDistance( player.getX(), player.getY(), tux.getX(), tux.getY() );
        return ( distance < 30 );
    }
    
    public boolean isEnemyHittingPlayer()
    {
        double distance = getDistance( player.getX(), player.getY(), enemy.getX(), enemy.getY() );
        return ( distance < 30 );
    }
    
    public double getDistance( double x1, double y1, double x2, double y2 )
    {
        return Math.sqrt( Math.pow( x2 - x1, 2 ) + Math.pow( y2 - y1, 2 ) );
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    private Brick[] bricks;
    private Paddle paddle;
    private Ball ball;
    
    int lives;
    
    public MyWorld()
    {
        super(600, 600, 1); 
        
        lives = 3;
        showText( "Lives: " + lives, 500, getHeight() - 30 );
        
        // Add bricks
        bricks = new Brick[35];
        int counter = 0;
        for ( int y = 0; y < 5; y++ )
        {
            for ( int x = 0; x < 7; x++ )
            {
                bricks[counter] = new Brick();
                addObject( bricks[counter], x * 100, y * 35 + 400 );
                
                counter++;
            }
        } 
        
        // Add paddle
        paddle = new Paddle();
        addObject( paddle, getWidth() / 2, 25 );
        
        // Add ball
        ball = new Ball( getWidth() / 2, getHeight() / 2 );
        addObject( ball, getWidth() / 2, getHeight() / 2 );
    }
    
    public void act()
    {
        // Display count of bricks remaining
        int brickCount = getObjects( Brick.class ).size();
        showText( "Bricks: " + brickCount, 100, getHeight() - 30 );
        
        if ( brickCount == 0 )
        {
            showText( "You win!", getWidth() / 2, getHeight() / 2 );
            ball.deactivate();
            paddle.deactivate();
        }
        else if ( lives == 0 )
        {
            showText( "Game over", getWidth() / 2, getHeight() / 2 );
            ball.deactivate();
            paddle.deactivate();
        }
        
        if ( ball.getY() < 10 )
        {
            Greenfoot.playSound( "Explosion8.wav" );
            ball.reset();
            lives -= 1;
            showText( "Lives: " + lives, 500, getHeight() - 30 );
        }
    }
}

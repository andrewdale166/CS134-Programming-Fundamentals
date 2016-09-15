import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Character extends Actor
{
    int speed;
    String image;
    int score;
    
    public Character(String type)
    {
        speed = 5;
        image = type;
        score = 0;
        
        if ( image == "bunny" )
        {
            speed = 2;
        }
    }
    
    public int getScore()
    {
        return score;
    }
    
    public void act() 
    {
        showScore();
        checkCollisionWithGem();
    }   
    
    public void showScore()
    {
        if ( image.equals ( "girl" ) )
        {
            getWorld().showText( "Girl's Score: " + score, 100, 20 );
        }
        else if ( image.equals( "bunny" ) )
        {
            getWorld().showText( "Bunny's Score: " + score, 450, 20 );
        }
    }
    
    public void move(String direction)
    {
        int x = getX();
        int y = getY();
        
        if ( direction.equals( "north" ) )
        {
            y -= speed;
            setImage( image + "_north.png" );
        }
        else if ( direction.equals( "south" ) )
        {
            y += speed;
            setImage( image + "_south.png" );
        }
        else if ( direction.equals( "west" ) )
        {
            x -= speed;
            setImage( image + "_west.png" );
        }
        else if ( direction.equals( "east" ) )
        {
            x += speed;
            setImage( image + "_east.png" );
        }
        
        setLocation( x, y );
    } 
    
    void checkCollisionWithGem()
    {
        MyWorld world = (MyWorld)getWorld();
        Treasure collision = (Treasure)getOneIntersectingObject( Treasure.class );
        if ( collision != null )
        {
            score += collision.getPoints();
            collision.generateTreasure();
        }
    }
}

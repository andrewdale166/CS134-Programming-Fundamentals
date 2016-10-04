import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    Flerpy player;
    int scrollSpeed;
    int newItemCountdown;
    
    public MyWorld()
    {    
        super(400, 600, 1); 
        
        player = new Flerpy();
        addObject( player, 50, 300 );
        
        newItemCountdown = 10;
    }
    
    public void act()
    {
        newItemCountdown--;
        
        if ( newItemCountdown == 0 )
        {
            int upOrDown = Greenfoot.getRandomNumber( 2 );
            
            if ( upOrDown == 0 )
            {
                addObject( new UpCat(), 400, 90 );
                newItemCountdown = Greenfoot.getRandomNumber( 100 ) + 10;
            }
            else
            {
                addObject( new Cat(), 400, 510 );
                newItemCountdown = Greenfoot.getRandomNumber( 100 ) + 10;
            }            
        }
    }
}

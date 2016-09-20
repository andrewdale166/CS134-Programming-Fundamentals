import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    Ant ant;
    Food food;
    
    public MyWorld()
    {    
        super(400, 400, 1);
        
        food = new Food();
        ant = new Ant();
        
        addObject(food, getWidth()/2, getHeight()/2);
        addObject(ant, 100, 100);
    }
    
    public void act()
    {
        showText( "Ants: " + getObjects( Ant.class ).size(), 50, 350 );
        
        if ( getObjects( Ant.class ).size() == 20 )
        {
            showText( "You have infested the house!", 200, 200 );
            Greenfoot.stop();
        }
    }
    
    public void moveFood()
    {
        food.setLocation(
            Greenfoot.getRandomNumber( 400 ),
            Greenfoot.getRandomNumber( 400 )
        );
    }
    
    public void addFollower(Ant followme)
    {
        if ( getObjects( Ant.class ).size() < 20 )
        {
            Ant newAnt = new Ant();
            newAnt.setFollow(followme);
            addObject(newAnt, ant.getX(), ant.getY());
        }        
    }
}

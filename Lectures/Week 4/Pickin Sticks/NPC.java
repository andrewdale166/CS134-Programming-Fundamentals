import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class NPC extends Character
{
    public NPC()
    {
        super( "bunny" );
    }
    
    public void act() 
    {
        super.act();
        MyWorld world = (MyWorld)getWorld();
        Treasure treasure = world.getTreasure();
        
        if ( treasure.getX() < this.getX() )
        {
            move( "west" );
        }
        else if ( treasure.getX() > this.getX() )
        {
            move( "east" );
        }
        
        if ( treasure.getY() < this.getY() )
        {
            move( "north" );
        }
        else if ( treasure.getY() > this.getY() )
        {
            move( "south" );
        }
    }    
}

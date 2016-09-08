import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bunny extends Character
{
    public Bunny()
    {
        super( "bunny" );
    }
    
    public void act() 
    {
        super.act();
        moveTowardGem();
    }    
    
    /*
     * You can use these Character functions to move the rabbit:
     * move( "north" );
     * move( "south" );
     * move( "west" );
     * move( "east" );
     * 
     * or you can use these Actor functions to move the rabbit:
     * turn( angle );
     * move( pixels );
     */
    public void moveTowardGem()
    {
        MyWorld world = (MyWorld)getWorld();
        //int gemX = world.getTreasureX();
        //int gemY = world.getTreasureY();
        int bunnyX = getX();
        int bunnyY = getY();
    }
}

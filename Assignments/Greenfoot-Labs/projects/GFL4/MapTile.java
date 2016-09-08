import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MapTile extends Actor
{
    String type;
    
    public void act() 
    {
        type = "ground";
    }    
    
    void setType( String t ) { type = t; }
    String getType() { return type; }
}

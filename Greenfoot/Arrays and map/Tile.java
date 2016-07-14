import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Tile extends Actor
{
    boolean isSolid;
    String tileType;
    
    public Tile( String type )
    {
        setTile( type );
    }
    
    public void act() 
    {
        if ( Greenfoot.mouseClicked( this ) )
        {
            if ( tileType.equals( "grass" ) )
            {
                setTile( "brick" );
            }
            
            else if ( tileType.equals( "brick" ) )
            {
                setTile( "grass" );
            }
        }
    }  
    
    public void setTile( String type )
    {
        tileType = type;
        if ( type.equals( "brick" ) )
        {
            isSolid = true;
            setImage( "bricks.png" );
        }
        else if ( type.equals( "grass" ) )
        {
            isSolid = false;
            setImage( "grass.png" );
        }
        
    }
    
    public boolean getIsSolid()
    {
        return isSolid;
    }
}

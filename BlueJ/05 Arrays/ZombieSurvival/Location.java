import java.util.Random;

public class Location
{
    private String name;
    private int ammoCount;
    private int foodCount;
    private int entertainmentCount;
    
    public Location( String name )
    {
        setup( name );
    }
    
    void setup( String n )
    {
        Random random = new Random();
        name = n;
        ammoCount = random.nextInt( 3 );
        foodCount = random.nextInt( 3 );
        entertainmentCount = random.nextInt( 3 );
    }
    
    String getName()
    {
        return name;
    }
    
    void displayFound()
    {
        System.out.println( "Found: "
            + ammoCount + " ammo, "
            + foodCount + " food, "
            + entertainmentCount + " entertainment" );
    }
    
    int getAmmo() { return ammoCount; }
    int getFood() { return foodCount; }
    int getEntertainment() { return entertainmentCount; }
}

import java.util.Random;

public class Person
{
    private String name;
    private int hunger;
    private int sanity;
    private boolean isAlive;
    
    public Person( String name )
    {
        setup( name );
    }
    
    public void setup( String n )
    {
        name = n;
        hunger = 0;
        sanity = 100;
        isAlive = true;
    }
    
    public boolean dailyUpdate( int amountEaten, int amountRead )
    {
        Random random = new Random();
        
        if ( !isAlive ) { return false; }
        int hungerAmount = random.nextInt( 5 );
        int sanityAmount = random.nextInt( 5 );
        
        hunger += hungerAmount;
        sanity -= sanityAmount;
        
        hunger -= amountEaten;
        sanity += amountRead;
        
        System.out.println( name + " eats " 
            + amountEaten + " food items and consumes "
            + amountRead + " books." );
        
        if ( hunger > 100 )
        {
            System.out.println( name + " has died of hunger!" );
            isAlive = false;
        }
        else if ( sanity < 0 )
        {
            System.out.println( name + " has broken down and died!" );
            isAlive = false;
        }
        
        if ( hunger < 0 ) { hunger = 0; }
        if ( sanity > 100 ) { sanity = 100; }
        
        return true;
    }
    
    public String getName()
    {
        return name;
    }
    
    public boolean getIsAlive()
    {
        return isAlive;
    }
    
    public void kill()
    {
        if ( isAlive )
        {
            System.out.println( name + " is killed!" );
            isAlive = false;
        }
        else
        {
            System.out.println( name + " is already dead..." );
        }
    }
    
    void display()
    {
        if ( isAlive )
        {
            System.out.println( name 
                + " - hunger: " + hunger
                + "%, sanity: " + sanity + "%" ); 
        }
        else
        {
            System.out.println( name + " - dead" ); 
        }
    }
}

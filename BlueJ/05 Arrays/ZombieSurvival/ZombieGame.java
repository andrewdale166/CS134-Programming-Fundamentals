import java.util.Scanner;
import java.util.Random;

public class ZombieGame
{
    Person[]    party;
    Location[] locations;
    Equipment   equipment;
    int days;
    Random random;
    Scanner input;
    
    public ZombieGame()
    {
        random = new Random();
        input = new Scanner( System.in );
        equipment = new Equipment();
        
        party = new Person[4];
        party[0] = new Person( "George" );
        party[1] = new Person( "John" );
        party[2] = new Person( "Thomas" );
        party[3] = new Person( "James" );
        
        locations = new Location[5];
        locations[0] = new Location( "Marsh" );
        locations[1] = new Location( "Beach" );
        locations[2] = new Location( "Grassland" );
        locations[3] = new Location( "Forest" );
        locations[4] = new Location( "Mountain" );
        
        days = 0;
        
        main();
    }
    
    public void main()
    {        
        boolean done = false;
        while ( !done )
        {
            displayStats();
            
            scavengeRound();
            waitToContinue();
            survivalRound();
            waitToContinue();
            
            adjustStats();
            
            if ( atLeastOneSurvivor() == false )
            {
                done = true;
            }
            
            waitToContinue();
            
            days++;
        }
        
        System.out.println( "GAME OVER!" );
        System.out.println( "Your party survived " + days + " days!" );
    }
    
    public void displayStats()
    {
        System.out.println( "" );
        System.out.println( "---------------------------------------------------" );
        System.out.println( "DAY " + days );
        System.out.print( "EQUIPMENT: " );
        equipment.display();
        System.out.println( "PARTY:" );
        for ( int i = 0; i < 4; i++ )
        {
            party[i].display();
        }
    }
    
    public boolean atLeastOneSurvivor()
    {
        boolean surviving = false;
        for ( int i = 0; i < party.length; i++ )
        {
            if ( party[i].getIsAlive() == true )
            {
                surviving = true;
            }
        }
        return surviving;
    }
    
    public void adjustStats()
    {
        System.out.println( "" );
        for ( int i = 0; i < 4; i++ )
        {
            int maxFood = 5;
            int maxEnt = 5;
            
            int hungerAmount = random.nextInt( maxFood );
            int sanityAmount = random.nextInt( maxEnt );
            
            if ( hungerAmount > equipment.getFood() ) { hungerAmount = equipment.getFood(); }
            if ( sanityAmount > equipment.getEntertainment() ) { sanityAmount = equipment.getEntertainment(); }
            
            boolean alive = party[i].dailyUpdate( hungerAmount, sanityAmount );
            if ( alive )
            {
                equipment.removeFood( hungerAmount );
                equipment.removeEntertainment( sanityAmount );
            }
        }
    }
    
    public void scavengeRound()
    {
        System.out.println( "" );
        System.out.println( "------------------" );
        System.out.println( "- SCAVENGE ROUND -" );
        System.out.println( "------------------" );
        System.out.println( "Scavenge at which location?" );
        for ( int i = 0; i < locations.length; i++ )
        {
            System.out.println( i + ". " + locations[i].getName() );
        }
        int choice = input.nextInt();
        
        locations[choice].displayFound();

        equipment.addAmmo( locations[choice].getAmmo() );
        equipment.addFood( locations[choice].getFood() );
        equipment.addEntertainment( locations[choice].getEntertainment() );
    }
    
    public void survivalRound()
    {
        System.out.println( "" );
        System.out.println( "------------------" );
        System.out.println( "- SURVIVAL ROUND -" );
        System.out.println( "------------------" );
        
        int zombieAttack = random.nextInt( 5 );
        
        if ( zombieAttack == 0 )
        {
            System.out.println( "A zombie attacks!" );
            if ( equipment.getAmmo() >= 2 )
            {
                System.out.println( "The zombie was killed. 2 ammo used." );
                equipment.removeAmmo( 2 );
            }
            else
            {
                int randomPerson = random.nextInt( 4 );
                System.out.println( "Zombie attacks " + party[randomPerson].getName() );
                party[randomPerson].kill();
            }
        }
        else
        {
            System.out.println( "It is a quiet day today..." );
        }
    }
    
    public void waitToContinue()
    {
        String choice = "";
        
        do
        {
            System.out.println( "" );
            System.out.print( "Continue? (y/n): " );
            choice = input.next();
        } while ( choice.equals( "y" ) == false );
    }
}

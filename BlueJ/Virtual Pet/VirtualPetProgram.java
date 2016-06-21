import java.util.Scanner;
import java.util.Random;

public class VirtualPetProgram
{
    private int hunger = 0;
    private int happiness = 100;
    private int energy = 100;
    private String name = "";
    
    private Scanner input = new Scanner( System.in );
    private Random generator = new Random();
    
    public void start()
    {
        System.out.print( "Enter your pet's name: " );
        name = input.nextLine();
        
        // Start game
        gameLoop();
    }
    
    public void displayMenu()
    {
        System.out.println( "1. Feed" );
        System.out.println( "2. Play" );
        System.out.println( "3. Sleep" );
        System.out.println( "4. Quit" );
    }
    
    public void displayStats()
    {
        System.out.println( "\n" + name.toUpperCase() );
        System.out.println( "Hunger: " + hunger + "% \t Happiness: " + happiness + "% \t Energy: " + energy + "%" );
    }
    
    public void updateStats()
    {
        // Each turn, the pet's stats change
        hunger += generator.nextInt( 5 );
        happiness -= generator.nextInt( 5 );
        energy -= generator.nextInt( 5 );
        
        if ( hunger > 100 ) { hunger = 100; }
        if ( happiness < 0 ) { happiness = 0; }
        if ( energy < 0 ) { energy = 0; }
    }
    
    public void gameLoop()
    {
        boolean done = false;
        int choice;
        
        while ( !done )
        {
            updateStats();
            displayStats();
            displayMenu();
            System.out.print( "What do you want to do: " );
            choice = input.nextInt();
            
            if ( choice == 1 )
            {
                feed();
            }
            else if ( choice == 2 )
            {
                play();
            }
            else if ( choice == 3 )
            {
                rest();
            }
            else if ( choice == 4 )
            {
                done = true;
                System.out.println( "\n\tGoodbye!" );
            }
        }
    }
    
    public void feed()
    {
        System.out.print( "Feed what to " + name + ": " );
        String food = input.next();
        
        int amount = generator.nextInt( 10 );
        hunger -= amount;
        System.out.println( "Hunger -" + amount + "%" );
        if ( hunger < 0 ) { hunger = 0; }
    }
    
    public void play()
    {
        System.out.print( "Play what game with " + name + ": " );
        String game = input.next();
        
        int fun = generator.nextInt( 10 );
        happiness += fun;
        System.out.println( "Happiness +" + fun + "%" );
        if ( happiness > 100 ) { happiness = 100; }
    }
    
    public void rest()
    {
        System.out.print( "Have " + name + " rest for how many hours: " );
        int hours = input.nextInt();
        
        energy += hours;
        System.out.println( "Energy +" + hours + "%" );
        if ( energy > 100 ) { energy = 100; }
    }
}






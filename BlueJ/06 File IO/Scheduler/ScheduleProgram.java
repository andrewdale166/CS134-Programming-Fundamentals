import java.util.Scanner;

public class ScheduleProgram
{
    Scanner input;
    String[] events;
    
    public ScheduleProgram()
    {
        input = new Scanner( System.in );
        events = new String[24];
        for ( int i = 0; i < events.length; i++ )
        {
            events[i] = "";
        }
        
        main();
    }
    
    public void main()
    {
        boolean done = false;
        
        String[] menuOptions = new String[4];
        menuOptions[0] = "Add event";
        menuOptions[1] = "View schedule";
        menuOptions[2] = "Save file";
        menuOptions[3] = "Quit";
        
        while ( !done )
        {
            System.out.println( "\n\nMAIN MENU" );
            for ( int i = 0; i < menuOptions.length; i++ )
            {
                System.out.println( i + ". " + menuOptions[i] );
            }
            
            int choice = input.nextInt();
            
            if ( choice == 0 )
            {
                addEvent();
            }
            else if ( choice == 1 )
            {
                viewSchedule();
            }
            else if ( choice == 2 )
            {
                save();
            }
            else if ( choice == 3 )
            {
                done = true;
            }
        }
    }
    
    public void addEvent()
    {
        System.out.print( "Which hour? (00 - 23): " );
        int hour = input.nextInt();
        
        System.out.print( "Event title: " );
        input.nextLine(); // pull the \n from the nextInt...
        String title = input.nextLine();
        
        events[hour] = title;
        System.out.println( "Event added" );
    }
    
    public void viewSchedule()
    {
        for ( int i = 0; i < events.length; i++ )
        {
            System.out.println( i + ":00\t"
                + events[i] );
        }
    }
    
    public void save()
    {
        FileOutputter output = new FileOutputter( "schedule.txt" );
        for ( int i = 0; i < events.length; i++ )
        {
            output.println( i + ":00\t" + events[i] );
        }
    }
}

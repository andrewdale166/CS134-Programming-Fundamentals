import java.util.Scanner;

public class Program
{
    static Scanner input = new Scanner( System.in ); 
    
    public static void main()
    {
        boolean programIsDone = false;
        
        while ( programIsDone == false )
        {
            System.out.println( "1. Add numbers" );
            System.out.println( "2. Quit" );
            int choice = input.nextInt();
            
            if ( choice == 1 )
            {
                System.out.println( "Enter the first number: " );
                int num1 = input.nextInt();
                
                System.out.println( "Enter the second number: " );
                int num2 = input.nextInt();
                
                mathProblem( num1, num2 );
            }
            else if ( choice == 2 )
            {
                programIsDone = true;
            }
            else
            {
                System.out.println( "Invalid option" );
            }
        }
    }
    
    public static void mathProblem( int num1, int num2 )
    {
        
        int answer;
        
        System.out.println( "What is " + num1 + " plus " + num2 );  
        answer = input.nextInt();
        
        if ( answer == num1 + num2 )
        {
            System.out.println( "Correct" );
        }
        else
        {
            System.out.println( "Incorrect" );
        }
    }
}




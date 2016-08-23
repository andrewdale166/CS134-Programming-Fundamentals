import java.util.Scanner;

public class Program
{        
    public static void canIDrive( boolean hasCar, boolean canBorrowCar, boolean hasLicense )
    {        
        // If:
        // *    You have a car OR can borrow a car
        // AND
        // *    You have a drivers license
        // Then you can drive
        if ( ( hasCar || canBorrowCar ) && hasLicense )
        {
            System.out.println( "You can drive!" );
        }
        else
        {
            System.out.println( "You cannot drive." );
        }
    }
    
    public static void main()
    {
        Scanner input = new Scanner( System.in );
        boolean hasCar, canBorrowCar, hasLicense;
        
        System.out.print( "Do you have a car? (y/n): " );
        String car = input.nextLine();
        if ( car.equals( "y" ) )
        {
            hasCar = true;
        }
        else
        {
            hasCar = false;
        }
        // OR: hasCar = ( car == "y" );
        
        System.out.print( "Can you borrow a car? (y/n): " );
        String borrow = input.nextLine();
        if ( borrow.equals( "y" ) )
        {
            canBorrowCar = true;
        }
        else
        {
            canBorrowCar = false;
        }
        
        System.out.print( "Do you have a license? (y/n): " );
        String license = input.nextLine();
        if ( license.equals( "y" ) )
        {
            hasLicense = true;
        }
        else
        {
            hasLicense = false;
        }
        
        canIDrive( hasCar, canBorrowCar, hasLicense );
    }
}




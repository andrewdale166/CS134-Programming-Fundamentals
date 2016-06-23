import java.util.Scanner;

public class Calculator
{
    
    public static void multiply()
    {
        Scanner input = new Scanner( System.in );
        
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
        Fraction product = new Fraction();
        
        int n1, d1, n2, d2;
        
        System.out.print( "Numerator 1: " );
        n1 = input.nextInt();
        
        System.out.print( "Denominator 1: " );
        d1 = input.nextInt();
        
        System.out.print( "Numerator 2: " );
        n2 = input.nextInt();
        
        System.out.print( "Denominator 2: " );
        d2 = input.nextInt();
        
        f1.set( n1, d1 );
        f2.set( n2, d2 );
       
        
        product = f1.multiply( f2 ); // product = f1 * f2;
        
        System.out.println( "equals" );
        product.display();
    }
}

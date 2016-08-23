public class Fraction
{
    private int numerator;
    private int denominator;
    
    public Fraction multiply( Fraction f2 )
    {
        /*
         * n1   n2      n1 * n2
         * -- x -- =    -------
         * d1   d2      d1 * d2
         */
        
        Fraction product = new Fraction();
        int num;
        int denom;
        
        num = numerator * f2.getNumerator();
        denom = denominator * f2.getDenominator();
        
        product.set( num, denom );
        
        return product;
    }
    
    public String getFormattedFraction()
    {
        return numerator + "/" + denominator;
    }
    
    public void display()
    {
        System.out.println( getFormattedFraction() );
    }
    
    public void set( int n, int d )
    {
        numerator = n;
        denominator = d;
        display();
    }
    
    public int getNumerator()
    {
        return numerator;
    }
    
    public int getDenominator()
    {
        return denominator;
    }
}

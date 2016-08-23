public class Kitten
{
    private String name;
    private static int kittenCount = 0;

    public Kitten()
    {
        String a;
        System.out.println( a );
        incKittenCount();
        displayKittenCount();
    }
    
    public static void incKittenCount()
    {
        kittenCount++;
    }
    
    public static void displayKittenCount()
    {
        System.out.println( kittenCount + " kittens" );
    }
    
    public void setName( String value )
    {
        name = value;
    }
    
    public String getName()
    {
        return name;
    }
}


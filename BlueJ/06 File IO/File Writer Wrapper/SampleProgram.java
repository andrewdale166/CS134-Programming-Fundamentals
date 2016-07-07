
public class SampleProgram
{
    public static void main()
    {
        FileOutputter out = new FileOutputter( "myfile.txt" );
        
        out.println( "Hello, world!" );
        out.print( "How are you?" );
        out.println( " I am good! How are you?" );
    }
}

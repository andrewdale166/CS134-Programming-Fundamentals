import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritingProgram
{
    public static void main()
    {
        try
        {
            File outputFile = new File( "output.txt" );
            
            if ( !outputFile.exists() )
            {
                outputFile.createNewFile();
            }
            
            FileWriter fw = new FileWriter( outputFile.getAbsoluteFile() );
            BufferedWriter bw = new BufferedWriter( fw );
            
            // Write text information
            bw.write( "Hello there!\n" );
            bw.write( "How are you?\n" );
            
            bw.close();
        }
        catch( IOException e ) {
            e.printStackTrace();
        }
    }
}

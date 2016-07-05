
public class Course
{
    private String name;
    private String semester;
    
    public void setup( String n, String s )
    {
        name = n;
        semester = s;
    }
    
    public void display()
    {
        System.out.println( "\t" + name + ", " + semester );
    }
}

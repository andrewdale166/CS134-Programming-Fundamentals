
public class CollegeProgram
{
    private Course[] courses;
    
    public CollegeProgram()
    {
        System.out.println( "College Program" );
        
        // Initialize our course array
        courses = new Course[4];
        
        for ( int i = 0; i < courses.length; i++ )
        {
            courses[i] = new Course();
        }
        
        setupClasses();
        displayClasses();
    }
    
    public void setupClasses()
    {
        courses[0].setup( "CS134", "Summer 2016" );
        courses[1].setup( "CS200", "Fall 2016" );
        courses[2].setup( "CS250", "Spring 2017" );
        courses[3].setup( "CS255", "Fall 2017" );
    }
    
    public void displayClasses()
    {
        System.out.println( courses.length + " total courses" );
        
        for ( int i = 0; i < courses.length; i++ )
        {
            System.out.println( "COURSE " + (i+1) + ": " );
            courses[i].display();
        }
    }
}

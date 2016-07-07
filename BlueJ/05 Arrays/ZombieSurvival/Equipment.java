
public class Equipment
{
    private int ammo;
    private int food;
    private int entertainment;
    
    public Equipment()
    {
        ammo = food = entertainment = 0;
    }
    
    public void display()
    {
        System.out.println( "Ammo: " + ammo
            + ", Food: " + food
            + ", Entertainment: " + entertainment );
    }
    
    void addAmmo( int amount ) { ammo += amount; }
    void addFood( int amount ) { food += amount; }
    void addEntertainment( int amount ) { entertainment += amount; }
    
    void removeAmmo( int amount ) 
    { 
        ammo -= amount; 
        if ( ammo < 0 ) { ammo = 0; }
    }
    void removeFood( int amount ) 
    { 
        food -= amount; 
        if ( food < 0 ) { food = 0; }
    }
    void removeEntertainment( int amount ) 
    { 
        entertainment -= amount; 
        if ( entertainment < 0 ) { entertainment = 0; }
    }
    
    int getAmmo() { return ammo; }
    int getFood() { return food; }
    int getEntertainment() { return entertainment; }
}

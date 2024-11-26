import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class LoseScreen extends World
{

    /**
     * Constructor for objects of class LoseScreen.
     */
    public LoseScreen(Enemies enemy)
    {
        super(848, 600, 1);

        addObject(enemy, 848, 300);
        prepare();
        
        
    }

    public void act() {

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Treasure treasure = new Treasure();
        addObject(treasure,410,286);
    }
    
}

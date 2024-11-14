import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Background extends World
{
    /**
     * Constructor for objects of class Background.
     */
    public Background()
    {
        super(848, 600, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        RecruitSkellyButton button1 =  new  RecruitSkellyButton();
        addObject(button1, 414, 538);
    }
}

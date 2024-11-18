import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Background extends World
{
    private Counter counter;
    
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

        GoldBar goldBar = new GoldBar();
        addObject(goldBar,60,36);
        //Counter counter = new Counter();
        //addObject(counter,155,53);

        //add the counter to the world
        counter = new Counter("Gold: ");
        addObject(counter, 155, 53);

        RecruitSkellyButton button1 =  new  RecruitSkellyButton(counter);
        addObject(button1, 414, 530);

        addObject(new SmallGoldBar(), 300, 300);        
        SmallGoldBar smallGoldBar2 = new SmallGoldBar();
        addObject(smallGoldBar2,297,400);
        SmallGoldBar smallGoldBar3 = new SmallGoldBar();
        addObject(smallGoldBar3,424,296);
        SmallGoldBar smallGoldBar4 = new SmallGoldBar();
        addObject(smallGoldBar4,422,401);
        SmallGoldBar smallGoldBar5 = new SmallGoldBar();
        addObject(smallGoldBar5,563,291);
        SmallGoldBar smallGoldBar6 = new SmallGoldBar();
        addObject(smallGoldBar6,562,401);
    }
    
    public Counter getCounter() {
        return counter;
    }
}

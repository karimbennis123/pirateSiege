import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class SmallGoldBar extends Actor
{
    private int goldValue;
    
    public SmallGoldBar() {
        this.goldValue = Greenfoot.getRandomNumber(5) + 1;
    }
    
    /**
     * Act - do whatever the SmallGoldBar wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() { 
       if (Greenfoot.mouseClicked(this)) 
        {
            Background world = (Background) getWorld();
            Counter counter = world.getCounter();
            
            counter.add(goldValue);
            
            getWorld().removeObject(this);
            
        }
    }
}

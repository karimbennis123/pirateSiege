import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class SmallGoldBar extends Actor
{
    private int goldValue;
    static int goldAccumulated;
    private GreenfootSound coins = new GreenfootSound("coins.wav");
    private GreenfootImage pouch = new GreenfootImage("pouchBag.png");
    
    public SmallGoldBar() {
        setImage(pouch);
        this.goldValue = Greenfoot.getRandomNumber(5) + 3;
    }
    
    /**
     * Act - do whatever the SmallGoldBar wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() { 
       if (Greenfoot.mouseClicked(this)) 
        {
            Background world = (Background) getWorld();
            Counter counter = world.getCounter();
            coins.play();
            counter.add(goldValue);
            goldAccumulated += goldValue;
            getWorld().removeObject(this);
            
        }
    }
}

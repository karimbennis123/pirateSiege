import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class TutorialSmallGoldBag extends Actor
{
    private int goldValue;
    private GreenfootSound coins = new GreenfootSound("coins.wav");
    private GreenfootImage pouch = new GreenfootImage("pouchBag.png");
    public TutorialSmallGoldBag() {
        setImage(pouch);
        this.goldValue = Greenfoot.getRandomNumber(5) + 3;
    }
    /**
     * Act - do whatever the TutorialSmallGoldBag wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) 
        {
            Background2 world = (Background2) getWorld();
            Counter counter = world.getCounter();
            coins.play();
            counter.add(goldValue);
            
            getWorld().removeObject(this);
            
        }
    }
}

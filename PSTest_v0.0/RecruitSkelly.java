import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class RecruitSkelly extends Crewmen
{
    RangedUpgrade rangeUpgrade =  new  RangedUpgrade();
    ArmouredUpgrade armorUpgrade =  new  ArmouredUpgrade();
    GreenfootImage img = new GreenfootImage("RecruitSkelly_idle1.png");
    GreenfootImage img2 = new GreenfootImage("RecruitSkelly_idle1Highlighted.png");
    /**
     * 
     */
    public RecruitSkelly()
    {
        img.scale(125, 125);
        img2.scale(125,125);
        
    }

    /**
     * Act - do whatever the RecruitSkelly wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(img);
        if (Greenfoot.mouseMoved(getWorld())) {
            setImage(img);
        }
        if (Greenfoot.mouseMoved(this)) {
            setImage(img2);
        }
        if (Greenfoot.mouseClicked(this)) {
            getWorld().addObject(rangeUpgrade, getX(), getY() + 25);
            getWorld().addObject(armorUpgrade, getX(), getY() -25);
        }
    }
}

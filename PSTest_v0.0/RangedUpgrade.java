import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class RangedUpgrade extends Upgrades
{
    GreenfootSound rangedSound = new GreenfootSound("RangedSound.wav");
    /**
     * Act - do whatever the Option2_Button wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage("UpgradeRangedButton.png");
        if (Greenfoot.mouseMoved(getWorld())) {
            setImage("UpgradeRangedButton.png");
        }
        if (Greenfoot.mouseMoved(this)) {
            setImage("UpgradeRangedButtonHighlighted.png");
        }
        if (Greenfoot.mouseClicked(this)) {
            Actor intersecting = getOneIntersectingObject(RecruitSkelly.class);
            if (intersecting != null) {
                List<Upgrades> upgrades = getWorld().getObjects(Upgrades.class);
                RangedSkelly ranged =  new  RangedSkelly();
                int X = intersecting.getX();
                int Y = intersecting.getY();
                getWorld().removeObject(intersecting);
                getWorld().addObject(ranged, X, Y);
                getWorld().removeObjects(upgrades);
                rangedSound.play();
            }
        }
    }
}

import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class ArmouredUpgrade extends Upgrades
{
    GreenfootSound armourSound = new GreenfootSound("ArmouredSound.wav");
    /**
     * Act - do whatever the Option3_button wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage("UpgradeArmouredButton.png");
        if (Greenfoot.mouseMoved(getWorld())) {
            setImage("UpgradeArmouredButton.png");
        }
        if (Greenfoot.mouseMoved(this)) {
            setImage("UpgradeArmouredButtonHighlighted.png");
        }
        if (Greenfoot.mouseClicked(this)) {
            Actor intersecting = getOneIntersectingObject(RecruitSkelly.class);
            if (intersecting != null) {
                skeletonSound.play();
                armourSound.play();
                List<Upgrades> upgrades = getWorld().getObjects(Upgrades.class);
                ArmouredSkelly armored =  new  ArmouredSkelly();
                int X = intersecting.getX();
                int Y = intersecting.getY();
                getWorld().removeObject(intersecting);
                getWorld().addObject(armored, X, Y);
                getWorld().removeObjects(upgrades);
            }
        }
    }
}

// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Arrow extends RecruitSkellyButton
{

    /**
     * 
     */
    public Arrow()
    {
        GreenfootImage img = getImage();
        img.scale(50, 50);
    }

    /**
     * Act - do whatever the ArrowTest wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (getOneIntersectingObject(Crewmen.class) != null) {
            getWorld().removeObject(this);
        }
        if (Greenfoot.mouseClicked(this)) {
            skeletonSound.play();
            List<Arrow> arrows = getWorld().getObjects(Arrow.class);
            RecruitSkelly skelly1 =  new RecruitSkelly();
            getWorld().addObject(skelly1, getX(), (getY() + 60));
            getWorld().removeObjects(arrows);
        }
    }
}

import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class TutorialArrow extends Buttons
{
    private GreenfootSound skeletonSound = new GreenfootSound("SkeletonSound.wav");
    public TutorialArrow()
    {
        setImage(new GreenfootImage("pngegg.png"));
        GreenfootImage img = getImage();
        img.scale(50, 50);
    }
    /**
     * Act - do whatever the TutorialArrow wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (getOneIntersectingObject(Crewmen.class) != null) {
            getWorld().removeObject(this);
        }
        if (Greenfoot.mouseClicked(this)) {
            System.out.println("Arrow instance clicked!");
            skeletonSound.play();
            List<TutorialArrow> arrows = getWorld().getObjects(TutorialArrow.class);
            TutorialRecruitSkelly skelly1 =  new  TutorialRecruitSkelly();
            getWorld().addObject(skelly1, getX(), (getY() + 60));
            getWorld().removeObjects(arrows);
        }
    }
}

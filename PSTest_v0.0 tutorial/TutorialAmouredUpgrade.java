import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class TutorialAmouredUpgrade here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TutorialAmouredUpgrade extends Upgrades
{
    GreenfootSound armourSound = new GreenfootSound("ArmouredSound.wav");
    /**
     * Act - do whatever the TutorialAmouredUpgrade wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage("ShieldArmourScaled.png");
        if (Greenfoot.mouseMoved(getWorld())) {
            setImage("ShieldArmourHighlightedScaled.png");
        }
        if (Greenfoot.mouseMoved(this)) {
            setImage("ShieldArmourHighlightedScaled.png");
        }
        if (Greenfoot.mouseClicked(this)) {
            Actor intersecting = getOneIntersectingObject(TutorialRecruitSkelly.class);
            if (intersecting != null) {
                Background2 world = (Background2) getWorld();
                Counter counter = world.getCounter();
                counter.add(-upgradeValue);
                skeletonSound.play();
                armourSound.play();
                List<Upgrades> upgrades = getWorld().getObjects(Upgrades.class);
                TutorialAmouredSkelly armored =  new  TutorialAmouredSkelly();
                int X = intersecting.getX();
                int Y = intersecting.getY();
                getWorld().removeObject(intersecting);
                getWorld().addObject(armored, X, Y);
                getWorld().removeObjects(upgrades);
            }
        }
    }
}

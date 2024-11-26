import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class TutorialRangedUpgrade here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TutorialRangedUpgrade extends Upgrades
{
    GreenfootSound rangedSound = new GreenfootSound("RangedSound.wav");
    /**
     * Act - do whatever the TutorialRangedUpgrade wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage("FlintGunScaled_Cropped.png");
        if (Greenfoot.mouseMoved(getWorld())) {
            setImage("FlintGunScaled_Cropped.png");
        }
        if (Greenfoot.mouseMoved(this)) {
            setImage("FlintGunHighlightedCropped.png");
        }
        if (Greenfoot.mouseClicked(this)) {
            Actor intersecting = getOneIntersectingObject(TutorialRecruitSkelly.class);
            if (intersecting != null) {
                List<Upgrades> upgrades = getWorld().getObjects(Upgrades.class);
                TutorialRangedSkelly ranged =  new  TutorialRangedSkelly();
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
